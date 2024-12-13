package io.vitoriasaldanha22.primeiroprojeto.service;

import io.vitoriasaldanha22.primeiroprojeto.entity.Pessoa;

import java.util.List;

public interface PessoaService {

    void create(Pessoa pessoa);

    List<Pessoa> read(String nome);

    void update(Pessoa pessoa);





}
