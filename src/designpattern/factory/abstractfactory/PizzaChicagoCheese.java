package designpattern.factory.abstractfactory;

public class PizzaChicagoCheese extends Pizza {


    IngredientFactory factory;

    public PizzaChicagoCheese(IngredientFactory fact) {


        setName("Chicago cheese pizza");
        factory = fact;

    }

    @Override
    public void prepare() {
        System.out.println("preparing the " + name + "....");
        dough = factory.getDough();
        sauce = factory.getSauce();
        toppings = factory.getToppings();
    }


}
