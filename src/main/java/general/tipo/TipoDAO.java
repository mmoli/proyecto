package general.tipo;

import org.apache.ibatis.session.SqlSession;

import general.MyBatisUtil;

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
}
