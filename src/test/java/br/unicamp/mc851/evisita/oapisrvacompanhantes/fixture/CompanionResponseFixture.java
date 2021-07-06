package br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionResponse;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

@UtilityClass
public class CompanionResponseFixture {

    public static CompanionResponse gimmeCompanionResponse() {
        return CompanionResponse.builder()
                .name("Nome")
                .cpf("1")
                .arrivalTime(LocalDateTime.of(LocalDate.now(), LocalTime.of(1,1)))
                .isVisiting(true)
                .patientsId(Collections.emptyList())
                .build();
    }

    public static List<CompanionResponse> gimmeCompanionResponseList() {
        return Collections.singletonList(gimmeCompanionResponse());
    }
}
