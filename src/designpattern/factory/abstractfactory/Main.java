package designpattern.factory.abstractfactory;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Store newyork = new NewYorkStore();
        Pizza pizza = newyork.orderPizza("cheese");
        System.out.println(pizza.toppings);


    }

}
