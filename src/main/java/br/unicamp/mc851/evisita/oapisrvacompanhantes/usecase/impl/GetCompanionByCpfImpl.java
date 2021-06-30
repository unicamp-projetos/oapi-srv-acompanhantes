package br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.impl;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.CompanionResponseAdapter;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.repository.CompanionRepository;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.GetCompanionByCpf;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetCompanionByCpfImpl implements GetCompanionByCpf {

    private final CompanionRepository repository;

    @Override
    public ResponseEntity<Object> execute(String cpf) {
        var modelOptional = repository.findById(cpf);

        if (modelOptional.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(CompanionResponseAdapter.convert(modelOptional.get()));
    }
}
