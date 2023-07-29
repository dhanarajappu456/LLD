package designpattern.factory.simple;

public class CheesePizza implements IPizza {


    String ingredient;

    CheesePizza(String ingredient) {

        setPizzaIngredient(ingredient);


    }

    @Override
    public void setPizzaIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
}
