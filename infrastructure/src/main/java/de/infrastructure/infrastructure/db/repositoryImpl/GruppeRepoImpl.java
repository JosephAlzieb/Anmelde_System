package de.infrastructure.infrastructure.db.repositoryImpl;

import de.infrastructure.infrastructure.db.repositoryDao.GruppeRepoDao;
import gruppe.Gruppe;
import org.springframework.stereotype.Repository;
import repositories.GruppeRepository;

import java.util.List;

@Repository
public class GruppeRepoImpl implements GruppeRepository {

    private GruppeRepoDao repoDao;

    public GruppeRepoImpl(GruppeRepoDao repoDao) {
        this.repoDao = repoDao;
    }

    @Override
    public Gruppe getGruppeById(Long id) {
        return null;
    }

    @Override
    public void saveGruppe(Gruppe gruppe) {

    }

    @Override
    public void addUser(String gihubHandle, String name, String matrikelNummer) {

    }

    @Override
    public List<Gruppe> gellAllGruppen() {
        return null;
    }
}
