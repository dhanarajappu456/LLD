package practice.wrappers;

public class Bools {


    public static void main(String[] args) {
        //you can pass any string including null to the method , the string is evaluated in case insensitive
        // all values that matches true are evaluated as true , all vals otehr than this , including null , is false
        //converting the string to boolean (primitive)
        boolean bool  = Boolean.parseBoolean("tRue"); //true
        //converting the string or primitive boolean to Boolean object
        Boolean bool1  =Boolean.valueOf(null );  // false

        Boolean bool2  =Boolean.valueOf("haaai" );  // false

        Boolean bool3  =Boolean.valueOf(true );


        //convering the boolean primitive  object back to string - using static method

        String boolString = Boolean.toString(bool);
        System.out.println("boolstring from prmitive"  + boolString);

        //convering the Boolean object back to string - using object method

        String boolString1 = bool1.toString();
        System.out.println("boolstring from Boolean object "  + boolString);


        //retrieiving the boolean value from Boolean object
        boolean bool4   = bool1.booleanValue();

        //getting hashCode()

        //tru hash code is 1231
        // false hashcod is 1237
        System.out.println(Boolean.valueOf(true).hashCode()  +" "+ Boolean.valueOf(false).hashCode() );

        //checks if two bool objects values are same
        System.out.println("checking if both bool values are same" + bool1.equals(bool2));//return true
        System.out.println("checking if both bool values are same" + bool1.equals(null));//return false
        Boolean b1 = Boolean.valueOf(null);
        Boolean b2  = Boolean.valueOf(null);
        System.out.println("checking if both bool values are same" + b1.equals(b2)  ) ;//return true


        //comparing teo boolean object.

        // return
        // -1 - if first object is false and later is true
        // 1 if first object is true  and later is false

        b1 =  Boolean.valueOf("True");
        b2 = Boolean.valueOf("False");
        Boolean b3 = Boolean.valueOf("True");
        Boolean b4 = Boolean.valueOf(null);

        //comparing b1,b2,b3,b4
        System.out.println(b1.compareTo(b2));
        System.out.println(b1.compareTo(b3));
        System.out.println(b2.compareTo(b1));
        System.out.println(b1.compareTo(b4));

        //throws null pointer exception
        //System.out.println(b1.compareTo(null));

        //comparing the primiitive boolean - using static  method compare

        // creating boolean variable
        boolean b5 = true;
        boolean b6 = false;
        boolean b7 = true;
        boolean b8 = false;

        //comparing b1,b2,b3,b4
        System.out.println("compare primitives:\n");
        System.out.println(Boolean.compare(b5, b6));
        System.out.println(Boolean.compare(b5, b7));
        System.out.println(Boolean.compare(b6, b5));
        System.out.println(Boolean.compare(b6, b8));









    }

}
