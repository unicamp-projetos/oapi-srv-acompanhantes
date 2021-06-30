package br.unicamp.mc851.evisita.oapisrvacompanhantes.database.repository;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.CompanionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanionRepository extends JpaRepository<CompanionModel, String> {
}
