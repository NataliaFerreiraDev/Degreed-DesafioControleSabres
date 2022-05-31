package model.entities;

import java.text.ParseException;
import java.util.Date;

public class SabreManual extends Sabres {
	
	private String modeloBotao;
	
	public SabreManual() throws ParseException {
		super();
	}
	
	public SabreManual(Integer id, Modelo modelo, Date dataFabricacao, Situacao situacao, String jedi, String modeloBotao) throws ParseException {
		super(id, modelo, dataFabricacao, situacao, jedi);
		modelo = Modelo.MANUAL;
		this.modeloBotao = modeloBotao;
	}

	public String getModeloBotao() {
		return modeloBotao;
	}

	public void setModeloBotao(String modeloBotao) {
		this.modeloBotao = modeloBotao;
	}
	
}
