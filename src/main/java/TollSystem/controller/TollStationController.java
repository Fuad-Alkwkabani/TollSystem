package TollSystem.controller;

import TollSystem.model.TollStation;
import TollSystem.model.Vehicle;
import TollSystem.view.TollStationView;

public class TollStationController {
    private TollStation tollStation;
    private TollStationView view;

    public TollStationController(TollStation tollStation, TollStationView view) {
        this.tollStation = tollStation;
        this.view = view;
    }

    public void processVehicle(Vehicle vehicle) {
        tollStation.processVehicle(vehicle);
    }

    public void displayReport() {
        view.displayReport(
                tollStation.getName(),
                tollStation.getCity(),
                tollStation.getTotalTollCollected(),
                tollStation.getVehicles());
    }
}
