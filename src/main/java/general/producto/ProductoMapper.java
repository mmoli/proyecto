package general.producto;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ProductoMapper
{
	@Results
	({
		@Result(property = "idProducto", column = "idProducto"), 
		@Result(property = "idTienda", column = "idTienda"),
		@Result(property = "idTipo", column = "idTipo"), 
		@Result(property = "precio", column = "precio")
	})
		
	@Select("SELECT idProducto, idTienda, idTipo, precio from producto WHERE idProducto = #{idProducto}")
	Producto selectProducto(int idProducto);
	
	@Select("SELECT * FROM zara.producto")
	List<Producto> getProductos();

	@Select("SELECT * FROM zara.producto order by idProducto desc limit 1")
	int lastInsert();

	@Insert("INSERT into producto(idTienda, idTipo, precio) VALUES(#{idTienda}, #{idTipo}, #{precio})")
	void insertProducto(Producto producto);

	@Update("UPDATE producto SET idTienda = #{idTienda}, idTipo = #{idTipo}, precio = #{precio} WHERE idProducto =#{idProducto}")
	void updateProducto(Producto producto);

	@Delete("DELETE FROM zara.producto WHERE idProducto =#{idProducto}")
	void deleteProducto(int idProducto);
}
