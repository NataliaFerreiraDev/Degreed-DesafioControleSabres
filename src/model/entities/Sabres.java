package model.entities;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Sabres {

	private Integer id;
	private Modelo modelo;
	private LocalDateTime dataFabricacao;
	private Situacao situacao;
	private List<Manutencao> manutencoes;
	private String jedi;
	
	public Sabres() {
	}

	public Sabres(Integer id, Modelo modelo, LocalDateTime dataFabricacao, Situacao situacao,
			List<Manutencao> manutencoes, String jedi) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.dataFabricacao = dataFabricacao;
		this.situacao = situacao;
		this.manutencoes = manutencoes;
		this.jedi = jedi;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public LocalDateTime getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDateTime dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public List<Manutencao> getManutencoes() {
		return manutencoes;
	}

	public void setManutencoes(List<Manutencao> manutencoes) {
		this.manutencoes = manutencoes;
	}

	public String getJedi() {
		return jedi;
	}

	public void setJedi(String jedi) {
		this.jedi = jedi;
	}

}
