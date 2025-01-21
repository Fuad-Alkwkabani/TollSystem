package TollSystem.view;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class TollStationViewTest {

    @Test
    public void testDisplayReport() {
        TollStationView view = mock(TollStationView.class);

        view.displayReport("Central", "Springfield", 200, List.of());
        verify(view).displayReport("Central", "Springfield", 200, List.of());
    }
}
