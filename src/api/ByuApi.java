package api;

import com.google.gson.JsonObject;
import model.Semester;
import model.SemesterYear;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import static util.Encode.responseToJson;

public class ByuApi
{
	private static final String semesterApi = "http://saasta.byu.edu/noauth/classSchedule/ajax/getYeartermData.php";
	private static final String coursesApi = "http://saasta.byu.edu/noauth/classSchedule/ajax/getClasses.php";
	private static final String sectionsApi = "http://saasta.byu.edu/noauth/classSchedule/ajax/getSections.php";
	private static final char[] idChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
	private static final int idLength = 20;

	private static String generateId()
	{
		StringBuilder sb = new StringBuilder(idLength);
		Random random = new Random();
		for (int i = 0; i < idLength; i++)
			sb.append(idChars[random.nextInt(idChars.length)]);
		return sb.toString();
	}

	public Semester getSemester(SemesterYear semesterYear)
	{
		try
		{
			String sessionId = generateId();
			URL semesterUrl = new URL(sectionsApi);
			HttpURLConnection conn = (HttpURLConnection) semesterUrl.openConnection();
			conn.setRequestMethod("GET");
			byte[] formData = ("\"yearterm\": " + semesterYear.getYearTerm()).getBytes();
			OutputStream out = new BufferedOutputStream(conn.getOutputStream());
			out.write(formData);
			out.close();
			conn.connect();

			if (conn.getResponseCode() != HttpURLConnection.HTTP_OK)
				throw new IOException();

			JsonObject semesterResponse = responseToJson(semesterUrl);
		}
		catch (IOException e)
		{
			System.out.println("Exception getting semster " + e.toString());
			return new Semester(semesterYear);
		}
	}
}
