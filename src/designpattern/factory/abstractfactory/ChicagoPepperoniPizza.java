package designpattern.factory.abstractfactory;

public class ChicagoPepperoniPizza extends Pizza {


    IngredientFactory factory;

    public ChicagoPepperoniPizza(IngredientFactory fact) {


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
