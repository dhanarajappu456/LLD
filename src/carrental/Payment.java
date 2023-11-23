package carrental;

//payment object that is responsible for making payment with use of generated bill
public class Payment {

    Bill bill;

    Payment(Bill bill) {
        this.bill = bill;
    }

    boolean payBill() {
        bill.isPaid = true;
        System.out.println("bill paid by " + bill.reservation.user.name + " for " + bill.reservation.vehicle.number + " amount " + bill.calculateAmount());
        return true;

    }
}
