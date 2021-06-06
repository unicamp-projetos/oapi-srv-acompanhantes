package br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity;

import lombok.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "acompanhantes")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcompanhanteModel {
    @Id
    @NonNull
    private Long cpf;
    private Long rg;
    @NonNull
    private String nome;
    @ElementCollection
    @NonNull
    private Set<Long> idPacientes;
}
