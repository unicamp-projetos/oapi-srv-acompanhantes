package br.unicamp.mc851.evisita.oapisrvacompanhantes.fixture;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.CompanionModel;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

@UtilityClass
public class CompanionModelFixture {

    public static CompanionModel gimmeCompanionModel() {
        return CompanionModel.builder()
                .arrivalTime(LocalDateTime.of(LocalDate.now(), LocalTime.of(1, 1)))
                .isVisiting(true)
                .cpf("1")
                .name("Nome")
                .rg("1")
                .patientsId(Collections.emptySet())
                .build();
    }

    public static List<CompanionModel> gimmeCompanionModelList() {
        return Collections.singletonList(gimmeCompanionModel());
    }
}
