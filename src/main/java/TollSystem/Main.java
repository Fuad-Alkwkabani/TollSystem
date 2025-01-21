package TollSystem;

import TollSystem.controller.TollStationController;
import TollSystem.model.Car;
import TollSystem.model.Motorcycle;
import TollSystem.model.TollStation;
import TollSystem.model.Truck;
import TollSystem.model.Vehicle;
import TollSystem.view.TollStationView;

public class Main {
    public static void main(String[] args) {
        TollStation tollStation = new TollStation("Central", "Springfield");
        TollStationView view = new TollStationView();
        TollStationController controller = new TollStationController(tollStation, view);

        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("XYZ789");
        Vehicle truck = new Truck("LMN456", 3);

        controller.processVehicle(car);
        controller.processVehicle(motorcycle);
        controller.processVehicle(truck);

        controller.displayReport();
    }
}
