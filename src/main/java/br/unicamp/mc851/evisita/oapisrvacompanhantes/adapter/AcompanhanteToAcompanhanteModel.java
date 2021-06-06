package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.AcompanhanteModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Acompanhante;

import java.util.Set;

public class AcompanhanteToAcompanhanteModel {
    private AcompanhanteToAcompanhanteModel() {}
    public static AcompanhanteModel convert(Acompanhante acompanhante) {
        return AcompanhanteModel.builder()
                .cpf(acompanhante.getCpf())
                .rg(acompanhante.getRg())
                .idPacientes(Set.copyOf(acompanhante.getIdPacientes()))
                .nome(acompanhante.getNome())
                .build();
    }
}
