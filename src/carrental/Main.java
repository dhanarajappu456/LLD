package carrental;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1) stubbing the data
        //remember it is fixed size array list == len(backed array)
        List<User> users = Arrays.asList(new User("amal", "343434"), new User("tony", "45454545"));
        Map<String, List<Store>> cityStores = new HashMap<>();


        Map<VehicleType, List<Vehicle>> vehicles1 = new HashMap<>();
        vehicles1.put(VehicleType.SUV, Arrays.asList(new Vehicle(545, 2013, 3594, VehicleType.SUV, 1000),
                new Vehicle(4344, 2013, 1443, VehicleType.SUV, 900)));
        vehicles1.put(VehicleType.SEDAN, Arrays.asList(new Vehicle(6565, 2013, 3594, VehicleType.SEDAN, 1000),
                new Vehicle(4656344, 2013, 1443, VehicleType.SEDAN, 900)));

        Map<VehicleType, List<Vehicle>> vehicles2 = new HashMap<>();
        vehicles2.put(VehicleType.SUV, Arrays.asList(new Vehicle(545, 2013, 3594, VehicleType.SUV, 1000),
                new Vehicle(4344, 2013, 1443, VehicleType.SUV, 900)));
        vehicles2.put(VehicleType.SEDAN, Arrays.asList(new Vehicle(6565, 2013, 3594, VehicleType.SEDAN, 1000),
                new Vehicle(4656344, 2013, 1443, VehicleType.SEDAN, 900)));
        Map<VehicleType, List<Vehicle>> vehicles3 = new HashMap<>();
        vehicles3.put(VehicleType.SEDAN, Arrays.asList(new Vehicle(6565, 2013, 3594, VehicleType.SEDAN, 1000),
                new Vehicle(4656344, 2013, 1443, VehicleType.SEDAN, 900)));
        VehicleInventoryManager manager1 = new VehicleInventoryManager(vehicles1);
        VehicleInventoryManager manager2 = new VehicleInventoryManager(vehicles2);
        VehicleInventoryManager manager3 = new VehicleInventoryManager(vehicles3);

        Store store1 = new Store(new Location("Mumbai"), manager1);
        Store store2 = new Store(new Location("Mumbai"), manager2);
        Store store3 = new Store(new Location("Delhi"), manager3);


        cityStores.put(
                "Mumbai", Arrays.asList(store1, store2)


        );
        cityStores.put(
                "Delhi", Arrays.asList(store3)


        );

        //2) mimicking flow with a user

        // user is amal
        User amal = users.get(0);
        //calling non existent store
        MainSystem system = new MainSystem(users, cityStores);
        System.out.println(system.getStoreByCity("Agra"));

        //calling stores at delhi
        List<Store> storesDelhi = system.getStoreByCity("Delhi");
        //choosing first store
        store1 = storesDelhi.get(0);

        // getting vehicles at the store
        Vehicle vehicle1 = store1.getVehicleByType(VehicleType.SEDAN).get(0);
        System.out.println("Vehicle interested with no: " + vehicle1.number);
        //choose the first vehicle, create the reservation
        Reservation reservation = store1.createReservation(amal, vehicle1);
        System.out.println("reservation created for suv " + vehicle1.number + " " + " cost per day: " + vehicle1.cost);
        // return the vehicle
        system.submitVehicle(store1, vehicle1, reservation);


    }
}
