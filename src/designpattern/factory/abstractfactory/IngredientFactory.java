package designpattern.factory.abstractfactory;

import java.util.ArrayList;
import java.util.List;

// abstract factory
public interface IngredientFactory {


    // related products
    String getDough();

    List<String> getToppings();

    String getSauce();

    String getPepper();

}
