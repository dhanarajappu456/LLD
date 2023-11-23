package carrental;

import java.util.ArrayList;
import java.util.List;

// store is physical object on which operations are applied , which in turn manged by inventory manager contained in the store
public class Store {

    Location location;
    VehicleInventoryManager inventoryManager;

    Store(Location location, VehicleInventoryManager manager) {
        this.location = location;
        this.inventoryManager = manager;

    }

    List<Vehicle> getVehicleByType(VehicleType type) {

        List<Vehicle> vehicles = inventoryManager.getVehicleByType(type);
        if (vehicles == null) {
            System.out.println("No requested vehicle at the store");
            return new ArrayList<>();
        }
        return vehicles;

    }

    void submitVehicle(Vehicle vehicle, Reservation reservation) {
        inventoryManager.processSubmission(vehicle, reservation);
    }

    Reservation createReservation(User user, Vehicle vehicle) {
        return inventoryManager.createReservation(user, vehicle);
    }

}
