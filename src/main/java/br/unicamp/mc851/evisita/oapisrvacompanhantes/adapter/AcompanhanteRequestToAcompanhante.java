package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.AcompanhanteRequest;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Acompanhante;

public class AcompanhanteRequestToAcompanhante {
    private AcompanhanteRequestToAcompanhante() {}
    public static Acompanhante convert(AcompanhanteRequest request) {
        return Acompanhante.builder()
                .idPacientes(request.getIdPacientes())
                .cpf(request.getCpf())
                .rg(request.getRg())
                .nome(request.getNome())
                .build();
    }
}
