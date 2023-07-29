package designpattern.factory.simplefactory;

public class Main {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        store.orderPizza("cheese");
        System.out.print("...................................\n");
        store.orderPizza("pepperoni");
    }
}
