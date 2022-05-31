package model.entities;

import java.text.ParseException;
import java.util.Date;

public class SabreSemiAutomatico extends Sabres {
	
	private String sistema;
	
	private String galaxia;
	
	public SabreSemiAutomatico() throws ParseException {
		super();
	}
	
	public SabreSemiAutomatico(Integer id, Modelo modelo, Date dataFabricacao, Situacao situacao, String jedi,
			String sistema, String galaxia) throws ParseException {
		super(id, modelo, dataFabricacao, situacao, jedi);
		modelo = Modelo.SEMIAUTOMATICO;
		this.sistema = sistema;
		this.galaxia = galaxia;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getGalaxia() {
		return galaxia;
	}

	public void setGalaxia(String galaxia) {
		this.galaxia = galaxia;
	}
	
}
