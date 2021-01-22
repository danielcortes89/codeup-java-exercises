import java.util.Scanner;

public class bob {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ask = "Sure.";
        String yell = "Whoa, chill out!";
        String nothing = "Fine. Be that way!";
        String allElse = "Whatever.";

        System.out.println("What do you want to say to bob?");

        String talk = in.nextLine();

        System.out.println(talk);
    }
}
