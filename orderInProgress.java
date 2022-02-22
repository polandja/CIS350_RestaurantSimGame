import java.util.*;

public class orderInProgress {

    private ArrayList<String> playerOrder;

    //default constructor creating empty playerOrder
    public void orderInProgress(){
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

    public boolean checkCorrect(ArrayList<String> inCustOrder){
        if(inCustOrder.equals(playerOrder)){
            return true;
        }
        else{
            return false;
        }
    }

    //submit method
        //call checksCorrect - checks to see if playerOrder is === custOrder
        //if correct, next customer + trash playerOrder
        //else trash playerOrder
    


    
}
