package designpattern.factory.abstractfactory;

public class StoreNewYork extends Store {

    // composition of objects of the type : abstract factory
    IngredientFactory newyorkFactory = new IngredientFactoryNewYork();

    @Override
    public Pizza createPizza(String type) {
        if (type == "cheese") {

            return new PizzaChicagoCheese(newyorkFactory);


        } else if (type == "pepperoni") {

            return new PizzaChicagoPepperoni(newyorkFactory);
        } else {

            return null;
        }
    }
}
