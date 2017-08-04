package general.ubicacion;

import static spark.Spark.get;

import general.GeneracionJSON;

public class UbicacionREST {
	public void getAllUbicaciones() {
		get("/ubicaciones", (req, res) ->
		{
			UbicacionDAO ubicacionDAO = new UbicacionDAO();
			return GeneracionJSON.getJSON(ubicacionDAO.getAllData());
		});
	}
}
