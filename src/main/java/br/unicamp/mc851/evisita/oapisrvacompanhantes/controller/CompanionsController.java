package br.unicamp.mc851.evisita.oapisrvacompanhantes.controller;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionRequest;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.GetCompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.SaveCompanionRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "acompanhantes/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class CompanionsController {
    private final SaveCompanionRequest saveCompanionRequest;
    private final GetCompanionResponse getCompanionResponse;

    @PostMapping(value = "/acompanhante", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CompanionResponse> saveAcompanhante(
            @RequestBody CompanionRequest companionRequest) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveCompanionRequest.execute(companionRequest));
    }

    @GetMapping("/acompanhantes")
    public ResponseEntity<List<CompanionResponse>> getAcompanhantes() {
        return ResponseEntity.ok(getCompanionResponse.execute());
    }

}
