package designpattern.factory.abstractfactory;

public class NewYorkStore extends Store {


    IngredientFactory newyorkFactory = new NewYorkIngredientFactory();

    @Override
    public Pizza createPizza(String type) {
        if (type == "cheese") {

            return new ChicagoCheesePizza(newyorkFactory);


        } else if (type == "pepperoni") {

            return new ChicagoPepperoniPizza(newyorkFactory);
        } else {

            return null;
        }
    }
}
