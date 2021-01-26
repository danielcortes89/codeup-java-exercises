import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        double target = Math.floor(Math.random() * 100) + 1;
        System.out.println(target);
//        System.out.println("Guess a number between 1 and 100");
//        double userGuess = scanner.nextDouble();

        checkGuess(target);

    }

    public static void checkGuess(double target) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        double userGuess = scanner.nextDouble();

        if(userGuess > target){
            System.out.println("Your guess is to high.");
            checkGuess(target);
        } else if(userGuess < target){
            System.out.println("Your guess is too low");
            checkGuess(target);
        } else {
            System.out.println("GOOD");
            return;
        }
    }
}
