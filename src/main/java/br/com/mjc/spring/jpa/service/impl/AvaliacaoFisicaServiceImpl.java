package br.com.mjc.spring.jpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mjc.spring.jpa.entity.Aluno;
import br.com.mjc.spring.jpa.entity.AvaliacaoFisica;
import br.com.mjc.spring.jpa.entity.form.AvaliacaoFisicaDTO;
import br.com.mjc.spring.jpa.entity.form.AvaliacaoFisicaUpdateDTO;
import br.com.mjc.spring.jpa.repository.AlunoRepository;
import br.com.mjc.spring.jpa.repository.AvaliacaoFisicaRepository;
import br.com.mjc.spring.jpa.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {
    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaDTO form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public AvaliacaoFisica get(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO formUpdate) {
        // TODO Auto-generated method stub
        return null;
    }

}
