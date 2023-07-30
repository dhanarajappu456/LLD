package designpattern.factory.abstractfactory;

public class NewyorkPepperoni extends Pizza {

    IngredientFactory factory;

    public NewyorkPepperoni(IngredientFactory fact) {

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
