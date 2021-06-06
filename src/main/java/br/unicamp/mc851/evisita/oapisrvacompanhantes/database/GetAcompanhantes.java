package br.unicamp.mc851.evisita.oapisrvacompanhantes.database;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Acompanhante;

import java.util.List;

public interface GetAcompanhantes {
    List<Acompanhante> execute();
}
