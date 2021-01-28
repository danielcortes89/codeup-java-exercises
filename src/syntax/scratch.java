package syntax;
import java.util.Scanner;

public class scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero ourHero = new Hero();
        int x_coor = 1;
        int y_coor = 1;

        System.out.println("Your health is " + ourHero.health);
        System.out.println("You parachuted on a cliff, where do you go?");
        String userDirection = scanner.nextLine();

        if(userDirection.equals("up")){
            y_coor = y_coor++;
            System.out.println(y_coor);
            System.out.println("You stepped on a mine.");
            ourHero.health = 90;
            System.out.println("Health is: " + ourHero.health);
        } else if(userDirection.equals("left")){
            stepLeft(x_coor);
        }


//        STEP LEFT
        x_coor = stepLeft(x_coor);
//        System.out.println(x_coor);

//        STEP RIGHT
        x_coor = stepRight(x_coor);
//        System.out.println(x_coor);
    }



    public static int stepRight(int position){

//        position++;
    return ++position;

    }

    public static int stepLeft(int position){
        return --position;
    }
}
