package designpattern.factory.abstractfactory;

public class ChicagoStore extends Store {


    IngredientFactory chicagoFactory = new ChicagoIngredientFactory();

    @Override
    public Pizza createPizza(String type) {
        if (type == "cheese") {

            return new ChicagoCheesePizza(chicagoFactory);


        } else if (type == "pepperoni") {

            return new ChicagoPepperoniPizza(chicagoFactory);
        } else {

            return null;
        }
    }
}
