package designpattern.factory.simple;

public class PepperoniPizza implements IPizza {

    String ingredient;

    PepperoniPizza(String ingredient) {

        setPizzaIngredient(ingredient);


    }

    @Override
    public void setPizzaIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
}
