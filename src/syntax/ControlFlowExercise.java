package syntax;

public class ControlFlowExercise {
    public static void main(String[] args) {
        int i = 2;
        int max = 10000;

//        do{
//            System.out.println(i);
//            i += 2;
//        } while(i < 100);
//
//        do{
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);

        do{
            System.out.println(i);
            i = i * i;
        } while(i <= max);
    }
}
