package general.tipo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import general.MyBatisUtil;
import general.tienda.Tienda;
import general.tienda.TiendaMapper;

public class TipoDAO
{
	public int save(Tipo tipo)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TipoMapper mapper = session.getMapper(TipoMapper.class);
		mapper.insertTipo(tipo);
		session.commit();
		int id = mapper.lastInsert();
		session.close();
		return id;
	}

	public void update(Tipo tipo)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TipoMapper mapper = session.getMapper(TipoMapper.class);
		mapper.updateTipo(tipo);
		session.commit();
		session.close();
	}

	public void delete(Integer idTipo)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TipoMapper mapper = session.getMapper(TipoMapper.class);
		mapper.deleteTipo(idTipo);
		session.commit();
		session.close();
	}

	public Tipo getData(Integer idTipo)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TipoMapper mapper = session.getMapper(TipoMapper.class);
		Tipo tipo = mapper.selectTipo(idTipo);
		session.close();
		return tipo;
	}
	
	public List<Tipo> getAllData() {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  TipoMapper mapper = session.getMapper(TipoMapper.class);
		  List<Tipo> tipos = mapper.getTipos();
		  session.close();
		  return tipos;
	}
}
