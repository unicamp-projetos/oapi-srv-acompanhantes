package br.unicamp.mc851.evisita.oapisrvacompanhantes.database.impl;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.SaveCompanion;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.CompanionModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.repository.CompanionRepository;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture.CompanionFixture;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture.CompanionModelFixture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SaveCompanionImplTest {
    private CompanionRepository repository;
    private SaveCompanion saveCompanion;

    @BeforeEach
    void setUp() {
        repository = mock(CompanionRepository.class);
        saveCompanion = new SaveCompanionImpl(repository);
    }

    @Test
    void shouldReturnCompanionSaved() {
        var companionModel = CompanionModelFixture.gimmeCompanionModel();
        var companion = CompanionFixture.gimmeCompanion();

        when(repository.save(any(CompanionModel.class))).thenReturn(companionModel);

        var result = saveCompanion.execute(companion);

        assertNotNull(result);
    }
}
