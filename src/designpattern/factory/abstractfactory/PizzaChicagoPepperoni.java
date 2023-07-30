package designpattern.factory.abstractfactory;

public class PizzaChicagoPepperoni extends Pizza {


    IngredientFactory factory;

    public PizzaChicagoPepperoni(IngredientFactory fact) {


        setName("Chicago pepperoni pizza");
        factory = fact;

    }

    @Override
    public void prepare() {
        System.out.println("preparing the  " + name + "....");
        dough = factory.getDough();
        sauce = factory.getSauce();
        toppings = factory.getToppings();
    }
}
