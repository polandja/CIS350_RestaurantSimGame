import java.util.*;

public class orderInProgress {

    private ArrayList<String> playerOrder;

    //default constructor creating empty playerOrder
    public orderInProgress(){
        this.playerOrder = new ArrayList<String>() ;
    }

    //Add ingrediant methods (ingre AKA ingredient)
    public void addIngredient(String ingre){
        playerOrder.add(ingre);
    }

    //method, removes all ingredients from the playerOrder
    public void trash(){
        playerOrder.clear();
    }

    //checks if the player made the order correctly
    public boolean checkCorrect(ArrayList<String> inCustOrder){
        if(inCustOrder.equals(this.playerOrder)){
            return true;
        }
        else{
            return false;
        }
    }

    //submit method- called on a player order object.
    //takes the expected customer order object, as well as the menu-
    //which needs to be created by first constructing every menu item (ie burger),
    //and then creating an array of those items to pass to the submit method
    public void submit(order expected, ArrayList<menuItem> inMenu){
        if(this.checkCorrect(expected.getCustOrder())){
            expected.nextOrder(inMenu);
            //money++
            //numOrder++
        }
        this.trash();
        //possible penalty goes here
    }
    


    
}
