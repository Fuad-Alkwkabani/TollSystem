package TollSystem.model;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TollStationTest {

    @Test
    public void testStationInitialization() {
        TollStation station = new TollStation("North", "Denver");
        assertEquals("North", station.getName());
        assertEquals("Denver", station.getCity());
        assertEquals(0, station.getTotalTollCollected());
    }

    @Test
    public void testEmptyVehicleList() {
        TollStation station = new TollStation("East", "Chicago");
        assertTrue(station.getVehicles().isEmpty());
    }

    @Test
    public void testMultipleVehicleProcessing() {
        TollStation station = new TollStation("South", "Houston");

        Vehicle car = new Car("CAR001");
        Vehicle motorcycle = new Motorcycle("MOTO002");
        Vehicle truck = new Truck("TRUCK003", 4); // 4 ejes

        station.processVehicle(car);
        station.processVehicle(motorcycle);
        station.processVehicle(truck);

        List<Vehicle> vehicles = station.getVehicles();
        assertEquals(3, vehicles.size());

        int expectedTotal = car.calculateToll() + motorcycle.calculateToll() + truck.calculateToll();
        assertEquals(expectedTotal, station.getTotalTollCollected());
    }
}
