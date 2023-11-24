package bookmyshow;

import java.util.List;

public class Booking {

    int id;
    List<Seat> seats;
    Show show;
    int amount;

    PaymentStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    void calculateAmount() {

        for (Seat seat : seats) {
            amount += seat.cost;
        }
    }

}
