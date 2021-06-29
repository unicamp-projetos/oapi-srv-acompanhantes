package br.unicamp.mc851.evisita.oapisrvacompanhantes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Companion {
    private String nome;
    private Long cpf;
    private String rg;
    private List<Long> patientsId;
    private LocalDateTime arrivalTime;
    private Boolean isVisiting;
}
