package br.com.mjc.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mjc.spring.jpa.entity.Aluno;
import br.com.mjc.spring.jpa.entity.AvaliacaoFisica;
import br.com.mjc.spring.jpa.entity.form.AlunoDTO;
import br.com.mjc.spring.jpa.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;    

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoDTO form){
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List <AvaliacaoFisica> getAllAvaliacaoFisicaByAlunoId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaByAlunoId(id);
    }
}
