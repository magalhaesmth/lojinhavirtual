package com.dev.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.backend.entity.Pessoa;
import com.dev.backend.service.PessoaService;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {
    
    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/")
    @CrossOrigin("http://localhost:3000")
    public List<Pessoa> buscarTodos(){
        return pessoaService.buscarTodos();
    }

    @PostMapping("/")
    @CrossOrigin("http://localhost:3000")
    public Pessoa inserir(@RequestBody Pessoa pessoa){
        return pessoaService.inserir(pessoa);
    }

    @PutMapping("/")
    @CrossOrigin("http://localhost:3000")
    public Pessoa alterar(@RequestBody Pessoa pessoa){
        return pessoaService.alterar(pessoa);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin("http://localhost:3000")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        pessoaService.excluir(id);
        return ResponseEntity.ok().build();
    }
}