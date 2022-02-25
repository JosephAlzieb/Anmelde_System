package termin;


 import java.time.LocalDateTime;

public class Termin {
    private Long id;
    private LocalDateTime anmeldeFrist;
    private LocalDateTime von;
    private LocalDateTime bis;
    private String titel ;

    public Termin(Long id, LocalDateTime anmeldeFrist, LocalDateTime von, LocalDateTime bis, String titel) {
        this.id = id;
        this.anmeldeFrist = anmeldeFrist;
        this.von = von;
        this.bis = bis;
        this.titel = titel;

    }

    // Anmeldefrist sollte ein Tag, bevor der Termin beginnt, beendet werden.
    public boolean ist_anmeldeFrist_abgelaufen(LocalDateTime now){
        return anmeldeFrist.isBefore(now);
    }

}
