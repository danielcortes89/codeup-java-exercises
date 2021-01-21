import java.util.Scanner;


public class ConsoleExercises {
//    psvm tab
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s", pi);

//        System.out.printf("Enter Something: ");
//        int userInput = scanner.nextInt();
//        System.out.printf("You entered: %s", userInput);
        System.out.printf("Enter Three words: ");
        String inputOne = scanner.next();
        String inputTwo = scanner.next();
        String inputThree = scanner.next();
        System.out.printf("You entered: %s and %s and %s", inputOne, inputTwo, inputThree);
    }
}
