package general.tienda;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import general.MyBatisUtil;
import general.producto.Producto;
import general.producto.ProductoMapper;

public class TiendaDAO
{
	public int save(Tienda tienda)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TiendaMapper mapper = session.getMapper(TiendaMapper.class);
		mapper.insertTienda(tienda);
		session.commit();
		int id = mapper.lastInsert();
		session.close();
		return id;
	}

	public void update(Tienda tienda)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TiendaMapper mapper = session.getMapper(TiendaMapper.class);
		mapper.updateTienda(tienda);
		session.commit();
		session.close();
	}

	public void delete(Integer idTienda)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TiendaMapper mapper = session.getMapper(TiendaMapper.class);
		mapper.deleteTienda(idTienda);
		session.commit();
		session.close();
	}

	public Tienda getData(Integer idTienda)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TiendaMapper mapper = session.getMapper(TiendaMapper.class);
		Tienda tienda = mapper.selectTienda(idTienda);
		session.close();
		return tienda;
	}
	
	public List<Tienda> getAllData() {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  TiendaMapper mapper = session.getMapper(TiendaMapper.class);
		  List<Tienda> tiendas = mapper.getTiendas();
		  session.close();
		  return tiendas;
	}
}
