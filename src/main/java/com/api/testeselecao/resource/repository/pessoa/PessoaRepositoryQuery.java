package com.api.testeselecao.resource.repository.pessoa;

import java.util.List;

import com.api.testeselecao.model.Pessoa;
import com.api.testeselecao.resource.repository.filter.PessoaFilter;

public interface PessoaRepositoryQuery {
	
	public List<Pessoa> filtrar(PessoaFilter pessoaFilter);

}
