package designpattern.factory.simplefactory;

public class SimpleFactory {


    IPizza createPIzza(String type) {


        IPizza pizza = null;

        if (type == "cheese") {
            pizza = new CheesePizza("cheese");
        } else if (type == "pepperoni") {


            pizza = new PepperoniPizza("pepperoni");

        }
        return pizza;

    }


}
