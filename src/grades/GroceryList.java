package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryList {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Do you want to make a grocery list? yes/no");
        String start = input.getString();

        if(start.equalsIgnoreCase("yes")){
            HashMap<String, ArrayList> groceryList = new HashMap<>();


            ArrayList<HashMap> list = new ArrayList<>();
            System.out.println("Want to add an item?");
        } else {
            System.out.println("Goodbye");
        }
    }
}
