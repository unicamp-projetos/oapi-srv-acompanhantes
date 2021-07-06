package br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.CompanionModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.repository.CompanionRepository;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture.CompanionModelFixture;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.usecase.impl.GetCompanionByCpfImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetCompanionByCpfImplTest {
    private CompanionRepository repository;
    private GetCompanionByCpf getCompanionByCpf;

    @BeforeEach
    void setUp() {
        repository = mock(CompanionRepository.class);
        getCompanionByCpf = new GetCompanionByCpfImpl(repository);
    }

    @Test
    void shouldReturnTheCorrespondentCompanionWhenHisCpfIsGiven() {
        String cpf = "1";
        var companionModel = CompanionModelFixture.gimmeCompanionModel();

        when(repository.findById(cpf)).thenReturn(Optional.of(companionModel));

        var responseEntity = getCompanionByCpf.execute(cpf);

        assertNotNull(responseEntity);
        assertEquals(200, responseEntity.getStatusCodeValue());
        assertNotNull(responseEntity.getBody());
    }

    @Test
    void shouldReturnBadRequestWhenTheGivenCpfIsInvalid() {
        String cpf = "2";

        when(repository.findById(cpf)).thenReturn(Optional.empty());

        var responseEntity = getCompanionByCpf.execute(cpf);

        assertNotNull(responseEntity);
        assertEquals(400, responseEntity.getStatusCodeValue());
    }
}
