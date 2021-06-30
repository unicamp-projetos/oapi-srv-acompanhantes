package br.unicamp.mc851.evisita.oapisrvacompanhantes;

import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.entity.CompanionModel;
import br.unicamp.mc851.evisita.oapisrvacompanhantes.database.repository.CompanionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final CompanionRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new CompanionModel("41017879800",
                null, "Natan", Set.of(Long.valueOf(111)), LocalDateTime.now(), true));
    }
}
