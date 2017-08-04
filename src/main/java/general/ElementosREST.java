package general;

import static spark.Spark.get;

import general.producto.ProductoDAO;
import general.producto.ProductoREST;
import general.tienda.TiendaDAO;
import general.tienda.TiendaREST;
import general.tipo.TipoDAO;
import general.tipo.TipoREST;
import general.ubicacion.UbicacionDAO;
import general.ubicacion.UbicacionREST;

public class ElementosREST {
	
	private ProductoREST productoREST;
	private TiendaREST tiendaREST;
	private TipoREST tipoREST;
	private UbicacionREST ubicationREST;
	
	
	public ElementosREST() {
		productoREST = new ProductoREST();
		tiendaREST = new TiendaREST();
		tipoREST = new TipoREST();
		ubicationREST = new UbicacionREST();
	}


	public void getAll() {
		
//		get("/productos", (req, res) ->
//		{
//			ProductoDAO productoDAO = new ProductoDAO();
//			return SaveJSON.getJSON(productoDAO.getAllData());
//		});
//		
//		get("/tiendas", (req, res) ->
//		{
//			TiendaDAO tiendaDAO = new TiendaDAO();
//			return SaveJSON.getJSON(tiendaDAO.getAllData());
//		});
//		
//		get("/tipos", (req, res) ->
//		{
//			TipoDAO tipoDAO = new TipoDAO();
//			return SaveJSON.getJSON(tipoDAO.getAllData());
//		});
//		
//		get("/ubicaciones", (req, res) ->
//		{
//			UbicacionDAO ubicacionDAO = new UbicacionDAO();
//			return SaveJSON.getJSON(ubicacionDAO.getAllData());
//		});
		
		productoREST.getAllProductos();
		tiendaREST.getAllTiendas();
		tipoREST.getAllTipos();
		ubicationREST.getAllUbicaciones();
	}
}
