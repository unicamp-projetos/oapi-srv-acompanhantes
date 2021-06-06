package br.unicamp.mc851.evisita.oapisrvacompanhantes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Acompanhante {
    private String nome;
    private Long cpf;
    private Long rg;
    private List<Long> idPacientes;
}
