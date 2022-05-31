package model.entities;

import java.text.ParseException;
import java.util.Date;

public class SabreAutomatico extends Sabres {
	
	private String modeloSensor;
	private Date validadeSensor;
	
	public SabreAutomatico() throws ParseException {
		super();
	}

	public SabreAutomatico(Integer id, Modelo modelo, Date dataFabricacao, Situacao situacao, String jedi, String modeloSensor, Date validadeSensor) throws ParseException {
		super(id, modelo, dataFabricacao, situacao, jedi);
		modelo = Modelo.AUTOMATICO;
		this.modeloSensor = modeloSensor;
		this.validadeSensor = validadeSensor;
	}

	public String getModeloSensor() {
		return modeloSensor;
	}

	public void setModeloSensorDestrava(String modeloSensor) {
		this.modeloSensor = modeloSensor;
	}

	public Date getValidadeSensor() {
		return validadeSensor;
	}

	public void setDataValidadeSensor(Date validadeSensor) {
		this.validadeSensor = validadeSensor;
	}
	
}
