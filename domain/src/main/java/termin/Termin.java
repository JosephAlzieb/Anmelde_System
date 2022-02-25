package termin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Termin {
    private Long id;
    private LocalDate anmeldeFrist;
    private LocalDateTime von;
    private LocalDateTime bis;
    private String titel ;
    private Gruppe gruppe;

    public Termin(Long id, LocalDate anmeldeFrist, LocalDateTime von, LocalDateTime bis, String titel, Gruppe gruppe) {
        this.id = id;
        this.anmeldeFrist = anmeldeFrist;
        this.von = von;
        this.bis = bis;
        this.titel = titel;
        this.gruppe = gruppe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Termin)) return false;
        Termin termin = (Termin) o;
        return id == termin.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
