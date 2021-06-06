package br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcompanhanteRequest {
    @NonNull
    private Long cpf;
    private Long rg;
    @NonNull
    private String nome;
    @NonNull
    private List<Long> idPacientes;
}
