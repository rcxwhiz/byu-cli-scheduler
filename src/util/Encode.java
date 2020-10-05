package util;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Encode
{
	private static final Gson gson = new Gson();

	public static JsonObject stringToJson(String string)
	{
		return JsonParser.parseString(string).getAsJsonObject();
	}

	public static JsonObject responseToJson(URL url) throws IOException
	{
		Scanner scanner = new Scanner(url.openStream());
		StringBuilder sb = new StringBuilder();
		while (scanner.hasNext())
			sb.append(scanner.nextLine());
		String response = sb.toString();
		return stringToJson(response);
	}

	public static String encode(Object object)
	{
		return gson.toJson(object);
	}

	public static Object decode(String string, Class<?> outClass)
	{
		return gson.fromJson(string, outClass);
	}

	public static Object decodeFile(String fileName, Class<?> outClass)
	{
		File file = new File(fileName);
		try (FileReader fileReader = new FileReader(file))
		{
			return gson.fromJson(fileReader, outClass);
		}
		catch (IOException e)
		{
			System.out.println("Encode Error");
			System.out.println(Arrays.toString(e.getStackTrace()));
			System.out.println(e.getMessage());
			return null;
		}
	}

	public static void writeString(String string, OutputStream oStream) throws IOException
	{
		OutputStreamWriter writer = new OutputStreamWriter(oStream);
		writer.write(string);
		writer.flush();
	}

	public static String readString(InputStream iStream) throws IOException
	{
		StringBuilder builder = new StringBuilder();
		InputStreamReader reader = new InputStreamReader(iStream);

		char[] buffer = new char[1024];
		int i;
		while ((i = reader.read(buffer)) > 0)
		{
			builder.append(buffer, 0, i);
		}

		return builder.toString();
	}
}
