package designpattern.decorator;

public class DarkFroast  extends Beverage{


    @Override
    public String getDescription() {
        return "DarkFroast";
    }

    @Override
    public double getCost() {
        return 50;
    }
}
