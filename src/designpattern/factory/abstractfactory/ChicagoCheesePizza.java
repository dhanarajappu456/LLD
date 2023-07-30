package designpattern.factory.abstractfactory;

public class ChicagoCheesePizza extends Pizza {


    IngredientFactory factory;

    public ChicagoCheesePizza(IngredientFactory fact) {


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
