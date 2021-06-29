package br.unicamp.mc851.evisita.oapisrvacompanhantes.database.impl;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.CompanionAdapter;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.GetCompanions;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.repository.CompanionRepository;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetCompanionsImpl implements GetCompanions {
    private final CompanionRepository repository;
    @Override
    public List<Companion> execute() {
        return repository.findAll()
                .stream()
                .map(CompanionAdapter::convert)
                .collect(Collectors.toList());
    }
}
