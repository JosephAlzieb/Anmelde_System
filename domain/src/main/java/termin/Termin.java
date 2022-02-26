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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getAnmeldeFrist() {
        return anmeldeFrist;
    }

    public void setAnmeldeFrist(LocalDateTime anmeldeFrist) {
        this.anmeldeFrist = anmeldeFrist;
    }

    public LocalDateTime getVon() {
        return von;
    }

    public void setVon(LocalDateTime von) {
        this.von = von;
    }

    public LocalDateTime getBis() {
        return bis;
    }

    public void setBis(LocalDateTime bis) {
        this.bis = bis;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
