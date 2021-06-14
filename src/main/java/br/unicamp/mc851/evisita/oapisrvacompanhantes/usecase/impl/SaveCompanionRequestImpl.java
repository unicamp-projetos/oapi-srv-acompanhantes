package br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.impl;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.CompanionRequestToCompanion;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.CompanionToCompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionRequest;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.SaveCompanion;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.SaveCompanionRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveCompanionRequestImpl implements SaveCompanionRequest {
    private final SaveCompanion saveCompanion;
    @Override
    public CompanionResponse execute(CompanionRequest companionRequest) {
        var acompanhante = saveCompanion.execute(
                CompanionRequestToCompanion.convert(companionRequest));
        return CompanionToCompanionResponse.convert(acompanhante);
    }
}
