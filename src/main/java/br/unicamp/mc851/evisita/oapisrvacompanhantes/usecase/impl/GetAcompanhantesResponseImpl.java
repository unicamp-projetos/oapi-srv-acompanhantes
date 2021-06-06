package br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.impl;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.AcompanhanteToAcompanhanteResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.AcompanhanteResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.GetAcompanhantes;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.GetAcompanhantesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetAcompanhantesResponseImpl implements GetAcompanhantesResponse {
    private final GetAcompanhantes getAcompanhantes;
    @Override
    public List<AcompanhanteResponse> execute() {
        return getAcompanhantes.execute()
                .stream()
                .map(AcompanhanteToAcompanhanteResponse::convert)
                .collect(Collectors.toList());
    }
}
