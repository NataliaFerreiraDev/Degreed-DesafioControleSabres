package model.entities;

import java.time.LocalDateTime;
import java.util.List;

public class SabreManual extends Sabres {
	
	private String modeloBotao;
	
	public SabreManual() {
		super();
	}

	public SabreManual(Integer id, Modelo modelo, LocalDateTime dataFabricacao, Situacao situacao,
			List<Manutencao> manutencoes, String jedi, String modeloBotao) {
		super(id, modelo, dataFabricacao, situacao, manutencoes, jedi);
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
