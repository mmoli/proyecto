package general;

import java.math.BigDecimal;

import general.producto.Producto;
import general.producto.ProductoDAO;
import general.producto.ProductoREST;
import general.tienda.Tienda;
import general.tienda.TiendaDAO;
import general.tipo.Tipo;
import general.tipo.TipoDAO;
import general.ubicacion.Ubicacion;
import general.ubicacion.UbicacionDAO;

public class WebService
{
	public static void main(String[] args)
	{	
		ElementosREST elementos = new ElementosREST();
		elementos.getAll();

	}
}
