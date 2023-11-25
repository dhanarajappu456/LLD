package bookmyshow;

import bookmyshow.enums.PaymentStatus;

public class Payment {
    int id;
    Booking booking;

    Payment(Booking booking) {
        this.booking = booking;
    }

    void payBill() {
        booking.status = PaymentStatus.PAID;
        System.out.println("Paid the bill amount = " + booking.amount);
    }


}
