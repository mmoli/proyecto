package general.tipo;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import general.tienda.Tienda;

public interface TipoMapper
{
	@Results
	({
		@Result(property = "idTipo", column = "idTipo"), 
		@Result(property = "nombreTipo", column = "nombreTipo")
	})
	@Select("SELECT idTipo, nombreTipo from tipo WHERE idTipo = #{idTipo}")
	Tipo selectTipo(int idTipo);
	
	@Select("SELECT * FROM zara.tipo")
	List<Tipo> getTipos();
	
	@Select("SELECT * FROM zara.tipo order by idTipo desc limit 1")
	int lastInsert();

	@Insert("INSERT into tipo(nombreTipo) VALUES( #{nombreTipo})")
	void insertTipo(Tipo tipo);

	@Update("UPDATE tipo SET idTipo = #{idTipo}, nombreTipo = #{nombreTipo}} WHERE  idTipo = #{idTipo}")
	void updateTipo(Tipo tipo);

	@Delete("DELETE FROM tipo WHERE idTipo =#{idTipo}")
	void deleteTipo(int idTipo);
}
