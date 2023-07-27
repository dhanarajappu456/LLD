package decoratorpattern;

public class Mocha extends  CondimentDecorator {

    public Mocha(Beverage bev) {
        beverageDecorated = bev;
    }

    @Override
    public String getDescription() {
        return beverageDecorated.getDescription() + "Mocha ";
    }

    @Override
    public double getCost() {

        return beverageDecorated.getCost() +  20;
    }
}
