package movies;

public class Movie {
    private String name;
    private String category;

    Movie(){
        this.name = "Default";
        this.category = "None";
    }
    Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    String getMovie(){
        return this.name;
    }

    String getCategory(){
        return this.category;
    }

    String SetMovie(String newName){
        this.name = newName;
        return this.name;
    }
}
