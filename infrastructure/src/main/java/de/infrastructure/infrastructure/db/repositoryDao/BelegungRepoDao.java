package de.infrastructure.infrastructure.db.repositoryDao;

import de.infrastructure.infrastructure.db.dto.BelegungDto;
import org.springframework.data.repository.CrudRepository;

public interface BelegungRepoDao extends CrudRepository<BelegungDto, Long> {
}
