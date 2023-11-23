package carrental;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// to perform all the crud operation each store has  inventory manager,
//this is the class or object responsible for all management of vehicle , making reservation ,returing back the vehicle etc...
public class VehicleInventoryManager {
    Map<VehicleType, List<Vehicle>> vehicles;

    VehicleInventoryManager(Map<VehicleType, List<Vehicle>> vehicles) {

        this.vehicles = vehicles;

    }

    void addVehicle(Vehicle vehicle) {
        VehicleType type = vehicle.type;
        if (!vehicles.containsKey(type)) {
            vehicles.put(type, new ArrayList<>());

        }
        vehicles.get(type).add(vehicle);
        System.out.println("Added vehicle" + " " + vehicles);

    }

    List<Vehicle> getVehicleByType(VehicleType type) {
        return vehicles.get(type);
    }

    Reservation createReservation(User user, Vehicle vehicle) {
        vehicle.status = VehicleStatus.UNAVAILABLE;
        Reservation reservation = new Reservation();

        reservation.createReservation(user, vehicle);
        return reservation;
    }

    void processSubmission(Vehicle vehicle, Reservation reservation) {

        Bill bill = new Bill(reservation);
        Payment pay = new Payment(bill);
        if (pay.payBill() == true) {
            reservation.status = ReservationStatus.COMPLETED;
            vehicle.status = VehicleStatus.AVAILABLE;
        }
    }
}
