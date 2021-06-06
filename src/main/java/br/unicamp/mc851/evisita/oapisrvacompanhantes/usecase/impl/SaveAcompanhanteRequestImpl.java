package br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.impl;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.AcompanhanteRequestToAcompanhante;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.AcompanhanteToAcompanhanteResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.AcompanhanteRequest;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.AcompanhanteResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.SaveAcompanhante;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.SaveAcompanhanteRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveAcompanhanteRequestImpl implements SaveAcompanhanteRequest {
    private final SaveAcompanhante saveAcompanhante;
    @Override
    public AcompanhanteResponse execute(AcompanhanteRequest acompanhanteRequest) {
        var acompanhante = saveAcompanhante.execute(
                AcompanhanteRequestToAcompanhante.convert(acompanhanteRequest));
        return AcompanhanteToAcompanhanteResponse.convert(acompanhante);
    }
}
