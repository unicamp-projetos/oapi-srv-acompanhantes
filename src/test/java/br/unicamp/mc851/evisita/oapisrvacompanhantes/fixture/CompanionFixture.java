package br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

@UtilityClass
public class CompanionFixture {

    public static Companion gimmeCompanion() {
        return Companion.builder()
                .arrivalTime(LocalDateTime.of(LocalDate.now(), LocalTime.of(1, 1)))
                .isVisiting(true)
                .cpf("1")
                .rg("1")
                .patientsId(Collections.emptyList())
                .nome("Nome")
                .build();
    }

    public static List<Companion> gimmeCompanionsList() {
        return Collections.singletonList(gimmeCompanion());
    }
}
