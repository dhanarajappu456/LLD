package decorator;


public class Main {
    public static void main(String[] args) {

        CondimentDecorator  bev1 = new Mocha(new Mocha(new Espresso()));

        System.out.printf( "\n%s %.2f", bev1.getDescription()  , bev1.getCost());


        // darkfroast with whip
        CondimentDecorator  bev2= new Whip(new DarkFroast());

        System.out.format( "\n%s %.2f" ,bev2.getDescription()  , bev2.getCost());





    }
}