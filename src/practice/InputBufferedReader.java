package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputBufferedReader {

    public static void main(String[] args) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            String name;
            int age;

            System.out.println("enter the name");
            name = bf.readLine();
            System.out.println("enter the age");
            age = Integer.parseInt(bf.readLine());
            System.out.println("entered   name  is :" +  name);
            System.out.println("entered   age  is :" +  age);



        }
        catch (Exception e ){
            e.printStackTrace();
        }


    }
}
