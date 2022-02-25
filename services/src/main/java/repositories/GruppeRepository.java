package repositories;

import gruppe.Gruppe;

import java.util.List;

public interface GruppeRepository {

    public Gruppe getGruppeById(Long id);
    public void saveGruppe (Gruppe gruppe);
    public void addUser(String gihubHandle, String name, String matrikelNummer);
    public List<Gruppe> gellAllGruppen();


}
