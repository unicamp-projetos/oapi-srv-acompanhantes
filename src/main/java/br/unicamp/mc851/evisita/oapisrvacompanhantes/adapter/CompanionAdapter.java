package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionRequest;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.CompanionModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class CompanionAdapter {

    public static Companion convert(CompanionModel model) {
        return Companion.builder()
                .nome(model.getName())
                .rg(model.getRg())
                .cpf(model.getCpf())
                .patientsId(List.copyOf(model.getPatientsId()))
                .isVisiting(model.getIsVisiting())
                .arrivalTime(model.getArrivalTime())
                .build();
    }

    public static Companion convert(CompanionRequest request) {
        return Companion.builder()
                .patientsId(request.getPatientsId())
                .cpf(request.getCpf())
                .rg(request.getRg())
                .nome(request.getName())
                .isVisiting(request.getIsVisiting())
                .arrivalTime(request.getArrivalTime())
                .build();
    }
}
