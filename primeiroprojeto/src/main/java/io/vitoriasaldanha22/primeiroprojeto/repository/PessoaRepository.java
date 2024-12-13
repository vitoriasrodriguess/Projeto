package io.vitoriasaldanha22.primeiroprojeto.repository;

// implementação

import io.vitoriasaldanha22.primeiroprojeto.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


// repository é aonde faz a relação com o banco

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,String> {

    @Query("select * from pessoa p where upper(p.nome) like upper('%:nome%')")
    List<Pessoa> read(@Param("nome") String nome);

}
