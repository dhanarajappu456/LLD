package designpattern.factory.simplefactory;

public class CheesePizza implements IPizza {


    String type;

    CheesePizza(String ingredient) {

        setPizzaIngredient(ingredient);


    }

    @Override
    public void setPizzaIngredient(String ingredient) {
        this.type = ingredient;
    }


    @Override
    public void prepare() {
        System.out.println("preparing the " + type + " pizza...");
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


