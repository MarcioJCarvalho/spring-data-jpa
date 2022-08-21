package br.com.mjc.spring.jpa.entity.form;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaDTO {
    private Long alunoId;
    private double peso;
    private double altura;
}
