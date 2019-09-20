package com.agenda.model;

public class Endereco {
	
	private long idEnd;
	private String endereco,cep;

	public long getIdEnd() {
		return idEnd;
	}
	public void setIdEnd(long idEnd) {
		this.idEnd = idEnd;
	}

	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
}
