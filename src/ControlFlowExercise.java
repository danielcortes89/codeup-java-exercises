import java.util.Scanner;


public class ControlFlowExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to");
        int userInput = scanner.nextInt();
        int i = 1;

        System.out.println("Here is your table!\n");

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        do{
            System.out.println(i + " | " + i * i + " | " + i * i * i);

            i++;
        }while(i <= userInput);
        System.out.println("Wanna go again?");
        String userContinue = scanner.next();
        if(userContinue.equals("y")){
            System.out.println(i + " | " + i * i + " | " + i * i * i);
        }

//        System.out.println(userInput + " | " + userInput * userInput + " | " + userInput * userInput * userInput);
//        while(i < 101){
//
//        }
    }
}