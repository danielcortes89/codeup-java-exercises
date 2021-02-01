package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        String input = this.scanner.nextLine();
        return input;
    };

    public boolean yesNo(){
        System.out.println("yes or no?");
        String answer = this.scanner.nextLine();
        if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
//        return answer;
//        return input;
    }

    public int getInt(int min, int max){
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

    public double getDouble(double min, double max){
        double userInput = this.scanner.nextInt();
        if(userInput > max || userInput < min){
            System.out.println("Try again");
            getDouble(min, max);
        }
        System.out.println("Success " + userInput);
        return userInput;
    }

    public double getDouble(){
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
