package TollSystem.model;

public class Truck extends Vehicle {
    private int axles;

    public Truck(String licensePlate, int axles) {
        super(licensePlate);
        this.axles = axles;
    }

    @Override
    public int calculateToll() {
        return axles * 50;
    }
}
