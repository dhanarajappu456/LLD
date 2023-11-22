package practice.wrappers;

public class Chars {

    public static void main(String[] args) {
        //creating the char object
       // _____________________________
        // - method 1 - using autoboxing

        Character chars = 'A';

        //method 2 - using value of
        Character chars2  = Character.valueOf('A');
        System.out.println(chars+ "" + chars2);

        //some static methods in the character class
        //1. checking letter , digit , whitespaces - , space, tab, newline are whitespace
        Character.isLetter('A'); //treu
        Character.isDigit(89); //true
        Character.isWhitespace(' '); //true
        Character.isWhitespace('\t'); //true
        Character.isWhitespace('\n'); // true
        //2. check if upper , lower case

        Character.isUpperCase('a'); //false
        Character.isLowerCase('a');  //true
        //convert to upper lower case

        Character.toUpperCase('m');  // returns M
        Character.toLowerCase('M');   //returns m

        //convert to string Object

        String strChar  = Character.toString('u');


        //note that in all of these method you can pass the ascii value of the character, instead of the character itself








    }

}
