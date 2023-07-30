package designpattern.factory.abstractfactory;

public class PizzaNewyorkCheese extends Pizza {

    IngredientFactory factory;

    public PizzaNewyorkCheese(IngredientFactory fact) {
        setName("New york cheese pizza");
        factory = fact;

    }

    @Override
    public void prepare() {
        System.out.println("preparing the" + name + "....");
        dough = factory.getDough();
        sauce = factory.getSauce();
        toppings = factory.getToppings();
    }
}
