import java.util.Scanner;



public class ConsoleExercises {
//    psvm tab
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %s", pi);

//        System.out.printf("Enter Something: ");
//        int userInput = scanner.nextInt();
//        System.out.printf("You entered: %s", userInput);


//        SCANNER CLASS
//        System.out.printf("Enter Three words: ");
//        String inputOne = scanner.next();
//        String inputTwo = scanner.next();
//        String inputThree = scanner.next();
//        System.out.printf("You entered: %s and %s and %s", inputOne, inputTwo, inputThree);

//        System.out.printf("Enter Something: ");
//        String userInput = scanner.nextLine();
//        System.out.printf("You entered: %s", userInput);

//        PERIMETER and AREA
        System.out.println("Enter length and width: ");
        String userInput = scanner.nextLine();
        String userInputTwo = scanner.nextLine();
        String userInputThree = scanner.nextLine();
        float result =  Float.parseFloat(userInput);
        float resultTwo =  Float.parseFloat(userInputTwo);
        float resultThree =  Float.parseFloat(userInputThree);
        Float perimeter = (result * 2) + resultTwo * 2;
        Float volume = result * resultTwo * resultThree;
        System.out.println("Area is: " + result * resultTwo + " And Perimeter is: " + perimeter + " And Volume is: " + volume);
    }
}
