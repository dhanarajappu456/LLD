package carrental;

import java.util.*;

public class Reservation {

    User user;
    Vehicle vehicle;
    ReservationStatus status;

    Date startDate;
    Date endDate;


    Reservation createReservation(User user, Vehicle vehicle) {
        this.user = user;
        this.vehicle = vehicle;
        //hardCoding the date
        startDate = new Date(2023, 11, 22);
        status = ReservationStatus.INPROGRESS;
        return this;

    }
}
