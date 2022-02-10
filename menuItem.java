import java.util.*;
public class menuItem {
    private String name;
    //private int menuItemID;
    private double price;
    private ArrayList<String> recipe;

    public menuItem(String inName, double inPrice, ArrayList<String> inList){
        this.name = inName;
        this.price = inPrice;
        this.recipe = inList;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public ArrayList<String> getRecipe(){
        return this.recipe;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public void setRecipe(ArrayList<String> newRecipe){
        this.recipe = newRecipe;
    }




}
