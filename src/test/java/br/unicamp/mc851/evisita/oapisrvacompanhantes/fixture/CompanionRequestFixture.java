package br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionRequest;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;

@UtilityClass
public class CompanionRequestFixture {

    public static CompanionRequest gimmeCompanionRequest() {
        return CompanionRequest.builder()
                .name("Nome")
                .cpf("1")
                .arrivalTime(LocalDateTime.of(LocalDate.now(), LocalTime.of(1, 1)))
                .isVisiting(true)
                .rg("1")
                .patientsId(Collections.emptyList())
                .build();
    }
}
