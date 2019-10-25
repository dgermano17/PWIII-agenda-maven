package com.agenda.service;

import java.util.List;
import com.agenda.dao.EnderecoDAO;
import com.agenda.model.Endereco;

public class CadastraEndService {
	
	private EnderecoDAO edao;
	
	public CadastraEndService() {
		this.edao = new EnderecoDAO();
	}
	
	public void salvarOuAtualizarEnd(Endereco endereco) {

		if (endereco.getIdEnd() == 0) {
			this.edao.cadastrar(endereco);
		} else {
			this.edao.aterarEnd(endereco);
		}
	}
	
	public List<Endereco> buscarEnds(){
		return this.edao.buscarEnd();
	}
	
	public void removerEnd(Endereco enderenco) {
		this.edao.removerEnd(enderenco);
	}

}
