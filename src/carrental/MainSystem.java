package carrental;

import design.tictactoe.Main;

import java.util.ArrayList;
import java.util.List;

import java.util.Map;

//this is the main system that manages entire stores for the company
public class MainSystem {

    List<User> users;
    Map<String, List<Store>> cityStores;

    MainSystem(List<User> users, Map<String, List<Store>> stores) {
        this.users = users;
        this.cityStores = stores;
    }

    List<Store> getStoreByCity(String city) {
        List<Store> stores = cityStores.get(city);
        if (stores == null) {
            System.out.println("Sorry we have no stores at the location");
            return new ArrayList<>();
        }

        return stores;

    }

    List<Vehicle> getVehicleByType(Store store, VehicleType type) {
        return store.getVehicleByType(type);
    }

    Reservation createReservation(Store store, User user, Vehicle vehicle) {
        return store.createReservation(user, vehicle);
    }

    void submitVehicle(Store store, Vehicle vehicle, Reservation reservation) {
        store.submitVehicle(vehicle, reservation);
    }


}
