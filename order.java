import java.util.*;
public class order {
    private ArrayList<String> custOrder;

    //default constructor creating empty playerOrder
    public order(){
        this.custOrder = new ArrayList<String>() ;
    }

    public ArrayList<String> getCustOrder(){
        return custOrder; 
    }

    public void setCustOrder(ArrayList<String> inOrder){
        this.custOrder = inOrder;
    }

    //picks a random menuItem from Menu and acceses the recipe
    //then assign that recipe to custOrder
    public void nextOrder(ArrayList<menuItem> inMenu){ 
        int randIndex = (int)(Math.random() * inMenu.size());
        custOrder = inMenu.get(randIndex).getRecipe();
    }



    //Menu... where to put it? it's an array storing the menuItems
    public static void main(String[] args) {

    }
}


