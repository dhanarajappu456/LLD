package designpattern.factory.factorymethod;

public class NewYorkStore extends Store {


    @Override
    public Pizza createPizza(String type) {
        if (type == "cheese") {

            return new NewyorkCheese();


        } else if (type == "pepperoni") {

            return new NewyorkPepperoni();
        } else {

            return null;
        }
    }
}
