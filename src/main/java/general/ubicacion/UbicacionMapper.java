package general.ubicacion;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import general.tipo.Tipo;

public interface UbicacionMapper
{
	@Results
	({
		@Result(property = "idUbicacion", column = "idUbicacion"), 
		@Result(property = "ciudad", column = "ciudad"),
		@Result(property = "direccion", column = "direccion")
	})
	@Select("SELECT idUbicacion, ciudad, direccion FROM zara.ubicacion WHERE idUbicacion = #{idUbicacion}")
	Ubicacion selectUbicacion(int idUbicacion);
	
	@Select("SELECT * FROM zara.ubicacion")
	List<Ubicacion> getUbicaciones();
	
	@Select("SELECT * FROM zara.ubicacion order by idUbicacion desc limit 1")
	int lastInsert();

	@Insert("INSERT INTO ubicacion(ciudad, direccion) VALUES (#{ciudad}, #{direccion})")
	void insertUbicacion(Ubicacion ubicacion);

	@Update("UPDATE ubicacion SET ciudad = #{ciudad}, direccion = #{direccion}} WHERE idUbicacion =#{idUbicacion}")
	void updateUbicacion(Ubicacion ubicacion);

	@Delete("DELETE FROM zara.ubicacion WHERE idUbicacion =#{idUbicacion}")
	void deleteUbicacion(int idUbicacion);
}
