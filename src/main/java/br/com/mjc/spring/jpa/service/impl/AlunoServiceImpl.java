package br.com.mjc.spring.jpa.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mjc.spring.jpa.entity.Aluno;
import br.com.mjc.spring.jpa.entity.AvaliacaoFisica;
import br.com.mjc.spring.jpa.entity.form.AlunoDTO;
import br.com.mjc.spring.jpa.entity.form.AlunoUpdateDTO;
import br.com.mjc.spring.jpa.repository.AlunoRepository;
import br.com.mjc.spring.jpa.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService{
    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoDTO form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return repository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateDTO formUpdate) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaByAlunoId(Long id) {
        Aluno aluno = repository.findById(id).get();
        return aluno.getAvaliacoes();
    }
    
}
