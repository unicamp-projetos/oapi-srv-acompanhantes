package br.unicamp.mc851.evisita.oapisrvacompanhantes.controller;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionRequest;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture.CompanionRequestFixture;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture.CompanionResponseFixture;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.GetCompanionByCpf;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.GetCompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.SaveCompanionRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CompanionsControllerTest {
    private SaveCompanionRequest saveCompanionRequest;
    private GetCompanionResponse getCompanionResponse;
    private GetCompanionByCpf getCompanionByCpf;
    private CompanionsController controller;

    @BeforeEach
    void setUp() {
        saveCompanionRequest = mock(SaveCompanionRequest.class);
        getCompanionByCpf = mock(GetCompanionByCpf.class);
        getCompanionResponse = mock(GetCompanionResponse.class);
        controller = new CompanionsController(saveCompanionRequest, getCompanionResponse, getCompanionByCpf);
    }

    @Test
    void shouldSaveCompanionAndReturn201StatusCode() {
        var companionRequest = CompanionRequestFixture.gimmeCompanionRequest();

        when(saveCompanionRequest.execute(companionRequest)).thenReturn(any(CompanionResponse.class));

        var responseEntity = controller.saveCompanion(companionRequest);

        assertNotNull(responseEntity);
        assertEquals(201, responseEntity.getStatusCodeValue());
    }

    @Test
    void shouldReturnAllCompanionsWith200StatusCode() {
        when(getCompanionResponse.execute()).thenReturn(CompanionResponseFixture.gimmeCompanionResponseList());

        var responseEntity = controller.getCompanions();

        assertNotNull(responseEntity);
        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    void shouldReturnACompanionGivenHisCpf() {
        String cpf = "1";

        when(getCompanionByCpf.execute(cpf)).thenReturn(ResponseEntity.ok().build());

        var responseEntity = controller.retrieveCompanionByCpf(cpf);

        assertNotNull(responseEntity);
    }
}
