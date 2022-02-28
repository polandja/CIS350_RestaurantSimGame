import java.util.*;
public class Order {
    private ArrayList<String> custOrder;

    /**
     * default constructor-
     * creates an empty playerOrder
     */
    public Order(){
        this.custOrder = new ArrayList<String>() ;
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
     * method nextOder-
     * picks a random MenuItem from Menu and acceses the recipe
     * then assign that recipe to custOrder
     */
    public void nextOrder(ArrayList<MenuItem> inMenu){ 
        int randIndex = (int)(Math.random() * inMenu.size());
        custOrder = inMenu.get(randIndex).getRecipe();
    }



    //Menu... where to put it? it's an array storing the MenuItems
    public static void main(String[] args) {

    }
}


