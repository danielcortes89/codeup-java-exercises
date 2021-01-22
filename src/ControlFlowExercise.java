import java.util.Scanner;


public class ControlFlowExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What was you score?");
        int gradeInput = scanner.nextInt();

        String grade = "hold";

        System.out.println("Wanna see your Number grade?");
        String gradeContinue = scanner.next();

        if(gradeContinue.equals("y")){
            if(gradeInput > 87){
                grade = "A";
            } else if(gradeInput < 88 && gradeInput >79){
                grade = "B";
            } else if(gradeInput < 80 && gradeInput > 66){
                grade = "C";
            } else if(gradeInput < 67 && gradeInput > 59){
                grade = "D";
            } else if(gradeInput < 60) {
                grade = "F";
            }
        }
        System.out.println(grade);
    }
}