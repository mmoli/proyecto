package general.producto;

import general.GeneracionJSON;
import static spark.Spark.get;

public class ProductoREST
{
	public void getAllProductos()
	{
		get("/productos", (req, res) ->
		{
			ProductoDAO productoDAO = new ProductoDAO();
			return GeneracionJSON.getJSON(productoDAO.getAllData());
		});
	}
}
