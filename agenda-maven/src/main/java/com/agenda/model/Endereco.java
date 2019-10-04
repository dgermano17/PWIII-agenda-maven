package com.agenda.model;

public class Endereco {
	
	private long idEnd;
	private String logradouro,cep;

	public long getIdEnd() {
		return idEnd;
	}
	public void setIdEnd(long idEnd) {
		this.idEnd = idEnd;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

}
