package general.tienda;

public class Tienda
{
	private int		idTienda;
	private int		idUbicacion;
	private String	nombre;

	/**
	 * @return the idTienda
	 */
	public int getIdTienda()
	{
		return idTienda;
	}

	/**
	 * @param idTienda
	 *            the idTienda to set
	 */
	public void setIdTienda(int idTienda)
	{
		this.idTienda = idTienda;
	}

	/**
	 * @return the idUbicacion
	 */
	public int getIdUbicacion()
	{
		return idUbicacion;
	}

	/**
	 * @param idUbicacion
	 *            the idUbicacion to set
	 */
	public void setIdUbicacion(int idUbicacion)
	{
		this.idUbicacion = idUbicacion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + idTienda;
		result = prime * result + idUbicacion;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		Tienda other = (Tienda) obj;
		if (idTienda != other.idTienda)
			return false;
		if (idUbicacion != other.idUbicacion)
			return false;
		if (nombre == null)
		{
			if (other.nombre != null)
				return false;
		}
		else
			if (!nombre.equals(other.nombre))
				return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Tienda [idTienda=" + idTienda + ", idUbicacion=" + idUbicacion + ", nombre=" + nombre + "]";
	}

}
