package designpattern.factory.abstractfactory;

public class Main {

    public static void main(String[] args) {
        Store newyork = new StoreNewYork();
        Pizza pizza = newyork.orderPizza("cheese");
        System.out.println(pizza.toppings);


    }

}
