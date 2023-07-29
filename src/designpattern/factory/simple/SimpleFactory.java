package designpattern.factory.simple;

public class SimpleFactory {


    IPizza createPIzza(String type) {


        IPizza pizza = null;
        System.out.println("creating the " + type + " pizza");
        if (type == "cheese") {
            pizza = new CheesePizza("cheese");
        } else if (type == "pepper") {

            pizza = new PepperoniPizza("pepper");

        }
        return pizza;

    }


}
