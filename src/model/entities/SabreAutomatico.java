package model.entities;

import java.time.LocalDateTime;
import java.util.List;

public class SabreAutomatico extends Sabres {
	
	private String modeloSensor;
	private LocalDateTime validadeSensor;
	
	public SabreAutomatico() {
		super();
	}

	public SabreAutomatico(Integer id, Modelo modelo, LocalDateTime dataFabricacao, Situacao situacao,
			List<Manutencao> manutencoes, String jedi, String modeloSensor, LocalDateTime validadeSensor) {
		super(id, modelo, dataFabricacao, situacao, manutencoes, jedi);
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

	public LocalDateTime getValidadeSensor() {
		return validadeSensor;
	}

	public void setDataValidadeSensor(LocalDateTime validadeSensor) {
		this.validadeSensor = validadeSensor;
	}
	
}
