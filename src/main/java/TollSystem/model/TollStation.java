package TollSystem.model;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    private String name;
    private String city;
    private int totalTollCollected;
    private List<Vehicle> vehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalTollCollected = 0;
        this.vehicles = new ArrayList<>();
    }
    

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public int getTotalTollCollected() {
        return totalTollCollected;
    }


    public void setTotalTollCollected(int totalTollCollected) {
        this.totalTollCollected = totalTollCollected;
    }


    public List<Vehicle> getVehicles() {
        return vehicles;
    }


    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }


    public void processVehicle(Vehicle vehicle) {
        int toll = vehicle.calculateToll();
        totalTollCollected += toll;
        vehicles.add(vehicle);
    }

    public void printReport() {
        System.out.println("Toll Station: " + name + " (" + city + ")");
        System.out.println("Total Toll Collected: $" + totalTollCollected);
        System.out.println("Processed Vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println("- " + vehicle.getLicensePlate() + " (Toll: $" + vehicle.calculateToll() + ")");
        }
    }
}
