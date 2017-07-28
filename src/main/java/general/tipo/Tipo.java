package general.tipo;

public class Tipo
{
	private int		idTipo;
	private String	nombreTipo;

	public Tipo()
	{
		
	}
	
	public Tipo(int idTipo, String nombreTipo)
	{

		this.idTipo = idTipo;
		this.nombreTipo = nombreTipo;
	}
	
	public int getIdTipo()
	{
		return idTipo;
	}

	public void setIdTipo(int idTipo)
	{
		this.idTipo = idTipo;
	}

	public String getNombreTipo()
	{
		return nombreTipo;
	}

	public void setNombreTipo(String nombreTipo)
	{
		this.nombreTipo = nombreTipo;
	}

	@Override
	public String toString()
	{
		return "Tipo [idTipo=" + idTipo + ", nombreTipo=" + nombreTipo + "]";
	}

}