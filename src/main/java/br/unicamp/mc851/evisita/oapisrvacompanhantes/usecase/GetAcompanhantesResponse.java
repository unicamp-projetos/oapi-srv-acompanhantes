package br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.AcompanhanteResponse;

import java.util.List;

public interface GetAcompanhantesResponse {
    List<AcompanhanteResponse> execute();
}
