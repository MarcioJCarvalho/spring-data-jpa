package br.com.mjc.spring.jpa.service;

import java.util.List;

import br.com.mjc.spring.jpa.entity.AvaliacaoFisica;
import br.com.mjc.spring.jpa.entity.form.AvaliacaoFisicaDTO;
import br.com.mjc.spring.jpa.entity.form.AvaliacaoFisicaUpdateDTO;

public interface IAvaliacaoFisicaService {
    /**
     * Cria avaliação fisíca e salva no banco de dados
     * @param form - fomulário referente aos dados para criação da Avaliação Fisíca no banco de dados.
     * @return - Avaliação fisíca recém-criada
     */
    AvaliacaoFisica create(AvaliacaoFisicaDTO form);

    /**
     * Retorna uma avaliação fisíca que esta no banco de dados de acordo com seu id
     * @param id - id da avaliaçãso fisíca que será exibida.
     * @return - Avaliação fisíca de acordo com id fornecido.
     */
    AvaliacaoFisica get(Long id);

    /**
     * Retorna todas Avaliações fisicas que estão no banco de dados. 
     * @return - Uma lista com todas as avaliações fisícas que estão salvas no DB.
     */
    List<AvaliacaoFisica> getAll();

    /**
     * Atualiza a avaliação fisíca.
     * @param id - id da avaliação fisíca que será atualizada.
     * @param formUpdate - formulário referente aos dados necessários para a atualização da avaliação
     * fisíca no banco de dados.
     * @return - Avaliação Fisaíca recém-atualizada.
     */
    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO formUpdate);

    /**
     * Deleta uma avaliação fisíca específica.
     * @param id - id da Avaliação fisíca que será removida.
     */
    void delete(Long id);
}
