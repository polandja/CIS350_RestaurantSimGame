import java.util.*;

/*************************************************************
 * Class OrderInProgress of Restuarant Simulation Game
 * <p>
 * Contains methods that give functionality to player in creating the current customer order. 
 * <p>
 * "OrderInProgress" is the current dish being created by player.
 * Also contains a method to check if the order made by player was correct.
 * 
 * 
 * @author Claire Grob, Hanna Halstead, and Jacqueline Poland
 * @version March 4, 2022
 ************************************************************/
public class OrderInProgress {

    private ArrayList<String> playerOrder;

    /**
     * Default constructor OrderInProgress creates an empty playerOrder.
     */
    public OrderInProgress() {
        this.playerOrder = new ArrayList<String>();
    }

    /**
     * Method getPlayerOrder, puts ingre AKA ingrdient into playerOrder.
     * 
     * @return Arraylist of strings that is the player's order
     */
    public ArrayList<String> getPlayerOrder(){
        return playerOrder;
    }

    /**
     * AddIngredient puts ingredient selected by player into playerOrder.
     * 
     * @param ingre  an ingirent the player chose
     */
    public void addIngredient(String ingre) {
        playerOrder.add(ingre);
    }

    /**
     * Trash removes all ingredients from the playerOrder.
     */
    public void trash() {
        playerOrder.clear();
    }

    /**
     * CheckCorrect checks if the player made the order correctly.
     * <p>
     * Compares ingredient list of current customer's order to player's order in progress.
     * 
     * @param inCustOrder  current customer order
     * @return true  if correct
     */
    public boolean checkCorrect(MenuItem inMenuItem) {
        
        if (inMenuItem.getRecipe().equals(this.playerOrder)) { 
            return true;
        } else {
            return false;
        }
    }

    /**
     * Submit calls checkCorrect and gives a new customer order if correct. 
     * <p>
     * If incorrect, clears player order to try again.
     * 
     * @param expected  the correct order 
     * @param inMenu  the next order if correct
     */
    public void submit(Order expected, ArrayList<MenuItem> inMenu) {

        //the player was correct:
        if (this.checkCorrect(expected.getCurrMenuItem())) {
            expected.nextOrder(inMenu);
            //System.out.println("In submit if statement");
            // numOrder++
        }

        //the player was incorrect:
        this.trash();
        // possible penalty goes here
    }

}
