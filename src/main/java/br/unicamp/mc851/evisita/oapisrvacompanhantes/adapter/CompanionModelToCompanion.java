package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.CompanionModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;

import java.util.List;

public class CompanionModelToCompanion {
    private CompanionModelToCompanion() {}
    public static Companion convert(CompanionModel model) {
        return Companion.builder()
                .nome(model.getName())
                .rg(model.getRg())
                .cpf(model.getCpf())
                .patientsId(List.copyOf(model.getPatientsId()))
                .build();
    }
}
