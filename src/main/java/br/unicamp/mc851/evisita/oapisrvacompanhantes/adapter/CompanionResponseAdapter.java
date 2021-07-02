package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionResponse;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.CompanionModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import lombok.experimental.UtilityClass;
import org.springframework.beans.BeanUtils;

@UtilityClass
public class CompanionResponseAdapter {

    public static CompanionResponse convert(Companion companion) {
        var companionResponse = CompanionResponse.builder().build();
        BeanUtils.copyProperties(companion, companionResponse);
        companionResponse.setVisitInfo(companion.getVisitInfo());
        return companionResponse;
    }

    public static CompanionResponse convert(CompanionModel model) {
        var companionResponse = CompanionResponse.builder().build();
        BeanUtils.copyProperties(model, companionResponse);
        companionResponse.setVisitInfo(model.getVisitInfo());
        return companionResponse;
    }
}
