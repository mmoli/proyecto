package general.tienda;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import general.producto.Producto;

public interface TiendaMapper
{
	@Results
	({
		@Result(property = "idTienda", column = "idTienda"), 
		@Result(property = "idUbicacion", column = "idUbicacion"),
		@Result(property = "nombre", column = "nombre")
	})
	@Select("SELECT idTienda, idUbicacion, nombre from tienda WHERE idTienda = #{idTienda}")
	Tienda selectTienda(int idTienda);
	
	@Select("SELECT * FROM zara.tienda")
	List<Tienda> getTiendas();
	
	@Select("SELECT * FROM zara.tienda order by idTienda desc limit 1")
	int lastInsert();

	@Insert("INSERT into tienda(idUbicacion, nombre) VALUES(#{idUbicacion}, #{nombre})")
	void insertTienda(Tienda tienda);

	@Update("UPDATE tienda SET idUbicacion = #{idUbicacion}, nombre = #{nombre} WHERE idTienda =#{idTienda}")
	void updateTienda(Tienda tienda);

	@Delete("DELETE FROM tienda WHERE idTienda =#{idTienda}")
	void deleteTienda(int idTienda);
}
