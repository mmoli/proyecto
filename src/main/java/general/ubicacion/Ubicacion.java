package general.ubicacion;

public class Ubicacion
{
	private int		idUbicacion;
	private String	ciudad;
	private String	direccion;

	public Ubicacion()
	{
		
	}
	
	public int getIdUbicacion()
	{
		return idUbicacion;
	}

	public void setIdUbicacion(int idUbicacion)
	{
		this.idUbicacion = idUbicacion;
	}

	public String getCiudad()
	{
		return ciudad;
	}

	public void setCiudad(String ciudad)
	{
		this.ciudad = ciudad;
	}

	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + idUbicacion;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ubicacion other = (Ubicacion) obj;
		if (ciudad == null)
		{
			if (other.ciudad != null)
				return false;
		}
		else
			if (!ciudad.equals(other.ciudad))
				return false;
		if (direccion == null)
		{
			if (other.direccion != null)
				return false;
		}
		else
			if (!direccion.equals(other.direccion))
				return false;
		if (idUbicacion != other.idUbicacion)
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Ubicacion [idUbicacion=" + idUbicacion + ", ciudad=" + ciudad + ", direccion=" + direccion + "]";
	}
}
