package br.unicamp.mc851.evisita.oapisrvacompanhantes.controller.dto;

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
    private List<Long> patientsId;
    private String name;
}
