package general;

import java.math.BigDecimal;

import general.producto.Producto;
import general.producto.ProductoDAO;
import general.producto.ProductoRest;
import general.tienda.Tienda;
import general.tienda.TiendaDAO;
import general.tipo.Tipo;
import general.tipo.TipoDAO;
import general.ubicacion.Ubicacion;
import general.ubicacion.UbicacionDAO;

public class RunMybatis
{
	public static void main(String[] args)
	{	
		/*TipoDAO tipoDAO = new TipoDAO();
		Tipo tipo = new Tipo();
		tipo.setNombreTipo("Chanclas");
		int idTipo = tipoDAO.save(tipo);
		System.out.println("---Data saved---");
		
		UbicacionDAO ubicacionDAO = new UbicacionDAO();
		Ubicacion ubicacion = new Ubicacion();
		ubicacion.setCiudad("Madrid");
		ubicacion.setDireccion("Plaza Puerta del Sol 1");
		int idUbicacion = ubicacionDAO.save(ubicacion);
		System.out.println("---Data saved---");
		
		TiendaDAO tiendaDAO = new TiendaDAO();
		Tienda tienda = new Tienda();
		tienda.setIdUbicacion(idUbicacion);
		tienda.setNombre("Zara Home");
		int idTienda = tiendaDAO.save(tienda);
		System.out.println("---Data saved---");
		
		ProductoDAO productoDAO = new ProductoDAO();
		Producto producto = new Producto();
		producto.setIdTienda(idTienda);
		producto.setIdTipo(idTipo);
		producto.setPrecio(new BigDecimal("19.99"));
		int id = productoDAO.save(producto);
		System.out.println("---Data saved---");

		// update
		producto = new Producto();
		producto.setIdProducto(id);
		producto.setIdTienda(3);
		producto.setIdTipo(2);
		producto.setPrecio(new BigDecimal("60"));
		productoDAO.update(producto);
		System.out.println("---Data updated---");
		// select
		producto = productoDAO.getData(id);
		System.out.println(producto.toString());
		// delete
		productoDAO.delete(id);
		System.out.println("---Data deleted---");*/
		
		ProductoRest rest = new ProductoRest();
		rest.getAllProductos();
		//SaveJSON.saveJSON(productoDAO.getAllData(), "Productos.json");
	}
}
