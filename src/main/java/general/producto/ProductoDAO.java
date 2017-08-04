package general.producto;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import general.MyBatisUtil;

public class ProductoDAO {
	
	public int save(Producto producto){
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  ProductoMapper mapper = session.getMapper(ProductoMapper.class);
	  mapper.insertProducto(producto);
	  session.commit();
	  int id = mapper.lastInsert();
	  session.close();
	  return id;
	}
	
	public void update(Producto producto){
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  ProductoMapper mapper = session.getMapper(ProductoMapper.class);
	  mapper.updateProducto(producto);
	  session.commit();
	  session.close();
	}
	
	public void delete(Integer idProducto){
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  ProductoMapper mapper = session.getMapper(ProductoMapper.class);
	  mapper.deleteProducto(idProducto);
	  session.commit();
	  session.close();
	}
	
	public Producto getData(Integer idProducto) {
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  ProductoMapper mapper = session.getMapper(ProductoMapper.class);
	  Producto producto = mapper.selectProducto(idProducto);
	  session.close();
	  return producto;
	}
	
	public List<Producto> getAllData() {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  ProductoMapper mapper = session.getMapper(ProductoMapper.class);
		  List<Producto> productos = mapper.getProductos();
		  session.close();
		  return productos;
	}
}
