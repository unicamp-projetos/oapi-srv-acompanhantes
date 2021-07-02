package br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.VisitInfo;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanionRequest {
    @NonNull
    private String cpf;
    private String rg;
    @NonNull
    private String name;
    @NonNull
    private List<VisitInfo> visitInfo;
}
