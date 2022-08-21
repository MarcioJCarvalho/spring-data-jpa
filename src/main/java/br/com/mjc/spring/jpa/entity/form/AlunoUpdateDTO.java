package br.com.mjc.spring.jpa.entity.form;

import java.time.LocalDate;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoUpdateDTO {
    private String nome;
    private String bairro;
    private LocalDate dataDeNascimento;
}
