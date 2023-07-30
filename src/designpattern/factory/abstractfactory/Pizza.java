package designpattern.factory.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

//    public void setPizzaIngredient(String content);
//    public void prepare();

    String name;
    String dough;
    String sauce;
    String pepper;
    List<String> toppings = new ArrayList<>();

    public abstract void prepare();

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
