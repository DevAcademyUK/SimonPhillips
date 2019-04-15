package backend.SundayRoast;

import java.util.ArrayList;

public class SuperSundayRoast {

    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    ArrayList<String> guestList = new ArrayList<String>();

    public void addIngredient(Ingredient i) {
        guestList.add("");

        if (guestList.contains(i.ingredientName)) {
            this.ingredients.add(i);
        } else {
            System.out.println("Exterminate!");
        }
    }

    public ArrayList<Ingredient> getIngredients(String password) {
        if (password.equals("strongpassword123")) {
            return this.ingredients;
        } else
            return null;
    }


}

