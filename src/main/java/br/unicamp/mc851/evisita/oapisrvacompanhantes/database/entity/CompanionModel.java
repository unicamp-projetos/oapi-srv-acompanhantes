package br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.domain.VisitInfo;
import lombok.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

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
    private List<VisitInfo> visitInfo;
}
