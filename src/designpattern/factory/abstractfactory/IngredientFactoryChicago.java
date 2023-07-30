package designpattern.factory.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class IngredientFactoryChicago implements IngredientFactory {

    @Override
    public String getDough() {
        return "thin -  dough";
    }

    @Override
    public List<String> getToppings() {


        List toppings = new ArrayList(List.of("asparagus", "potato slices"));

        return toppings;

    }

    @Override
    public String getSauce() {
        return "chilly + tomato +   + garlic + sauce";
    }

    @Override
    public String getPepper() {
        return "Chicago special pepper";
    }
}
