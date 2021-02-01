package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Movie[] allFilms = MoviesArray.findAll();
        System.out.println("What would you like to do??");

        System.out.println("0 - exit");
        System.out.println("1 - views all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - views movies in the scifi category");

        System.out.print("Enter your choice ");

        String userSelection = input.getString();
        if(userSelection.equals("0")){
            System.out.println("Goodbye");
        } else if(userSelection.equals("1")){
            System.out.println("Here they are\n");

            for(Movie film : allFilms){
                System.out.println(displayFilm(film));
            }
        } else if(userSelection.equals("2")){
            System.out.println("Animated films\n");

            for(Movie film : allFilms){
                if(film.getCategory().equals("animated")){
                    System.out.println(displayFilm(film));
                }
            }
        }
        else if(userSelection.equals("3")){
            System.out.println("Drama Queen\n");

            for(Movie film : allFilms){
                if(film.getCategory().equals("drama")){
                    System.out.println(displayFilm(film));
                }
            }
        }
        else if(userSelection.equals("4")){
            System.out.println("The Horror!");

            for(Movie film : allFilms){
                if(film.getCategory().equals("horror")){
                    System.out.println(displayFilm(film));
                }
            }
        }
        else if(userSelection.equals("5")){
            System.out.println("Sci fi....");

            for(Movie film : allFilms){
                if(film.getCategory().equals("scifi")){
                    System.out.println(displayFilm(film));
                }
            }
        } else {
            System.out.println("Come back when you're serious");
        }
    }

    public static String displayFilm(Movie singleMovie){
        String title = singleMovie.getMovie();
        String category = singleMovie.getCategory();

        return title + ", " + category;
    }
}
