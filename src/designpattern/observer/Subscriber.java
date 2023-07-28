package designpattern.observer;

public class Subscriber extends Observer {


    Subscriber(String name) {
        this.name = name;

    }

    @Override
    public void getNotified(String SubjectName, String msg) {

        System.out.println("Hey ," + this.name + ", " + SubjectName + " uploaded new video : " + msg);


    }
}
