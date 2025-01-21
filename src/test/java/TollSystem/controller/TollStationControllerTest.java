package TollSystem.controller;

import org.junit.jupiter.api.Test;
import TollSystem.model.Car;
import TollSystem.model.Motorcycle;
import TollSystem.model.TollStation;
import TollSystem.model.Vehicle;
import TollSystem.view.TollStationView;
import static org.mockito.Mockito.*;
import java.util.List;

public class TollStationControllerTest {

    @Test
    public void testProcessVehicleUpdatesModel() {
        TollStation station = mock(TollStation.class);
        TollStationView view = mock(TollStationView.class);
        TollStationController controller = new TollStationController(station, view);

        Vehicle car = new Car("CAR123");

        controller.processVehicle(car);
        verify(station).processVehicle(car);
    }

    @Test
    public void testDisplayReportCallsView() {
        TollStation station = mock(TollStation.class);
        TollStationView view = mock(TollStationView.class);
        TollStationController controller = new TollStationController(station, view);

        when(station.getName()).thenReturn("Central");
        when(station.getCity()).thenReturn("Springfield");
        when(station.getTotalTollCollected()).thenReturn(300);
        when(station.getVehicles()).thenReturn(List.of(
                new Car("CAR123"),
                new Motorcycle("MOTO456")));

        controller.displayReport();
        verify(view).displayReport("Central", "Springfield", 300, station.getVehicles());
    }
}
