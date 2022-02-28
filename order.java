import java.util.*;
public class Order {
    private ArrayList<String> custOrder;
    private MenuItem currMenuItem;

    //default constructor creating empty custOrder
    public Order(){
        this.custOrder = new ArrayList<String>() ;
        custOrder.add("Bun");
        custOrder.add("Patty");
        custOrder.add("Bun");
    }

    /**
     * getter method-
     * @return custOrder
     */
    public ArrayList<String> getCustOrder(){
        return custOrder; 
    }

    /**
     * setter method- 
     * @param inOrder
     */
    public void setCustOrder(ArrayList<String> inOrder){
        this.custOrder = inOrder;
    }

    /**
     * getter method-
     * @return currMenuItem
     */
    public MenuItem getCurrMenuItem(){
        return currMenuItem; 
    }

    /**
     * setter method- 
     * @param currMenuItem
     */
    public void setCurrMenuItem(MenuItem inItem){
        this.currMenuItem = inItem;
    }

    /**
     * method nextOder-
     * picks a random MenuItem from Menu and acceses the recipe
     * then assign that recipe to custOrder
     */
    public void nextOrder(ArrayList<MenuItem> inMenu){ 
        int randIndex = (int)(Math.random() * inMenu.size());
        custOrder = inMenu.get(randIndex).getRecipe();
        currMenuItem = inMenu.get(randIndex);
    }



    //Menu... where to put it? it's an array storing the MenuItems
    public static void main(String[] args) {

    }
}


