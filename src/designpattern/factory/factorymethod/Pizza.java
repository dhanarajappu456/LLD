package designpattern.factory.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

//    public void setPizzaIngredient(String content);
//    public void prepare();

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare() {

        System.out.println("preparing " + name + "...");
    }

    public void bake() {
        System.out.println("bake for 35 mins");
    }

    ;

    public void cut() {
        System.out.println("cut into slices");
    }

    ;

    public void box() {
        System.out.println("box it in large box");
    }


}
