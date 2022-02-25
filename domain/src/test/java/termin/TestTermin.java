package termin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTermin {


    @Test
    @DisplayName("Termin ist noch nicht abgelaufen")
    void test_1(){
        LocalDateTime frist = LocalDateTime.of(2022,2,22, 0,0);
        LocalDateTime von = LocalDateTime.of(2022,2,23, 12,0);
        LocalDateTime bis = LocalDateTime.of(2022,2,23, 14,0);
        Termin t = new Termin(1L,frist,von,bis,"praktisch Übung 1");
        LocalDateTime now = LocalDateTime.of(2022,2,21, 0,0);
        assertThat(t.ist_anmeldeFrist_abgelaufen(now)).isFalse();
    }

    @Test
    @DisplayName("Anmeldung für den Termin verpasst ")
    void test_2(){
        LocalDateTime frist = LocalDateTime.of(2022,2,22,21,0);
        LocalDateTime von = LocalDateTime.of(2022,2,23, 12,0);
        LocalDateTime bis = LocalDateTime.of(2022,2,23, 14,0);
        Termin t = new Termin(1L,frist,von,bis,"praktisch Übung 1");
        LocalDateTime now = LocalDateTime.of(2022,2,23, 23,0);


        assertThat(t.ist_anmeldeFrist_abgelaufen(now)).isTrue();
    }
}
