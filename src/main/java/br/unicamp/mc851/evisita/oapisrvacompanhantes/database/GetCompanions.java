package br.unicamp.mc851.evisita.oapisrvacompanhantes.database;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;

import java.util.List;

public interface GetCompanions {
    List<Companion> execute();
}
