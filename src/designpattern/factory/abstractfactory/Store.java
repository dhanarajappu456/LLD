package designpattern.factory.abstractfactory;

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

    public abstract Pizza createPizza(String type);

}
