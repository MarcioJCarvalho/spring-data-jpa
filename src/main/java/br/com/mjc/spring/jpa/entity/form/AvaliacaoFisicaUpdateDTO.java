package br.com.mjc.spring.jpa.entity.form;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaUpdateDTO {
    private double peso;
    private double altura;
}
