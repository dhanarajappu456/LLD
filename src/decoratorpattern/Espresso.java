package decoratorpattern;

public class Espresso  extends Beverage{


    @Override
    public String getDescription() {
        return "Espresso ";
    }

    @Override
    public double getCost() {
        return 10;
    }
}
