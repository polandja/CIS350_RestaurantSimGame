import java.util.*;

public class OrderInProgress {

    private ArrayList<String> playerOrder;

    /**
     * default constructor-
     * creates empty playerOrder
     */
    public OrderInProgress() {
        this.playerOrder = new ArrayList<String>();
    }

    /**
     * getter getPlayerOrder
     * @return Arraylist of strings
     */
    public ArrayList<String> getPlayerOrder(){
        return playerOrder;
    }

    /**
     * method addIngredient-
     * puts ingre AKA ingrient into playerOrder
     * 
     * @param ingre
     */
    public void addIngredient(String ingre) {
        playerOrder.add(ingre);
    }

    /**
     * trash method-
     * removes all ingredients from the playerOrder
     */
    public void trash() {
        playerOrder.clear();
    }

    /**
     * checkCorrect method-
     * takes in current customer order
     * checks if the player made the order correctly
     * 
     * @param inCustOrder
     * @return true if correct
     */
    public boolean checkCorrect(ArrayList<String> inCustOrder) {
        if (inCustOrder.equals(this.playerOrder)) { // this. needed?
            return true;
        } else {
            return false;
        }
    }

    /**
     * submit method-
     * called on a player order object.
     * takes the expected customer order object, as well as the menu-
     * which needs to be created by first constructing every menu item (ie burger),
     * and then creating an array of those items to pass to the submit method
     * 
     * @param expected
     * @param inMenu
     */
    public void submit(Order expected, ArrayList<MenuItem> inMenu) {
        if (this.checkCorrect(expected.getCustOrder())) {
            // player order was correct
            expected.nextOrder(inMenu);
            //System.out.println("In submit if statement");
            // numOrder++
        }
        this.trash();
        // player was incorrect
        // possible penalty goes here
    }

}
