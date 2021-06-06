package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.AcompanhanteResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Acompanhante;

public class AcompanhanteToAcompanhanteResponse {
    private AcompanhanteToAcompanhanteResponse() {}
    public static AcompanhanteResponse convert(Acompanhante acompanhante) {
        return AcompanhanteResponse.builder()
                .idPacientes(acompanhante.getIdPacientes())
                .nome(acompanhante.getNome())
                .build();
    }
}
