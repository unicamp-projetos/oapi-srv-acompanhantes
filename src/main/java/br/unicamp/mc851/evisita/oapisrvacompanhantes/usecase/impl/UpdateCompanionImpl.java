package br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.impl;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.CompanionModelAdapter;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.repository.CompanionRepository;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.UpdateCompanion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateCompanionImpl implements UpdateCompanion {

    private final CompanionRepository repository;

    @Override
    public Boolean execute(Companion companion) {
        return repository.save(CompanionModelAdapter.convert(companion)) != null;

    }
}
