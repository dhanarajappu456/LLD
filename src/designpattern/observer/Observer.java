package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observer {

    String name;

    abstract void getNotified(String SubjectName, String msg);
}
