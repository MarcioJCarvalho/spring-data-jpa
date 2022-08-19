package br.com.mjc.spring.jpa.service;

import java.util.List;

import br.com.mjc.spring.jpa.entity.Matricula;
import br.com.mjc.spring.jpa.entity.form.MatriculaDTO;


public interface IMatriculaService {
    /**
    * Cria uma matricula e salva no banco de dados.
    * @param form - formulariop referente aos dados para a criação da Matricula no banco de dados.
    * @return - Matricula recem-criada  
    */
    Matricula create(MatriculaDTO form);

    /**
     * Retorna uma matricula que esta no banco de dados de acordo com seu id.
     * @param id - id da matricula que será exibida.
     * @return - matricula de acordo com id fornecido.
     */
    Matricula get(Long id);

    /**
     * Retorna todas as Matriculas que estão no banco de dados.
     * @return - uma lista com todas as matriculas que estão salvas no BD.
     */
    List<Matricula> getAll();

    /**
     * Deleta uma matricula especifica.
     * @param id - id da Matricula que será removida.
     */
    void delete(Long id);
}
