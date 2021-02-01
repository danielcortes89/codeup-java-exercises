package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    String getString(){
        System.out.println("Type something in.");
        String input = scanner.next();
        return input;
    };

    boolean yesNo(){
        System.out.println("yes or no?");
        String input = scanner.next();
        if(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("Y")){
            return true;
        } else {
            return false;
        }
    }

    int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = scanner.nextInt();
        if(userInput > max || userInput < min){
            System.out.println("Try again");
            getInt(min, max);
        } else {
            System.out.println("Success " + userInput);
        }
        return userInput;
    }

    int getInt(){
        int userInput = scanner.nextInt();
        if(userInput > 10 || userInput < 1){
            System.out.println("Try again");
            getInt();
        } else {
            System.out.println("Success " + userInput);

        }
    return userInput;
    }

    double getDouble(double min, double max){
        double userInput = scanner.nextInt();
        if(userInput > max || userInput < min){
            System.out.println("Try again");
            getDouble(min, max);
        }
        System.out.println("Success " + userInput);
        return userInput;
    }

    double getDouble(){
        double userInput = scanner.nextInt();
        System.out.println("Enter a number between 1 and 10");
        if(userInput < 10 && userInput > 1){
            System.out.println("Try again");
            getDouble();
        }
        System.out.println("Success " + userInput);
        return userInput;
    }


}
