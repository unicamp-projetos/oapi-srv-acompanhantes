package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;

public class CompanionToCompanionResponse {
    private CompanionToCompanionResponse() {}
    public static CompanionResponse convert(Companion companion) {
        return CompanionResponse.builder()
                .patientsId(companion.getPatientsId())
                .name(companion.getNome())
                .build();
    }
}
