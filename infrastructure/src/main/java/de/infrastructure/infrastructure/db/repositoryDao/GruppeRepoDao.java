package de.infrastructure.infrastructure.db.repositoryDao;

import de.infrastructure.infrastructure.db.dto.GruppeDto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GruppeRepoDao extends CrudRepository<GruppeDto, Long> {

    List<GruppeDto> findAll();
}
