package br.unicamp.mc851.evisita.oapisrvacompanhantes.controller;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.AcompanhanteRequest;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.AcompanhanteResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.SaveAcompanhanteRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "acompanhantes/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class AcompanhantesController {
    private final SaveAcompanhanteRequest saveAcompanhanteRequest;

    @PostMapping(value = "/acompanhante", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AcompanhanteResponse> saveAcompanhante(
            @RequestBody AcompanhanteRequest acompanhanteRequest) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveAcompanhanteRequest.execute(acompanhanteRequest));
    }

}
