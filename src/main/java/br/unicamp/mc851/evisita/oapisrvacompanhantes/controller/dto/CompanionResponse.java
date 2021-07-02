package br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.VisitInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanionResponse {
    private List<VisitInfo> visitInfo;
    private String name;
    private String cpf;
}
