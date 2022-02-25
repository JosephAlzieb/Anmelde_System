package services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import repositories.TerminRepository;
import termin.Termin;

import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

public class TerminServiceTest {

    @Test
    @DisplayName("Ein Termin kann anhand seiner ID geladen werden")
    void test_1(){
        TerminRepository repository = mock(TerminRepository.class);
        TerminService service = new TerminService(repository);

        LocalDateTime frist = LocalDateTime.of(2022,2,22,21,0);
        LocalDateTime von = LocalDateTime.of(2022,2,23, 12,0);
        LocalDateTime bis = LocalDateTime.of(2022,2,23, 14,0);
        Termin t = new Termin(1L,frist,von,bis,"praktisch Übung 1");

        when(repository.getTerminById(anyLong())).thenReturn(t);

        service.getTerminById(anyLong());

        verify(repository).getTerminById(anyLong());
    }
}
