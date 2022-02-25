package services;

import gruppe.Gruppe;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import repositories.GruppeRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

public class GruppenServiceTest {

    @Test
    @DisplayName("gruppe kann bei ID gefunden werden")
    void test_1(){
        GruppeRepository repository = mock(GruppeRepository.class);
        GruppenService service = new GruppenService(repository);
        when(repository.getGruppeById(anyLong())).thenReturn(new Gruppe(anyLong()));

        service.getGruppeById(1L);
        verify(repository).getGruppeById(anyLong());
    }

    @Test
    @DisplayName("alle Gruppen werden gezeigt")
    void test_2(){
        GruppeRepository repository = mock(GruppeRepository.class);
        GruppenService service = new GruppenService(repository);
        when(repository.gellAllGruppen()).thenReturn(List.of(new Gruppe(1L)));

        List<Gruppe> gruppes = service.gellAllGruppen();
        verify(repository).gellAllGruppen();
        assertThat(gruppes.size()).isOne();
    }
}
