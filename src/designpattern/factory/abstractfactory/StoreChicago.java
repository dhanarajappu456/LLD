package designpattern.factory.abstractfactory;

public class StoreChicago extends Store {


    IngredientFactory chicagoFactory = new IngredientFactoryChicago();

    @Override
    public Pizza createPizza(String type) {
        if (type == "cheese") {

            return new PizzaChicagoCheese(chicagoFactory);


        } else if (type == "pepperoni") {

            return new PizzaChicagoPepperoni(chicagoFactory);
        } else {

            return null;
        }
    }
}
