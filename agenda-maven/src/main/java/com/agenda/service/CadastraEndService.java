package com.agenda.service;

import com.agenda.dao.EnderecoDAO;
import com.agenda.model.Endereco;

public class CadastraEndService {
	
	private EnderecoDAO edao;
	
	public CadastraEndService() {
		this.edao = new EnderecoDAO();
	}
	
	public void salvarOuAtualizar(Endereco endereco) {

		if (endereco.getIdEnd() == 0) {
			this.edao.cadastrar(endereco);
		} else {
			this.edao.aterarEnd(endereco);
		}
	}

}
