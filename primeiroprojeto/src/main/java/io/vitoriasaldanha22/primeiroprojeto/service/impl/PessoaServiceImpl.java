package io.vitoriasaldanha22.primeiroprojeto.service.impl;

import io.vitoriasaldanha22.primeiroprojeto.entity.Pessoa;
import io.vitoriasaldanha22.primeiroprojeto.repository.PessoaRepository;
import io.vitoriasaldanha22.primeiroprojeto.service.PessoaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository repository;

    public PessoaServiceImpl(PessoaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(Pessoa pessoa) {
        repository.save(pessoa);
    }

    @Override
    public List<Pessoa> read(String nome) {
        return repository.read(nome);
    }

    @Override
    public void update(Pessoa pessoa) {
       Pessoa pessoa1 = repository.findById(pessoa.getId()).get();

       if (pessoa.getCpf() != null && !pessoa.getCpf().equals(pessoa1.getCpf())) {
         pessoa1.setCpf(pessoa.getCpf());
       }



       if(pessoa.getNome() != null && pessoa.getNome().equals(pessoa1.getNome())) {
           pessoa1.setNome(pessoa.getNome());
       }

      if(pessoa.getDataNasc() != null && pessoa.getDataNasc().equals(pessoa1.getDataNasc())) {


      }



    }
}
