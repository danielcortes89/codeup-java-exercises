import java.util.Scanner;

public class bob {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ask = "Sure.";
        String yell = "Whoa, chill out!";
        String nothing = "Fine. Be that way!";
        String allElse = "Whatever.";

        String reply = "";

        System.out.println("What do you want to say to bob?");

        String talk = in.nextLine();

        if(talk.endsWith("?")){
            reply = ask;
        } else if(talk.endsWith("!")){
            reply = yell;
        } else if(talk.endsWith("")){
            reply = nothing;
        } else {
            reply = allElse;
        }
        System.out.println(reply);
    }
}


