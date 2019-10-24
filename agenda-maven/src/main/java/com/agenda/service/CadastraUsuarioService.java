package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDAO;
import com.agenda.model.Pessoa;

public class CadastraUsuarioService {

	private PessoaDAO pdao;

	public CadastraUsuarioService() {
		this.pdao = new PessoaDAO();
	}

	public void salvarOuAtualizar(Pessoa pessoa) {

		if (pessoa.getId() == 0) {
			this.pdao.cadastrar(pessoa);
		} else {
			this.pdao.alterar(pessoa);
		}
	}

	public List<Pessoa> buscaPessoas() {
		return this.pdao.buscarPessoas();
	}

	public void remover(Pessoa pessoa) {
		this.pdao.remover(pessoa);
	}

}
