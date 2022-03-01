package de.infrastructure.infrastructure.config;

import de.infrastructure.infrastructure.db.repositoryImpl.TerminRepoImpl;
import org.springframework.context.annotation.Bean;
import repositories.GruppeRepository;
import repositories.TerminRepository;
import services.GruppenService;
import services.TerminService;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    TerminService terminService (TerminRepository repository){
        return new TerminService (repository);
    }

    @Bean
    GruppenService gruppenService (GruppeRepository repository){
        return new GruppenService (repository);
    }
}
