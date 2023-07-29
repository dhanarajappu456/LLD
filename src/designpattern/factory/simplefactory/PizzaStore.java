package designpattern.factory.simplefactory;

public class PizzaStore {

    public IPizza orderPizza(String type) {

        SimpleFactory factory = new SimpleFactory();
        IPizza pizza = factory.createPIzza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;


    }
}



