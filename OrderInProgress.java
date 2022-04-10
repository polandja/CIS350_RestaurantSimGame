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
 * @version April 18, 2022
 ************************************************************/
public class OrderInProgress {

    private ArrayList<String> playerOrder;
    private double roundMoney;
    private int wrongAttempts;

    /**
     * Default constructor OrderInProgress creates an empty playerOrder.
     */
    public OrderInProgress() {
        this.playerOrder = new ArrayList<String>();
        roundMoney = 0;
        wrongAttempts = 0;
    }

    /**
     * Method getPlayerOrder, returns the items in the current OrderInProgress
     * 
     * @return Arraylist of strings that is the player's order
     */
    public ArrayList<String> getPlayerOrder(){
        return playerOrder;
    }

    /**
     * Method getRoundMoney, returns the value of current OrderInProgress roundMoney
     * @return Double that is the player's round money
     */
    public Double getPlayerMoney(){
        return roundMoney;
    }

    public int getWrongAttempts(){
        return wrongAttempts;
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
        System.out.println("trash method called");
        double munDeducted = this.getPlayerOrder().size() * 3.00;
        this.roundMoney = this.getPlayerMoney() - munDeducted;
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
        double customerPayment = 0;
        //the player was correct:
        if (this.checkCorrect(expected.getCurrMenuItem())) {
            if(wrongAttempts==0){ //base pay + tip
            double tip = expected.getCurrMenuItem().calcTip();
            customerPayment = expected.getCurrMenuItem().getPrice() + tip;
            roundMoney += expected.getCurrMenuItem().getPrice() + tip;
            }
            if(wrongAttempts==1){ //base pay, no tip
                customerPayment = expected.getCurrMenuItem().getPrice();
                roundMoney += expected.getCurrMenuItem().getPrice();
            }
            if(wrongAttempts>=2){ // no money, no penalty
                customerPayment = 0;
                System.out.println("Customer gets this order free");
            }
            System.out.println("Customer payed you: " + customerPayment);
            System.out.println(roundMoney);
            wrongAttempts = 0;
            expected.nextOrder(inMenu);
        }
        else{ //the player was incorrect
            wrongAttempts ++;
            //if they submit the order incorrectly 3 times, the next customer appears and the player gets no money
            if(wrongAttempts >= 3){ 
                expected.nextOrder(inMenu);
                wrongAttempts = 0;
                System.out.println("Customer Left!");
            }
        }
        this.getPlayerOrder().clear();
    }

}
