package general.ubicacion;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import general.MyBatisUtil;
import general.tipo.Tipo;
import general.tipo.TipoMapper;

public class UbicacionDAO
{
	public int save(Ubicacion ubicacion)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UbicacionMapper mapper = session.getMapper(UbicacionMapper.class);
		mapper.insertUbicacion(ubicacion);
		session.commit();
		int id = mapper.lastInsert();
		session.close();
		return id;
	}

	public void update(Ubicacion ubicacion)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UbicacionMapper mapper = session.getMapper(UbicacionMapper.class);
		mapper.updateUbicacion(ubicacion);
		session.commit();
		session.close();
	}

	public void delete(Integer idUbicacion)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UbicacionMapper mapper = session.getMapper(UbicacionMapper.class);
		mapper.deleteUbicacion(idUbicacion);
		session.commit();
		session.close();
	}

	public Ubicacion getData(Integer idUbicacion)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UbicacionMapper mapper = session.getMapper(UbicacionMapper.class);
		Ubicacion ubicacion = mapper.selectUbicacion(idUbicacion);
		session.close();
		return ubicacion;
	}
	
	public List<Ubicacion> getAllData() {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  UbicacionMapper mapper = session.getMapper(UbicacionMapper.class);
		  List<Ubicacion> ubicaciones = mapper.getUbicaciones();
		  session.close();
		  return ubicaciones;
	}
}
