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
    public void addUserToGruppe(Long gruppeId,String gihubHandle, String name, String matrikelNummer){
        if(gruppeId==null || gihubHandle == null || name == null ||matrikelNummer == null) return;
        Gruppe gruppe = repository.getGruppeById(gruppeId).addUser(gihubHandle,name,matrikelNummer);
        repository.saveGruppe(gruppe);
    }
    public List<Gruppe> gellAllGruppen(){
        return repository.gellAllGruppen();
    }
}
