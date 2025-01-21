package TollSystem.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void testEmptyLicensePlate() {
        Vehicle car = new Car("");
        assertEquals("", car.getLicensePlate());
    }

    @Test
    public void testNullLicensePlate() {
        Vehicle car = new Car(null);
        assertNull(car.getLicensePlate());
    }

    @Test
    public void testTruckWithZeroAxles() {
        Vehicle truck = new Truck("TRUCK000", 0);
        assertEquals(0, truck.calculateToll());
    }
}
