package br.unicamp.mc851.evisita.oapisrvacompanhantes.database;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;

public interface SaveCompanion {
    Companion execute(Companion companion);
}
