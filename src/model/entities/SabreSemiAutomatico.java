package model.entities;

import java.time.LocalDateTime;
import java.util.List;

public class SabreSemiAutomatico extends Sabres {
	
	private List<GalaxiasManutencoes> listaGalaxiasManutencoes;
	
	public SabreSemiAutomatico() {
		super();
	}

	public SabreSemiAutomatico(Integer id, Modelo modelo, LocalDateTime dataFabricacao, Situacao situacao,
			List<Manutencao> manutencoes, String jedi, List<GalaxiasManutencoes> listaGalaxiasManutencoes) {
		super(id, modelo, dataFabricacao, situacao, manutencoes, jedi);
		modelo = Modelo.SEMIAUTOMATICO;
		this.listaGalaxiasManutencoes = listaGalaxiasManutencoes;
	}

	public List<GalaxiasManutencoes> getListaGalaxiasManutencoes() {
		return listaGalaxiasManutencoes;
	}

	public void setListaGalaxiasManutencoes(List<GalaxiasManutencoes> listaGalaxiasManutencoes) {
		this.listaGalaxiasManutencoes = listaGalaxiasManutencoes;
	}
	
}
