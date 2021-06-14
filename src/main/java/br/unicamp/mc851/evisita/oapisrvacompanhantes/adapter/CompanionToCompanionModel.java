package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.CompanionModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;

import java.util.Set;

public class CompanionToCompanionModel {
    private CompanionToCompanionModel() {}
    public static CompanionModel convert(Companion companion) {
        return CompanionModel.builder()
                .cpf(companion.getCpf())
                .rg(companion.getRg())
                .patientsId(Set.copyOf(companion.getPatientsId()))
                .name(companion.getNome())
                .build();
    }
}
