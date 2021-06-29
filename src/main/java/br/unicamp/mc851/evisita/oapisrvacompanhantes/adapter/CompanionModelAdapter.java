package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.CompanionModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import lombok.experimental.UtilityClass;

import java.util.Set;

@UtilityClass
public class CompanionModelAdapter {

    public static CompanionModel convert(Companion companion) {
        return CompanionModel.builder()
                .cpf(companion.getCpf())
                .rg(companion.getRg())
                .patientsId(Set.copyOf(companion.getPatientsId()))
                .name(companion.getNome())
                .isVisiting(companion.getIsVisiting())
                .arrivalTime(companion.getArrivalTime())
                .build();
    }
}
