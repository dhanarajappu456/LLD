package designpattern.observer;

public class Main {

    public static void main(String[] args) {

        //simulating the subscription and the notification
        Subject weCode = new Publisher("weCode");
        Observer amal = new Subscriber("Ronny");
        Observer robert = new Subscriber("Robert");
        Observer john = new Subscriber("John");
        Observer alex = new Subscriber("Alex");
        // registering all the users to the weCode channel
        weCode.addObserver(amal);
        weCode.addObserver(robert);
        weCode.addObserver(john);
        weCode.addObserver(alex);
        // notifying the subscribed users
        weCode.notifyObserver("Concept of OOPS");

    }
}
