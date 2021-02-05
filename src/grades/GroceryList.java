package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class GroceryList {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Do you want to make a grocery list? yes/no");
        String start = input.getString();

        if(start.equalsIgnoreCase("yes")){
            HashMap<String, HashMap> groceryList = new HashMap<>();

            HashMap<String, Integer> fruit = new HashMap<>();
            HashMap<String, Integer> veg = new HashMap<>();
            HashMap<String, Integer> animal = new HashMap<>();

            groceryList.put("fruit", fruit);
            groceryList.put("veg", veg);
            groceryList.put("animal", animal);


            System.out.println("Want to add an item?");
            if(input.getString().equalsIgnoreCase("yes")){


//                if(ans.equalsIgnoreCase("fruit") || ans.equalsIgnoreCase("veg") || ans.equalsIgnoreCase("animal")){
//                    String nameToAdd;
//                    double quantityToAdd;
//
//                    System.out.println("Enter the item");
//                    nameToAdd = input.getString();
//
//                    System.out.println("And the amount?");
//                    quantityToAdd = input.getInt();
//
//                    HashMap target = groceryList.get(ans.toLowerCase());
//
//                    target.put(nameToAdd, quantityToAdd);
//
//                    System.out.println(target);
//                } else {
//                    System.out.println("Enter an actual category.");
//                }
                addItem(groceryList);
            }
        } else {
            System.out.println("Goodbye");
        }
    }

    public static void addItem(HashMap groceryList){
        Input input = new Input();

        System.out.println("Pick a category\n");

        System.out.println("fruit, veg or animal");
        String ans = input.getString();

        if(ans.equalsIgnoreCase("fruit") || ans.equalsIgnoreCase("veg") || ans.equalsIgnoreCase("animal")){
            String nameToAdd;
            double quantityToAdd;

            System.out.println("Enter the item");
            nameToAdd = input.getString();

            System.out.println("And the amount?");
            quantityToAdd = input.getInt();

            HashMap target = (HashMap) groceryList.get(ans.toLowerCase());

            target.put(nameToAdd, quantityToAdd);

            System.out.println(target);
        } else {
            System.out.println("Enter an actual category.");
            addItem(groceryList);
        }
    }
}
