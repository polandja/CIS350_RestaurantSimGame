/*
 * Class MenuItem of Restuarant Simulation Game
 * <p>
 * Contains methods meant to access/use MenuItem objects.
 * <p>
 * Each MenuItem is the dish name, the price, and the ingriends to make it.
 * 
 * @author Claire Grob, Hanna Halstead, & Jacqueline Poland
 * @version March 4, 2022
 **/

import java.util.*;
public class MenuItem {
    private String name;
    private double price;
    private ArrayList<String> recipe;

    /**
     * constructor MenuItem
     * 
     * @param inName the desired name of the new MenuItem.
     * @param inPrice the desired price of the new MenuItem.
     * @param inList the desired recipe of the new MenuItem.
     */
    public MenuItem(String inName, double inPrice, ArrayList<String> inList){
        this.name = inName;
        this.price = inPrice;
        this.recipe = inList;
    }

    /**
     * getter getName
     * 
     * @return String name of MenuItem.
     */
    public String getName(){
        return this.name;
    }

    /**
     * getter method
     * 
     * @return Double price of MenuItem.
     */
    public double getPrice(){
        return this.price;
    }

    /**
     * getter method.
     * 
     * @return StringList of ingredients of MenuItem.
     */
    public ArrayList<String> getRecipe(){
        return this.recipe;
    }

    /**
     * setter method - sets name of MenuItem.
     * 
     * @param newName name the menuItem will be set to.
     */
    public void setName(String newName){
        this.name = newName;
    }

    /** 
     * setter method-sets price of MenuItem
     * 
     * @param newPrice price the menuItem will be set to.
    */
    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    /**
     * setter method-sets name of recipe (a string list of ingredients).
     * 
     * @param newRecipe recipe the menuItem will be set to.
     */
    public void setRecipe(ArrayList<String> newRecipe){
        this.recipe = newRecipe;
    }

}
