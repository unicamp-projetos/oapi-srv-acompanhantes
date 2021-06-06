package br.unicamp.mc851.evisita.oapisrvacompanhantes.database.impl;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.AcompanhanteModelToAcompanhante;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.GetAcompanhantes;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.repository.AcompanhanteRepository;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Acompanhante;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetAcompanhantesImpl implements GetAcompanhantes {
    private final AcompanhanteRepository repository;
    @Override
    public List<Acompanhante> execute() {
        return repository.findAll()
                .stream()
                .map(AcompanhanteModelToAcompanhante::convert)
                .collect(Collectors.toList());
    }
}
