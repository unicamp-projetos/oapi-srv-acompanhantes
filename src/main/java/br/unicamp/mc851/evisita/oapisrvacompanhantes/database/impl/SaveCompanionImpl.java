package br.unicamp.mc851.evisita.oapisrvacompanhantes.database.impl;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.CompanionAdapter;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.CompanionModelAdapter;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.SaveCompanion;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.repository.CompanionRepository;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveCompanionImpl implements SaveCompanion {
    private final CompanionRepository repository;
    @Override
    public Companion execute(Companion companion) {
        var model = repository.save(CompanionModelAdapter.convert(companion));
        return CompanionAdapter.convert(model);
    }
}
