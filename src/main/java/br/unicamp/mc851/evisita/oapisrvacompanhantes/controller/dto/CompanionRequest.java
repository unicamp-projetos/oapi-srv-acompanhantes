package br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanionRequest {
    @NonNull
    private Long cpf;
    private String rg;
    @NonNull
    private String name;
    @NonNull
    private List<Long> patientsId;
}
