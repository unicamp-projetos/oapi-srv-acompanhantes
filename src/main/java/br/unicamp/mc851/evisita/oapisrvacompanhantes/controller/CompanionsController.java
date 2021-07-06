package br.unicamp.mc851.evisita.oapisrvacompanhantes.controller;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionRequest;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.GetCompanionByCpf;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.GetCompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.SaveCompanionRequest;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "companions/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class CompanionsController {

    private final SaveCompanionRequest saveCompanionRequest;
    private final GetCompanionResponse getCompanionResponse;
    private final GetCompanionByCpf getCompanionByCpf;

    @PostMapping(value = "/companion", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("Save companions in database")
    @ApiResponse(code = 201, message = "Companion saved successfully")
    public ResponseEntity<CompanionResponse> saveCompanion(
            @RequestBody CompanionRequest companionRequest) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveCompanionRequest.execute(companionRequest));
    }

    @GetMapping("/companions")
    @ApiOperation("Retrieve all companions saved in database")
    @ApiResponse(code = 200, message = "Companions retrieved successfully")
    @CrossOrigin("http://localhost:4200")
    public ResponseEntity<List<CompanionResponse>> getCompanions() {
        return ResponseEntity.ok(getCompanionResponse.execute());
    }

    @GetMapping("/companion")
    @ApiOperation("Retrieve the Companion by cpf")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Companion retrieved successfully"),
            @ApiResponse(code = 400, message = "Could not find or retrieve companion")
    })
    public ResponseEntity<Object> retrieveCompanionByCpf(@RequestParam String cpf) {
        return getCompanionByCpf.execute(cpf);
    }

}
