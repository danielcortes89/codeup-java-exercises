import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");

        int myFavoriteNumber = 123;
        System.out.println(myFavoriteNumber);

        String myString = "3.14159";
        System.out.println(myString);

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(y);

        String greeting = "Salutations";
        String name = "codeup";
        System.out.printf("%s, %s!", greeting, name);

    }
}
