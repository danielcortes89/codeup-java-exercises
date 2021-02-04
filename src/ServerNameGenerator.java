import java.util.Random;

public class ServerNameGenerator {
    String[] adjectives = {
            "happy",
            "beautiful",
            "adorable",
            "small",
            "gregarious",
            "Gorgeous",
            "meaningless",
            "nice",
            "harsh",
            "Super"

    };
    String[] nouns = {
            "Dog",
            "cat",
            "House",
            "Gym",
            "Doug",
            "Cindy",
            "Bike",
            "Car",
            "Tiger",
            "Wolf"
    };
    public static String randomElement(String[] array){
        Random rn = new Random();
        int randomIndex = rn.nextInt(9);
        return array[randomIndex];
    }
//    String noun = randomElement(nouns);
//    String adjective = randomElement(adjectives);


    public static void main(String[] args) {
        String[] adjectives = {
                "happy",
                "beautiful",
                "adorable",
                "small",
                "gregarious",
                "Gorgeous",
                "meaningless",
                "nice",
                "harsh",
                "Super"

        };
        String[] nouns = {
                "Dog",
                "cat",
                "House",
                "Gym",
                "Doug",
                "Cindy",
                "Bike",
                "Car",
                "Tiger",
                "Wolf"
        };
        String noun = randomElement(nouns);
        String adjective = randomElement(adjectives);
        System.out.println("Here is your Server name: ");
        System.out.println(noun + "-" + adjective);
    }
}
