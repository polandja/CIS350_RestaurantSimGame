import java.util.*;

/*
 * Class Order of Restuarant Simulation Game
 * <p>
 * Contains methods meant to access/use Order objects.
 * Also contains the ability to get a new order.
 * <p>
 * "Order" means a dish that the game's customer asks player to create. 
 *
 * @author Claire Grob, Hanna Halstead, and Jacqueline Poland
 * @version March 4, 2022
 **/
public class Order {
    private ArrayList<String> custOrder;
    private MenuItem currMenuItem;

    /**
     * Constructor Order, makes a default order with a menuItem and recipe.
     */
    public Order(){
        this.custOrder = new ArrayList<>() ;
        custOrder.add("Bun");
        custOrder.add("Patty");
        custOrder.add("Bun");
        
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Bun"));
        MenuItem burger = new MenuItem("burger", 10, burgerRec);
        this.currMenuItem = burger;
    }

    /**
     * Getter method, retreives the custOrder.
     * 
     * @return custOrder
     */
    public ArrayList<String> getCustOrder(){
        return custOrder; 
    }

    /**
     * Setter method, sets a new custOrder.
     * 
     * @param inOrder  the new recipe order that will be set
     */
    public void setCustOrder(ArrayList<String> inOrder){
        this.custOrder = inOrder;
    }

    /**
     * Getter method, retrieves the currMenuItem.
     * 
     * @return  currMenuItem
     */
    public MenuItem getCurrMenuItem(){
        return currMenuItem; 
    }

    /**
     * Setter method, sets a new currMenuItem.
     * 
     * @param inItem  the new menu Item
     */
    public void setCurrMenuItem(MenuItem inItem){
        this.currMenuItem = inItem;
    }

    /**
     * Method nextOder, picks a random MenuItem from Menu and acceses the recipe.
     * Then it assigns that recipe to custOrder
     * 
     * @param inMenu the new menu that it will be set to
     */
    public void nextOrder(ArrayList<MenuItem> inMenu){ 
        int randIndex = (int)(Math.random() * inMenu.size());
        
        custOrder = inMenu.get(randIndex).getRecipe();
        currMenuItem = inMenu.get(randIndex);
    }
}


