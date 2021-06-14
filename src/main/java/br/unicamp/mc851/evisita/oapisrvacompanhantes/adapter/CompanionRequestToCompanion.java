package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionRequest;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;

public class CompanionRequestToCompanion {
    private CompanionRequestToCompanion() {}
    public static Companion convert(CompanionRequest request) {
        return Companion.builder()
                .patientsId(request.getPatientsId())
                .cpf(request.getCpf())
                .rg(request.getRg())
                .nome(request.getName())
                .build();
    }
}
