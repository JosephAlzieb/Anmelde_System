package de.infrastructure.infrastructure.db.repositoryImpl;

import de.infrastructure.infrastructure.db.dto.GruppeDto;
import de.infrastructure.infrastructure.db.dto.UserDto;
import de.infrastructure.infrastructure.db.repositoryDao.GruppeRepoDao;
import gruppe.Gruppe;
import org.springframework.stereotype.Repository;
import repositories.GruppeRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Repository
public class GruppeRepoImpl implements GruppeRepository {

    private GruppeRepoDao repoDao;

    public GruppeRepoImpl(GruppeRepoDao repoDao) {
        this.repoDao = repoDao;
    }

    @Override
    public Gruppe getGruppeById(Long id) {
        GruppeDto dto = repoDao.findById(id).get();
        Gruppe gruppe = new Gruppe(dto.getId());
        return gruppe;
    }

    @Override
    public void saveGruppe(Gruppe gruppe) {
//        GruppeDto dto = repoDao.findById(gruppe.getId()).get();
//        Set<UserDto> userDtos = gruppe.getUsers().stream().map(u->new UserDto(u.getGihubHandle(),u.getName(),u.getMatrikelNummer().getNr())).collect(Collectors.toSet());
//        dto.setUsers(userDtos);
//        System.out.println(dto);
//        System.out.println(userDtos);
//        repoDao.save(dto);
    }

    @Override
    public void addUser(Long gruppeId,String gihubHandle, String name, String matrikelNummer) {
//        Optional<GruppeDto> gruppeDto = repoDao.findById(gruppeId);
//        if(gruppeDto.isPresent()){
//            Gruppe gruppe = new Gruppe(gruppeDto.get().id()).addUser(gihubHandle,name,matrikelNummer);
//            saveGruppe(gruppe);
//        }
    }

    @Override
    public List<Gruppe> gellAllGruppen() {
        return repoDao.findAll().stream().map(g->getGruppe(g)).collect(Collectors.toList());
    }

    private Gruppe getGruppe(GruppeDto g) {
        return new Gruppe(g.getId());
    }
}
