package general.tienda;

import static spark.Spark.get;

import general.GeneracionJSON;
import general.producto.ProductoDAO;

public class TiendaREST {
	public void getAllTiendas()
	{
		get("/tiendas", (req, res) ->
		{
			TiendaDAO tiendaDAO = new TiendaDAO();
			return GeneracionJSON.getJSON(tiendaDAO.getAllData());
		});
	}
}
