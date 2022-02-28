import java.util.*;
public class MenuItem {
    private String name;
    //private int MenuItemID;
    private double price;
    private ArrayList<String> recipe;

    
    /**
     * constructor MenuItem
     * @param inName
     * @param inPrice
     * @param inList
     */
    public MenuItem(String inName, double inPrice, ArrayList<String> inList){
        this.name = inName;
        this.price = inPrice;
        this.recipe = inList;
    }

    /**
     * getter getName
     * @return name of MenuItem
     */
    public String getName(){
        return this.name;
    }

    /**
     * getter method
     * @return price of MenuItem
     */
    public double getPrice(){
        return this.price;
    }

    /**
     * getter method 
     * @return a string list of ingredients of MenuItem
     */
    public ArrayList<String> getRecipe(){
        return this.recipe;
    }

    /**
     * setter method-
     * sets name of MenuItem
     * @param newName
     */
    public void setName(String newName){
        this.name = newName;
    }

    /** 
     * setter method-
     * sets price of MenuItem
     * @param newPrice
    */
    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    /**
     * setter method-
     * sets name of recipe (a string list of ingredients)
     * @param newRecipe
     */
    public void setRecipe(ArrayList<String> newRecipe){
        this.recipe = newRecipe;
    }

}
