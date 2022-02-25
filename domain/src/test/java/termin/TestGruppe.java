package termin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestGruppe {

    @Test
    @DisplayName("Gruppe hat keine Plaeze mehr")
    void test_1(){
        Gruppe g = new Gruppe(1l);
        g.addUser("handle1","joe","123456");
        g.addUser("handle2","joe","123456");
        g.addUser("handle3","joe","123456");
        assertThat(g.hat_noch_plaeze()).isFalse();
    }
    @Test
    @DisplayName("Es koennen sich nur 3 Studierende für eine Gruppe anmelden")
    void test_2(){
        Gruppe g = new Gruppe(1l);
        g.addUser("handle1","joe","123456");
        g.addUser("handle2","joe","123456");
        g.addUser("handle3","joe","123456");
        g.addUser("handle3","joe","123456");
        assertThat(g.hat_noch_plaeze()).isFalse();
        assertThat(g.getGruppenGroeße()).isEqualTo(3);
    }
}
