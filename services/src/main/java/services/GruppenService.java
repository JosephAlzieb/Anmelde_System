package services;

import gruppe.Gruppe;
import repositories.GruppeRepository;

import java.util.List;

public class GruppenService {

    private GruppeRepository repository;

    public GruppenService(GruppeRepository repository) {
        this.repository = repository;
    }

    public Gruppe getGruppeById(Long id){
        return repository.getGruppeById(id);
    }
    public void saveGruppe (Gruppe gruppe){
        repository.saveGruppe(gruppe);
    }
    public void addUserToGruppe(String gihubHandle, String name, String matrikelNummer){
        repository.addUser(gihubHandle,name,matrikelNummer);
    }
    public List<Gruppe> gellAllGruppen(){
        return repository.gellAllGruppen();
    }
}
