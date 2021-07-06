package br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.GetCompanions;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture.CompanionFixture;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture.CompanionResponseFixture;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.impl.GetCompanionResponseImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetCompanionResponseImplTest {
    private GetCompanions getCompanions;
    private GetCompanionResponse getCompanionResponse;

    @BeforeEach
    void setUp() {
        getCompanions = mock(GetCompanions.class);
        getCompanionResponse = new GetCompanionResponseImpl(getCompanions);
    }

    @Test
    void shouldReturnAllCompanions() {
        var companions = CompanionFixture.gimmeCompanionsList();
        var companionResponses = CompanionResponseFixture.gimmeCompanionResponseList();

        when(getCompanions.execute()).thenReturn(companions);

        var result = getCompanionResponse.execute();

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(companionResponses.get(0).getCpf(), result.get(0).getCpf());
    }
}
