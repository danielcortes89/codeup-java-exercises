package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;
    Input(){
        this.scanner = new Scanner(System.in);
    }

    String getString(){
        System.out.println("Type something in.");
        String input = this.scanner.nextLine();
        return input;
    };

    boolean yesNo(){
        System.out.println("yes or no?");
        return this.scanner.nextBoolean();
//        return input;
    }

    int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max);

        while(true){
            int userInput = this.scanner.nextInt();
            if(userInput <= max && userInput >= min){
                return userInput;
            }
        }
    }

    int getInt(){
        return this.scanner.nextInt();
    }

    double getDouble(double min, double max){
        double userInput = this.scanner.nextInt();
        if(userInput > max || userInput < min){
            System.out.println("Try again");
            getDouble(min, max);
        }
        System.out.println("Success " + userInput);
        return userInput;
    }

    double getDouble(){
        double userInput = this.scanner.nextInt();
        System.out.println("Enter a number between 1 and 10");
        if(userInput < 10 && userInput > 1){
            System.out.println("Try again");
            getDouble();
        }
        System.out.println("Success " + userInput);
        return userInput;
    }


}
