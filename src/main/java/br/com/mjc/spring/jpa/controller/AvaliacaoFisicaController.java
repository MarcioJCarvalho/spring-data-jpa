package br.com.mjc.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.mjc.spring.jpa.entity.AvaliacaoFisica;
import br.com.mjc.spring.jpa.entity.form.AvaliacaoFisicaDTO;
import br.com.mjc.spring.jpa.service.impl.AvaliacaoFisicaServiceImpl;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;
    
    @GetMapping
    public List<AvaliacaoFisica> getAll(){
        return service.getAll();
    }

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaDTO form) {
        return service.create(form);
    }
}
