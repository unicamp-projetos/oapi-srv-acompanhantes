package br.unicamp.mc851.evisita.oapisrvacompanhantes.database.impl;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.CompanionModelToCompanion;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.CompanionToCompanionModel;
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
        var model = repository.save(CompanionToCompanionModel.convert(companion));
        return CompanionModelToCompanion.convert(model);
    }
}
