package com.api.testeselecao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.testeselecao.model.Pessoa;
import com.api.testeselecao.resource.repository.pessoa.PessoaRepositoryQuery;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {

}
