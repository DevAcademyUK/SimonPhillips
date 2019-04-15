package backend.SundayRoast;

import java.util.ArrayList;
import java.util.Scanner;

public class makeRoast {

    SuperSundayRoast roast = new SuperSundayRoast();

    public static void main(String[] args) {
        makeRoast mr = new makeRoast();
        mr.addIngredients();
        mr.checkIngredients();
    }

    private void addIngredients() {
        roast.addIngredient(new Ingredient("Chicken", 12));
        roast.addIngredient(new Ingredient("Roast Potatoes", 200));
        roast.addIngredient(new Ingredient("Broccoli", 4));
        roast.addIngredient(new Ingredient("Cauliflower", 4));
        roast.addIngredient(new Ingredient("Peas", 7000));
        roast.addIngredient(new Ingredient("Carrots", 75));
        roast.addIngredient(new Ingredient("Cabbages", 4));
        roast.addIngredient(new Ingredient("Parsnips", 2));
        roast.addIngredient(new Ingredient("Brussel Sprouts", -1));
        roast.addIngredient(new Ingredient("Secret Ingredient", 1));
    }

    private void checkIngredients() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("So, you want to view the ingredient eh? password first!");
        String password = myScanner.nextLine();
        ArrayList<Ingredient> ingredients = roast.getIngredients(password);
        if (ingredients != null) {
            for (Ingredient i : ingredients) {
                System.out.println("Ingredient: " + i.ingredientName + ", Amount: " + i.ingredientQuantity);
            }
        } else
            System.out.println("Caught you!");
    }
}
