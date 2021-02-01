package movies;

public class Movie {
    private String name;
    private String category;

    Movie(){
        name = "De fault";
        category = "None";
    }

    String getMovie(){
        return name;
    }

    String SetMovie(String newName){
        name = newName;
        return name;
    }
}
