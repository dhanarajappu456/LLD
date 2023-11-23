package carrental;

//class for vehicle
public class Vehicle {

    int number;
    int year;
    int cc;
    VehicleType type;
    double cost;
    VehicleStatus status;

    public Vehicle(int number, int year, int cc, VehicleType type, double cost) {
        this.number = number;
        this.year = year;
        this.cc = cc;
        this.type = type;
        this.cost = cost;
    }
}
