package designpattern.factory.abstractfactory;

public class NewyorkCheesePizza extends Pizza {

    IngredientFactory factory;

    public NewyorkCheesePizza(IngredientFactory fact) {
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
