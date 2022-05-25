package model.entities;

import java.time.LocalDateTime;

public class Manutencao {
	
	private Integer idManutencao;
	private LocalDateTime dataManutencao;
	private String responsavel;
	
	public Manutencao() {
	}

	public Manutencao(Integer idManutencao, LocalDateTime dataManutencao, String responsavel) {
		this.idManutencao = idManutencao;
		this.dataManutencao = dataManutencao;
		this.responsavel = responsavel;
	}

	public Integer getIdManutencao() {
		return idManutencao;
	}
	
	public void setIdManutencao(Integer idManutencao) {
		this.idManutencao = idManutencao;
	}
	
	public LocalDateTime getDataManutencao() {
		return dataManutencao;
	}
	
	public void setDataManutencao(LocalDateTime dataManutencao) {
		this.dataManutencao = dataManutencao;
	}
	
	public String getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

}
