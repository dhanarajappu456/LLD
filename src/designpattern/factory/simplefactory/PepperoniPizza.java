package designpattern.factory.simplefactory;

public class PepperoniPizza implements IPizza {

    String type;

    PepperoniPizza(String type) {

        setPizzaIngredient(type);


    }

    @Override
    public void setPizzaIngredient(String type) {
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("preparing the " + this.type + " pizza...");
    }

    @Override
    public void bake() {
        System.out.println("baking the " + type + " pizza...");
    }

    @Override
    public void cut() {
        System.out.println("cutting the " + type + " pizza...");
    }

    @Override
    public void box() {
        System.out.println("packing and ready to deliver  the " + type + " pizza...");

    }
}
