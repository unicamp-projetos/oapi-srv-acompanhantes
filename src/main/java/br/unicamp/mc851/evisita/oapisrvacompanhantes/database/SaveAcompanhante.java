package br.unicamp.mc851.evisita.oapisrvacompanhantes.database;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Acompanhante;

public interface SaveAcompanhante {
    Acompanhante execute(Acompanhante acompanhante);
}
