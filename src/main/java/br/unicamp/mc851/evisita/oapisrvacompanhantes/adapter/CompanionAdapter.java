package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto.CompanionRequest;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.CompanionModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import lombok.experimental.UtilityClass;
import org.springframework.beans.BeanUtils;

@UtilityClass
public class CompanionAdapter {

    public static Companion convert(CompanionModel model) {
        var companion = Companion.builder().build();
        BeanUtils.copyProperties(model, companion);
        companion.setVisitInfo(model.getVisitInfo());
        return companion;
    }

    public static Companion convert(CompanionRequest request) {
        var companion = Companion.builder().build();
        BeanUtils.copyProperties(request, companion);
        companion.setVisitInfo(request.getVisitInfo());
        return companion;
    }
}
