package designpattern.factory.factorymethod;

public class Main {

    public static void main(String[] args) {
        Store newyork = new NewYorkStore();
        Pizza pizza = newyork.orderPizza("cheese");

    }

}
