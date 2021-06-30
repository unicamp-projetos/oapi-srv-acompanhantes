package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.CompanionModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class CompanionResponseAdapter {

    public static CompanionResponse convert(Companion companion) {
        return CompanionResponse.builder()
                .patientsId(companion.getPatientsId())
                .name(companion.getNome())
                .arrivalTime(companion.getArrivalTime())
                .isVisiting(companion.getIsVisiting())
                .cpf(companion.getCpf())
                .build();
    }

    public static CompanionResponse convert(CompanionModel model) {
        return CompanionResponse.builder()
                .patientsId(List.copyOf(model.getPatientsId()))
                .cpf(model.getCpf())
                .isVisiting(model.getIsVisiting())
                .arrivalTime(model.getArrivalTime())
                .name(model.getName())
                .build();
    }
}
