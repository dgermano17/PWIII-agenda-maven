package com.agenda.model;

public class Pessoa {

	private long id;
	private String nome,sexo,dtanascimento;
	
	public String getDtanascimento() {
		return dtanascimento;
	}
	public void setDtanascimento(String dtanascimento) {
		this.dtanascimento = dtanascimento;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
