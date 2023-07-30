package designpattern.factory.abstractfactory;

public class PizzaNewyorkPepperoni extends Pizza {

    IngredientFactory factory;

    public PizzaNewyorkPepperoni(IngredientFactory fact) {

        setName("New york pepperoni pizza");
        factory = fact;

    }

    @Override
    public void prepare() {


        System.out.println("preparing the  " + name + "....");
        dough = factory.getDough();
        sauce = factory.getSauce();
        pepper = factory.getPepper();
        toppings = factory.getToppings();
    }
}
