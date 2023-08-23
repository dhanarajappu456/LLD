package designpattern.singleton;

public class Singleton {


    private static Singleton singletonInstance = null;

    private Singleton() {


    }

    static Singleton getInstance() {

        if (singletonInstance == null) {
            singletonInstance = new Singleton();
            return singletonInstance;
        }
        return singletonInstance;

    }
}
