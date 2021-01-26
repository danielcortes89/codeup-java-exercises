package syntax;
import java.util.Scanner;

public class scratch {
    public static void main(String[] args) {
        Hero ourHero = new Hero();
        System.out.println("Your health is " + ourHero.health);
        System.out.println("You parachuted on a cliff, where do you go?");
        String start = "1";
        String position = start;
        System.out.println(start);

        position += start;
        System.out.println(position);

//        position = position + "." + start;
        position = stepRight(position, start);
        System.out.println(position);

        int ender = Integer.parseInt(start);
        ender++;

        String cleanedEnder = String.valueOf(ender);


        position = position.replace(start, cleanedEnder);
        System.out.println(position);
    }

    public static String stepRight(String position, String start){

        if(position.indexOf(".", 0) > -1){
            position = position + start;

            return position;
        } else {
            position = position + "." + start;
            return position;
        }

//        System.out.println("forwards or backwards?");
    }
}
