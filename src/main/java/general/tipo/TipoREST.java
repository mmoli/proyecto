package general.tipo;

import static spark.Spark.get;

import general.GeneracionJSON;

public class TipoREST {
	public void getAllTipos() {
		get("/tipos", (req, res) ->
		{
			TipoDAO tipoDAO = new TipoDAO();
			return GeneracionJSON.getJSON(tipoDAO.getAllData());
		});
	}
}
