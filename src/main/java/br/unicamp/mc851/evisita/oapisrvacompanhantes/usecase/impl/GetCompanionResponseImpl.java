package br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.impl;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.CompanionResponseAdapter;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.GetCompanions;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.GetCompanionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetCompanionResponseImpl implements GetCompanionResponse {
    private final GetCompanions getCompanions;
    @Override
    public List<CompanionResponse> execute() {
        return getCompanions.execute()
                .stream()
                .map(CompanionResponseAdapter::convert)
                .collect(Collectors.toList());
    }
}
