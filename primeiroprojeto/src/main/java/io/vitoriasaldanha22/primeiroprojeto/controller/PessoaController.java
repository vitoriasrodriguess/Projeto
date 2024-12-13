package io.vitoriasaldanha22.primeiroprojeto.controller;

import io.vitoriasaldanha22.primeiroprojeto.entity.Pessoa;
import org.springframework.web.bind.annotation.*;

@RestController   //defini as apis , implementar a api
@RequestMapping("/api/pessoa")
public class PessoaController {

    @PostMapping("/create") // localhost api/pessoa/create
    public void create(@RequestBody String nome) {


    }

    @GetMapping("/read/{nome}")
    public String read(@PathVariable(value = "nome") String nome )  {
        return "nome: " + nome;
    }

    @PutMapping("/update")
    public void update(@RequestBody Pessoa pessoa) {

    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id") String id) {

    }

}
