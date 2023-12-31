package designpattern.factory.factorymethod;

public abstract class Store {


    Pizza pizza = null;

    public Pizza orderPizza(String type) {


        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
    //factory method : Store don't know which pizza object being instantiated
    public abstract Pizza createPizza(String type);

}
