package decorator;

public class Whip extends  CondimentDecorator {

    public Whip(Beverage bev) {
        beverageDecorated = bev;
    }

    @Override
    public String getDescription() {
        return beverageDecorated.getDescription() + "Decorator.Whip ";
    }

    @Override
    public double getCost() {

        return beverageDecorated.getCost() +  100;
    }
}