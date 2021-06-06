package br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.AcompanhanteRequest;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.AcompanhanteResponse;

public interface SaveAcompanhanteRequest {
    AcompanhanteResponse execute(AcompanhanteRequest acompanhanteRequest);
}
