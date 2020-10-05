package api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Util
{
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
}
