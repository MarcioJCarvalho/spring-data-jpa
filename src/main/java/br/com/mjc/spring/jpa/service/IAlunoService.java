package br.com.mjc.spring.jpa.service;

import java.util.List;
import br.com.mjc.spring.jpa.entity.Aluno;
import br.com.mjc.spring.jpa.entity.AvaliacaoFisica;
import br.com.mjc.spring.jpa.entity.form.AlunoDTO;
import br.com.mjc.spring.jpa.entity.form.AlunoUpdateDTO;

public interface IAlunoService {
    /**
     * Cria aluno e salva no banco de dados.
     * @param form - formulário referente aos dados para criação de um aluno no banco de dados.
     * @return - Aluno recém-criado.
     */
    Aluno create(AlunoDTO form);

    /**
     * Retorna um aluno que está no banco de dados de acordo com seu id.
     * @param id - id do aluno que será exibido.
     * @return Aluno de acordo com id fornecedo.
     */
    Aluno get(Long id);

    /**
     * Retorna todos os aslunos que estão no banco de dados.
     * @return - uma lista os Alunos que estão salvos no DB.
     */
    List<Aluno> getAll();

    /**
     * Atualiza aluno.
     * @param id - id do aluno que será atualizado.
     * @param formUpdate - formulário referente aos dados necessário para atualização do Aluno no banco de dados.
     * @return - Aluno recém-atualizado.
     */
    Aluno update(Long id, AlunoUpdateDTO formUpdate);

    /**
     * Delete um Aluno e specifico
     * @param id - id do Aluno que será removido.
     */
    void delete(Long id);

    /**
     * Retorna dodas as avaliações fisícas de acordo com o id do aluno
     * @param id - id referente ao aluno
     * @return - valiações fisícas de acordo com o id do aluno
     */
    List<AvaliacaoFisica> getAllAvaliacaoFisicaByAlunoId(Long id);
}
