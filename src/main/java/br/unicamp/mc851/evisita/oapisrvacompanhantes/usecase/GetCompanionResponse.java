package br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionResponse;

import java.util.List;

public interface GetCompanionResponse {
    List<CompanionResponse> execute();
}
