package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.AcompanhanteModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Acompanhante;

import java.util.List;

public class AcompanhanteModelToAcompanhante {
    private AcompanhanteModelToAcompanhante() {}
    public static Acompanhante convert(AcompanhanteModel model) {
        return Acompanhante.builder()
                .nome(model.getNome())
                .rg(model.getRg())
                .cpf(model.getCpf())
                .idPacientes(List.copyOf(model.getIdPacientes()))
                .build();
    }
}
