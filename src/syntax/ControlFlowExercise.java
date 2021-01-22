package syntax;

public class ControlFlowExercise {
    public static void main(String[] args) {
        int i = 1;

        while(i < 101){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
                i++;
                continue;
            }
            if(i % 5 == 0){
                System.out.println("Buzz");
                i++;
                continue;
            }
            if(i % 3 == 0){
                System.out.println("Fizz");
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
