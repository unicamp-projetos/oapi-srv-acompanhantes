package br.unicamp.mc851.evisita.oapisrvacompanhantes.database.repository;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.AcompanhanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcompanhanteRepository extends JpaRepository<AcompanhanteModel, Long> {
}
