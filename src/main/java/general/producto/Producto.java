package general.producto;

import java.math.BigDecimal;

public class Producto
{
	private int idProducto;
	private int idTienda;
	private int idTipo;
	private BigDecimal precio;
	/**
	 * @return the idProducto
	 */
	public int getIdProducto()
	{
		return idProducto;
	}
	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(int idProducto)
	{
		this.idProducto = idProducto;
	}
	/**
	 * @return the idTienda
	 */
	public int getIdTienda()
	{
		return idTienda;
	}
	/**
	 * @param idTienda the idTienda to set
	 */
	public void setIdTienda(int idTienda)
	{
		this.idTienda = idTienda;
	}
	/**
	 * @return the idTipo
	 */
	public int getIdTipo()
	{
		return idTipo;
	}
	/**
	 * @param idTipo the idTipo to set
	 */
	public void setIdTipo(int idTipo)
	{
		this.idTipo = idTipo;
	}
	/**
	 * @return the precio
	 */
	public BigDecimal getPrecio()
	{
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(BigDecimal precio)
	{
		this.precio = precio;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + idProducto;
		result = prime * result + idTienda;
		result = prime * result + idTipo;
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (idProducto != other.idProducto)
			return false;
		if (idTienda != other.idTienda)
			return false;
		if (idTipo != other.idTipo)
			return false;
		if (precio == null)
		{
			if (other.precio != null)
				return false;
		}
		else
			if (!precio.equals(other.precio))
				return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Producto [idProducto=" + idProducto + ", idTienda=" + idTienda + ", idTipo=" + idTipo + ", precio="
				+ precio + "]";
	}

	
}
