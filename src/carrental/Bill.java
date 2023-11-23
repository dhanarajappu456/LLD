package carrental;

import java.util.Date;

public class Bill {
    boolean isPaid = false;
    Reservation reservation;

    Bill(Reservation reservation) {
        this.reservation = reservation;
        reservation.endDate = new Date(2023, 11, 25);


    }

    double calculateAmount() {
        return (reservation.endDate.getTime() - reservation.startDate.getTime()) / (1000 * 60 * 60 * 24) * reservation.vehicle.cost;
    }


}
