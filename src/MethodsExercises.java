import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        addition(2, 2);
//        subtraction(2, 2);
//        multiplication(2, 2);
//        division(2, 2);
//        modulus(2, 2);

        System.out.println("Enter a number between 1 and 10");
        int userInput = getInteger(1, 10);


//        System.out.println("Please enter an integer from 1 to 10");
//        getFactorial();

//        playGame();

    }

    public static void addition(int a, int b){
        System.out.println(a + b);
    }

    public static void subtraction(int a, int b){
        System.out.println(a - b);
    }

    public static void multiplication(int a, int b){
        System.out.println(a * b);
    }

    public static void division(int a, int b){
        System.out.println(a / b);
    }

    public static void modulus(int a, int b){
        System.out.println(a % b);
    }

    public static int getInteger(int a, int b){
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        if(guess < b && guess > a){
            System.out.println("Good");
            System.out.println(guess);
        } else {
            System.out.println("That won't fly");
            System.out.println("Once more.");
            getInteger(1, 10);
        }

        return 5;
    }

    public static long getFactorial(){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        int cleaned = Integer.parseInt(userInput);
        if(cleaned < 1 || cleaned > 10){
            cleaned = getFactorial("yes");
        }
//        WORK HERE
        long factorial = 1;
        for(long i=1; i <= cleaned; i++){
            factorial *= i;
        }
        System.out.println(factorial);
        System.out.println("Do you want to continue? yes or no.");;
        String continuePut = scanner.next();
        if(continuePut.equals("yes")){
            System.out.println(factorial * (cleaned + 1));
        }

        return factorial;
    }

    public  static  int getFactorial(String y){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick an integer between 1 and 10");

        String userInput = scanner.next();

        int cleaned = Integer.parseInt(userInput);

        while(cleaned > 10 || cleaned < 1){
            System.out.println("Pick an integer between 1 and 10");

            String userInputRedo = scanner.next();
            cleaned = Integer.parseInt(userInputRedo);
        }
        return cleaned;
    }

    public static void playGame(){
        System.out.println("How many sides do you want your dice to have?");
        Scanner scanner = new Scanner(System.in);

        String numSides = scanner.nextLine();
        int cleaned = Integer.parseInt(numSides);

        System.out.println("type yes to roll dice. Anything else to quit");
        String response = scanner.next();

        if(response.equals("yes")){
            rollDie(cleaned);
            System.out.println("Success");
            System.out.println("Play again? Type yes");
            String repeat = scanner.next();

            if (repeat.equals("yes")) {
                playGame();
            }
        }
    }

    public static void rollDie(int rollNum){
        double rollOne = Math.floor(Math.random() * rollNum);
        double rollTwo = Math.floor(Math.random() * rollNum);

        System.out.println("First Die: "  + rollOne);
        System.out.println("Second Die: "  + rollTwo);
//        return 5;
    }
}
