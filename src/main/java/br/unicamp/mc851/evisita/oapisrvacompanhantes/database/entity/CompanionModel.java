package br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity;

import lombok.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "companions")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanionModel {
    @Id
    @NonNull
    private String cpf;
    private String rg;
    @NonNull
    private String name;
    @ElementCollection
    @NonNull
    private Set<Long> patientsId;
    private LocalDateTime arrivalTime;
    @NonNull
    private Boolean isVisiting;
}
