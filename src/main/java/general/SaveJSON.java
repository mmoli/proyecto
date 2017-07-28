package general;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import general.producto.Producto;

public class SaveJSON
{
	public static void saveProductos(List<Producto> productos)
	{
		try (Writer writer = new FileWriter("Productos.json")) {
			Gson prettyJSON = new GsonBuilder().setPrettyPrinting().create();
			prettyJSON.toJson(productos, writer);
		}
		catch(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
