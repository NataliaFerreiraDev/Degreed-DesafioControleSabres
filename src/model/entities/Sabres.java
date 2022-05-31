package model.entities;

import java.text.ParseException;
import java.util.Date;

public abstract class Sabres {

	private Integer id;
	private Modelo modelo;
	private Date dataFabricacao;
	private Situacao situacao;
	private String jedi;
	
	public Sabres() throws ParseException {
	}

	public Sabres(Integer id, Modelo modelo, Date dataFabricacao, Situacao situacao, String jedi) throws ParseException {
		super();
		this.id = id;
		this.modelo = modelo;
		this.dataFabricacao = dataFabricacao;
		this.situacao = situacao;
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

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public String getJedi() {
		return jedi;
	}

	public void setJedi(String jedi) {
		this.jedi = jedi;
	}

}
