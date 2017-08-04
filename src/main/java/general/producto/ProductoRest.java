package general.producto;

import general.SaveJSON;
import static spark.Spark.get;

public class ProductoRest
{
	public void getAllProductos()
	{
		get("/productos", (req, res) ->
		{
			ProductoDAO productoDAO = new ProductoDAO();
			return SaveJSON.getJSON(productoDAO.getAllData());
		});
	}
}
