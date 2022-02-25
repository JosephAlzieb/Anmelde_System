package services;

import repositories.TerminRepository;
import termin.Termin;

import java.util.List;

public class TerminService {

    private TerminRepository repository;

    public TerminService(TerminRepository repository) {
        this.repository = repository;
    }

    public void saveTermin(Termin termin){
        repository.saveTermin(termin);
    }
    public Termin getTerminById(Long id){
        return repository.getTerminById(id);
    }
    public List<Termin> getTermine(){
        return repository.getTermine();
    }
}
