package designpattern.factory.simple;

public class PizzaStore {

    public static void main(String[] args) {

        SimpleFactory factory = new SimpleFactory();
        CheesePizza pizza = (CheesePizza) factory.createPIzza("cheese");

        System.out.println(pizza.ingredient);


    }
}
