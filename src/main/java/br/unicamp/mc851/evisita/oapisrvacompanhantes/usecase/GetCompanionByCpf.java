package br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase;

import org.springframework.http.ResponseEntity;

public interface GetCompanionByCpf {
    ResponseEntity<Object> execute(String cpf);
}
