package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher extends Subject {


    Publisher(String channelName) {


        this.channelName = channelName;
        this.observers = new ArrayList<>();

    }

    @Override
    public void addObserver(Observer subscriber) {

        observers.add(subscriber);


    }

    @Override
    public void removeObserver(Observer subscriber) {

        observers.remove(subscriber);
    }

    @Override
    public void notifyObserver(String msg) {

        for (Observer sub : observers) {
            sub.getNotified(channelName, msg);
        }


    }
}
