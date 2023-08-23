package designpattern.singleton;

public class Main {

    public static void main(String[] args) {
        // you cant directly create the object as constructor is private
        //Singleton  obj1 = new Singleton();

        int i = 0;
        while (i < 10) {


            Singleton obj = Singleton.getInstance();
            System.out.println(obj.hashCode());
            i += 1;
        }


    }
}
