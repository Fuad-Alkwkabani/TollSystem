package TollSystem.view;

import java.util.List;

import TollSystem.model.Vehicle;

public class TollStationView {
    public void displayReport(String stationName, String city, int totalToll, List<Vehicle> vehicles) {
        System.out.println("Toll Station: " + stationName + " (" + city + ")");
        System.out.println("Total Toll Collected: $" + totalToll);
        System.out.println("Processed Vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println("- " + vehicle.getLicensePlate() + " (Toll: $" + vehicle.calculateToll() + ")");
        }
    }
}
