package designpattern.observer;

import java.util.List;

public abstract class Subject {

    List<Observer> observers;
    String channelName;

    abstract void addObserver(Observer subscriber);

    abstract void removeObserver(Observer subscriber);

    abstract void notifyObserver(String msg);
}
