import java.util.*;
public class order {
    private ArrayList<String> custOrder;

    //default constructor creating empty playerOrder
    public void custOrder(){
        this.custOrder = new ArrayList<String>() ;
    }

    public ArrayList<String> getCustOrder(){
        return custOrder; 
    }

    public void setCustOrder(ArrayList<String> inOrder){
        this.custOrder = inOrder;
    }

    //nextOrder
    public void nextOrder(ArrayList<menuItem> inMenu){
        //pick random menuItem from Menu and acces the recipe
        //then assign that recipe to custOrder
        //Math.random() * (max - min + 1) + min  
        int randIndex = (int)(Math.random() * ( inMenu.size() + 1));
    }



    //Menu... where to put it? it's an array storing the menuItems
    public static void main(String[] args) {

    }
}


