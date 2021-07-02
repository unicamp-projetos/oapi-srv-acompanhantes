package br.unicamp.mc851.evisita.oapisrvacompanhantes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VisitInfo {
    private String patientId;
    private Boolean isVisiting;
    private LocalDateTime arrivalTime;
}
