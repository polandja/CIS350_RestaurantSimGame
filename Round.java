import java.util.*;

/*************************************************************
 * Class Round of Restuarant Simulation Game
 * <p>
 * Making the rounds of the game function.
 * 
 * @author Claire Grob, Hanna Halstead, and Jacqueline Poland
 * @version April 18, 2022
 ************************************************************/

public class Round {
    private int roundNum;
    private double cashGoal;
    private int timeLimit; //in seconds
    private ArrayList<MenuItem> newMenuItems;

    //constructor
    public Round(double inCashGoal, int inTimeLimit, ArrayList<MenuItem> inMenuItems){
        this.cashGoal = inCashGoal;
        this.timeLimit = inTimeLimit;
        this.newMenuItems = inMenuItems;

        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList("bun", "patty", "bun"));
        MenuItem burger = new MenuItem("burger", 10, burgerRec);
        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList("bun", "patty", "cheese", "bun"));
        MenuItem cheeseBurger = new MenuItem("cheeseBurger", 12, cheeseBurgerRec);
        ArrayList<MenuItem> menu = new ArrayList<>(Arrays.asList(burger, cheeseBurger));

        this.newMenuItems = menu;
    }

    //default constructor
    public Round(){
        this.cashGoal = 50.0;
        this.timeLimit = 30;
    }

    public int getRoundNum(){
        return roundNum;
    }

    public void setRoundNum(int inNum){
        this.roundNum = inNum;
    }

    public double getCashGoal(){
        return cashGoal;
    }

    public void setCashGoal(double inGoal){
        this.cashGoal = inGoal;
    }

    public int getTimeLimit(){
        return timeLimit;
    }

    public void setTimeLimit(int inLimit){
        this.timeLimit = inLimit;
    }

    public ArrayList<MenuItem> getNewMenuItems(){
        return newMenuItems;
    }

    public void setNewMenuItems(ArrayList<MenuItem> inItems){
        this.newMenuItems = inItems;
    }
}
