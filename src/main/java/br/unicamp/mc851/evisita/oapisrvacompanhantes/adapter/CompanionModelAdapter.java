package br.unicamp.mc851.evisita.oapisrvacompanhantes.adapter;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.CompanionModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.Companion;
import lombok.experimental.UtilityClass;
import org.springframework.beans.BeanUtils;

@UtilityClass
public class CompanionModelAdapter {

    public static CompanionModel convert(Companion companion) {
        var model = CompanionModel.builder().build();
        BeanUtils.copyProperties(companion, model);
        model.setVisitInfo(companion.getVisitInfo());
        return model;
    }
}
