package br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionRequest;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionResponse;

public interface SaveCompanionRequest {
    CompanionResponse execute(CompanionRequest companionRequest);
}
