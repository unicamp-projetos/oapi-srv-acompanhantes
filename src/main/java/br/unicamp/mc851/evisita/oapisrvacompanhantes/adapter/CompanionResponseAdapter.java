package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CompanionResponseAdapter {

    public static CompanionResponse convert(Companion companion) {
        return CompanionResponse.builder()
                .patientsId(companion.getPatientsId())
                .name(companion.getNome())
                .build();
    }
}
