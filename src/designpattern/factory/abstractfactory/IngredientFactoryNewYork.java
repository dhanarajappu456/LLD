package designpattern.factory.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class IngredientFactoryNewYork implements IngredientFactory {


    @Override
    public String getDough() {
        return "White dough";
    }

    @Override
    public List<String> getToppings() {
        List toppings = new ArrayList(List.of("chilly", "tomato slices"));

        return toppings;
    }

    @Override
    public String getSauce() {
        return "tomato sauce + garlic";
    }

    @Override
    public String getPepper() {
        return "black pepper";
    }
}
