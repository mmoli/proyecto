package general;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import general.producto.Producto;

public class GeneracionJSON
{
	public static <T> String getJSON(List<T> elementos)
	{
			Gson prettyJSON = new GsonBuilder().setPrettyPrinting().create();
			return prettyJSON.toJson(elementos);
	}
	
	public static <T> void saveJSON(List<T> elementos, String jsonName)
	{
		try (Writer writer = new FileWriter(jsonName)) {
			Gson prettyJSON = new GsonBuilder().setPrettyPrinting().create();
			prettyJSON.toJson(elementos, writer);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
