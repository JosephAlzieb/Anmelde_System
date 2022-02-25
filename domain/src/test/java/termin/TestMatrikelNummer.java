package termin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestMatrikelNummer {

    @Test
    @DisplayName("Matrikelnummer ist valid")
    void test_1(){
        assertThat(MatrikelNummer.istMatrikelNr("123456")).isTrue();
    }

    @Test
    @DisplayName("Matrikelnummer hat falsche Anzahl von Ziffern")
    void test_2(){
        assertThat(MatrikelNummer.istMatrikelNr("12345")).isFalse();
    }

    @Test
    @DisplayName("Matrikelnummer enthält Buchstaben, es ist nicht erlaubt")
    void test_3(){
        assertThat(MatrikelNummer.istMatrikelNr("1234HJ")).isTrue();
    }
}
