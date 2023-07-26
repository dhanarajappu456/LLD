package decorator;

public class Espresso  extends Beverage{


    @Override
    public String getDescription() {
        return "Decorator.Espresso ";
    }

    @Override
    public double getCost() {
        return 10;
    }
}
