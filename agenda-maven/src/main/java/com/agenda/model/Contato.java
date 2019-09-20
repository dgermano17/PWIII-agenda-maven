package com.agenda.model;

public class Contato {
	
	private long idCont;
	private String telefone,email;

	public long getIdCont() {
		return idCont;
	}
	public void setIdCont(long idCont) {
		this.idCont = idCont;
	}

	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
