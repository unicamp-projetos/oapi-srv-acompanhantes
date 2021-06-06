package br.unicamp.mc851.evisita.oapisrvacompanhantes.database.impl;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.AcompanhanteModelToAcompanhante;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.AcompanhanteToAcompanhanteModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.SaveAcompanhante;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.repository.AcompanhanteRepository;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Acompanhante;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveAcompanhanteImpl implements SaveAcompanhante {
    private final AcompanhanteRepository repository;
    @Override
    public Acompanhante execute(Acompanhante acompanhante) {
        var model = repository.save(AcompanhanteToAcompanhanteModel.convert(acompanhante));
        return AcompanhanteModelToAcompanhante.convert(model);
    }
}
