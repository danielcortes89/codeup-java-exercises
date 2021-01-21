import java.sql.SQLOutput;
import java.util.Scanner;


public class ConsoleExercises {
//    psvm tab
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %s", pi);

//        System.out.printf("Enter Something: ");
//        int userInput = scanner.nextInt();
//        System.out.printf("You entered: %s", userInput);


//        System.out.printf("Enter Three words: ");
//        String inputOne = scanner.next();
//        String inputTwo = scanner.next();
//        String inputThree = scanner.next();
//        System.out.printf("You entered: %s and %s and %s", inputOne, inputTwo, inputThree);

//        System.out.printf("Enter Something: ");
//        String userInput = scanner.nextLine();
//        System.out.printf("You entered: %s", userInput);

        System.out.println("Enter length and width: ");
        String userInput = scanner.nextLine();
        String userInputTwo = scanner.nextLine();
        int result =  Integer.parseInt(userInput);
        int resultTwo =  Integer.parseInt(userInputTwo);
        int perimeter = (result * 2) + resultTwo * 2;
        System.out.println("Area is: " + result * resultTwo + " And Perimeter is: " + perimeter);
    }
}
