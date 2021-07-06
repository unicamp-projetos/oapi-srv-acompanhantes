package br.unicamp.mc851.evisita.oapisrvacompanhantes.database.impl;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.GetCompanions;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.CompanionModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.repository.CompanionRepository;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture.CompanionFixture;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture.CompanionModelFixture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetCompanionsImplTest {
    private CompanionRepository repository;
    private GetCompanions getCompanions;

    @BeforeEach
    void setUp() {
        repository = mock(CompanionRepository.class);
        getCompanions = new GetCompanionsImpl(repository);
    }

    @Test
    void shouldReturnAllCompanions() {
        var companions = CompanionFixture.gimmeCompanionsList();
        var companionModels = CompanionModelFixture.gimmeCompanionModelList();

        when(repository.findAll()).thenReturn(companionModels);

        var result = getCompanions.execute();

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(companions.get(0).getCpf(), result.get(0).getCpf());
        assertEquals(companions.get(0).getNome(), result.get(0).getNome());
    }
}
