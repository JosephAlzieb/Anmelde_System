package repositories;

import termin.Termin;

import java.util.List;

public interface TerminRepository {

    public void saveTermin(Termin termin);
    public Termin getTerminById(Long id);
    public List<Termin> getTermine();

}
