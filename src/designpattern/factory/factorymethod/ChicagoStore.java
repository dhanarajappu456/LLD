package designpattern.factory.factorymethod;

public class ChicagoStore extends Store {

    @Override
    public Pizza createPizza(String type) {
        if (type == "cheese") {

            return new ChicagoCheesePizza();


        } else if (type == "pepperoni") {

            return new ChicagoPepperoniPizza();
        } else {

            return null;
        }
    }
}
