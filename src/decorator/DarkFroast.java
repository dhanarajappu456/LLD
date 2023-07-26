package decorator;

public class DarkFroast  extends Beverage{


    @Override
    public String getDescription() {
        return "Decorator.DarkFroast";
    }

    @Override
    public double getCost() {
        return 50;
    }
}
