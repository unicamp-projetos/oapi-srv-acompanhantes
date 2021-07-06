package br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter.CompanionResponseAdapter;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionRequest;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.SaveCompanion;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture.CompanionFixture;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture.CompanionRequestFixture;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.impl.SaveCompanionRequestImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SaveCompanionRequestImplTest {

    private SaveCompanion saveCompanion;
    private SaveCompanionRequest saveCompanionRequest;

    @BeforeEach
    void setUp() {
        saveCompanion = mock(SaveCompanion.class);
        saveCompanionRequest = new SaveCompanionRequestImpl(saveCompanion);
    }

    @Test
    void shouldSaveCompanionWhenCompanionRequestIsGiven() {
        var companion = CompanionFixture.gimmeCompanion();
        var companionRequest = CompanionRequestFixture.gimmeCompanionRequest();
        var companionResponse = CompanionResponseAdapter.convert(companion);

        when(saveCompanion.execute(any(Companion.class))).thenReturn(companion);

        var result = saveCompanionRequest.execute(companionRequest);
        assertNotNull(result);
        assertEquals(companionResponse.getArrivalTime(), result.getArrivalTime());
        assertEquals(companionResponse.getCpf(), result.getCpf());
        assertEquals(companionResponse.getIsVisiting(), result.getIsVisiting());
    }
}
