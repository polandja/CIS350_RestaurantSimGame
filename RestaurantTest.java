import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.*;

/*************************************************************
 * Class RestaurantTest of Restuarant Simulation Game
 * <p>
 * JUnit testing for back-end classes MenuItem, Order, and OrderInProgress.
 * 
 * @author Claire Grob, Hanna Halstead, and Jacqueline Poland
 * @version April 18, 2022
 ************************************************************/

public class RestaurantTest{

    //----tests for MenuItem class---------------------------
    static final String PATTY = "Patty";
    static final String BUN = "Bun";
    static final String CHEESE = "Cheese";
    static final String CHEESEBURGER = "cheese burger";
    static final String BURGER = "burger";

    @Test //tests the MenuItem constructor as well as it's setters
    public void menuItemGetTests(){
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        MenuItem burger = new MenuItem(BURGER, 10, burgerRec);

        assertEquals(BURGER, burger.getName());
        assertEquals(10, burger.getPrice(), .001);
        assertEquals(burgerRec, burger.getRecipe());
    }

    @Test //tests the MenuItem getter methods
    public void menuItemSetTests(){
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, CHEESE, BUN));
        MenuItem burger = new MenuItem(BURGER, 10, burgerRec);
        burger.setRecipe(cheeseBurgerRec);
        burger.setName(CHEESEBURGER);
        burger.setPrice(12);

        assertEquals(cheeseBurgerRec, burger.getRecipe());
        assertEquals(CHEESEBURGER, burger.getName());
        assertEquals(burger.getPrice(),12, .0001);
    }

    @Test //tests the calcTip method
    public void menuItemCalcTip(){
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        MenuItem burger = new MenuItem(BURGER, 10, burgerRec);

        double tip = burger.calcTip();
        assertEquals(tip, 1.5, .0001);
    }

    //--------tests for order class-----------------------

    @Test //tests setNumCust method in order class
    public void testSetNumCust(){
        Order customer = new Order();

        customer.setNumCust(5);
        assertEquals(5, customer.getNumCust());

        customer.setNumCust(2);
        assertEquals(2, customer.getNumCust());
    }

    @Test //tests getNumCust method in order class
    public void testGetNumCust(){
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        MenuItem burger = new MenuItem(BURGER, 10, burgerRec);

        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, CHEESE, BUN));
        MenuItem cheeseBurger = new MenuItem(CHEESEBURGER, 12, cheeseBurgerRec);

        ArrayList<MenuItem> menu = new ArrayList<>(Arrays.asList(burger, cheeseBurger));
        Order customer = new Order();

        assertEquals(1, customer.getNumCust());

        customer.nextOrder(menu);
        customer.nextOrder(menu);

        assertEquals(3, customer.getNumCust());
    }

    @Test //tests the getCurrMenuItem method
    public void testGetCurrMenuItem() {
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        MenuItem burger = new MenuItem(BURGER, 10, burgerRec);
        Order customer = new Order();
        customer.setCurrMenuItem(burger);

        assertEquals(burger, customer.getCurrMenuItem());
    }

    @Test //tests the getCustOrder method
    public void testGetCustOrder() {
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        MenuItem burger = new MenuItem(BURGER, 10, burgerRec);
        Order customer = new Order();
        customer.setCurrMenuItem(burger);

        assertEquals(burgerRec, customer.getCurrMenuItem().getRecipe());
        assertEquals(burgerRec, customer.getCustOrder());
        assertEquals(customer.getCustOrder(), customer.getCurrMenuItem().getRecipe());
    }

    @Test //tests to make sure nextOrder assigns a menuItem within the menu 
    public void testNextOrder() {
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        MenuItem burger = new MenuItem(BURGER, 10, burgerRec);

        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, CHEESE, BUN));
        MenuItem cheeseBurger = new MenuItem(CHEESEBURGER, 12, cheeseBurgerRec);

        ArrayList<MenuItem> menu = new ArrayList<>(Arrays.asList(burger, cheeseBurger));

        Order customer = new Order();
        customer.nextOrder(menu);

        boolean test = false;
        for (MenuItem element : menu) {
            if (element == customer.getCurrMenuItem()) {
                test = true;
                break;
            }
        }

        assertTrue(test);
    }

    @Test
    public void testSetCurrMenuItem() {
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        MenuItem burger = new MenuItem(BURGER, 10, burgerRec);
        Order customer = new Order();
        customer.setCurrMenuItem(burger);

        assertEquals(burger, customer.getCurrMenuItem());

        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, CHEESE, BUN));
        MenuItem cheeseburger = new MenuItem(CHEESEBURGER, 12, cheeseBurgerRec);
        customer.setCurrMenuItem(cheeseburger);

        assertEquals(cheeseburger, customer.getCurrMenuItem());

    }

    @Test
    public void testSetCustOrder() {
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, CHEESE, "BUN"));
        Order customer = new Order();

        customer.setCustOrder(cheeseBurgerRec);
        assertEquals(cheeseBurgerRec, customer.getCustOrder());

        customer.setCustOrder(burgerRec);
        assertEquals(burgerRec, customer.getCustOrder());

    }

    //--------tests for orderInProgress class-----------------------

    @Test //tests getPlayerOrder and orderInProgress Consrtuctor
    public void testGetPlayerOrder() {
        OrderInProgress worker = new OrderInProgress();
        ArrayList<MenuItem> ex = new ArrayList<MenuItem>();
        assertEquals(worker.getPlayerOrder(), ex);
    }

    @Test //tests getWrongAttempts
    public void testGetWrongAttempts() {
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        MenuItem burger = new MenuItem(BURGER, 10, burgerRec);
        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, CHEESE, BUN));
        MenuItem cheeseBurger = new MenuItem(CHEESEBURGER, 12, cheeseBurgerRec);
        ArrayList<MenuItem> menu = new ArrayList<>(Arrays.asList(burger, cheeseBurger));

        OrderInProgress worker = new OrderInProgress();

        worker.addIngredient(BUN);
        worker.addIngredient(PATTY);
        worker.addIngredient(BUN);

        Order customer = new Order();

        worker.submit(customer, menu);
        assertEquals(0, worker.getWrongAttempts());

        worker.addIngredient(BUN);
        worker.submit(customer, menu);
        assertEquals(1, worker.getWrongAttempts());

        worker.submit(customer, menu);
        assertEquals(2, worker.getWrongAttempts());

        worker.submit(customer, menu); //wrong attempts should reset after the 3rd wrong attempt
        assertEquals(0, worker.getWrongAttempts());

    }

    @Test//tests when a customer gets it right on the 2nd attempt
    public void test2ndAttempt() {
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        MenuItem burger = new MenuItem(BURGER, 10, burgerRec);
        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, CHEESE, BUN));
        MenuItem cheeseBurger = new MenuItem(CHEESEBURGER, 12, cheeseBurgerRec);
        ArrayList<MenuItem> menu = new ArrayList<>(Arrays.asList(burger, cheeseBurger));

        OrderInProgress worker = new OrderInProgress();

        worker.addIngredient(BUN);
        worker.addIngredient(PATTY);

        Order customer = new Order();
        worker.submit(customer, menu);
        assertEquals(1, worker.getWrongAttempts());

        worker.addIngredient(BUN);
        worker.addIngredient(PATTY);
        worker.addIngredient(BUN);
        worker.submit(customer, menu);
        //wrong attempts should reset after correct submision 
        assertEquals(0, worker.getWrongAttempts());
    }

    @Test//tests when a customer gets it right on the 3rd attemps
    public void test3rdAttempt(){
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        MenuItem burger = new MenuItem(BURGER, 10, burgerRec);
        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, CHEESE, BUN));
        MenuItem cheeseBurger = new MenuItem(CHEESEBURGER, 12, cheeseBurgerRec);
        ArrayList<MenuItem> menu = new ArrayList<>(Arrays.asList(burger, cheeseBurger));

        OrderInProgress worker = new OrderInProgress();

        worker.addIngredient(BUN);
        worker.addIngredient(PATTY);

        Order customer = new Order();
        worker.submit(customer, menu);
        assertEquals(1, worker.getWrongAttempts());

        worker.addIngredient(BUN);
        worker.addIngredient(PATTY);
        worker.addIngredient(PATTY);
        worker.submit(customer, menu);
        assertEquals(2, worker.getWrongAttempts());

        worker.addIngredient(BUN);
        worker.addIngredient(PATTY);
        worker.addIngredient(BUN);
        worker.submit(customer, menu);
        assertEquals(0, worker.getWrongAttempts());

    }

    //test getPlayerMoney
    @Test //tests getPlayerMoney method
    public void testGetPlayerMoney(){
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        MenuItem burger = new MenuItem(BURGER, 10, burgerRec);
        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, CHEESE, BUN));
        MenuItem cheeseBurger = new MenuItem(CHEESEBURGER, 12, cheeseBurgerRec);
        ArrayList<MenuItem> menu = new ArrayList<>(Arrays.asList(burger, cheeseBurger));

        OrderInProgress worker = new OrderInProgress();

        worker.addIngredient(BUN);
        worker.addIngredient(PATTY);
        worker.addIngredient(BUN);

        Order customer = new Order();

        worker.submit(customer, menu);
        assertEquals(11.5, worker.getPlayerMoney(), .005);

    }

    @Test //tests the add ingredient method
    public void testAddIngrediant() {
        OrderInProgress worker = new OrderInProgress();
        ArrayList<String> ex = new ArrayList<String>();

        ex.add("bun");
        worker.addIngredient("bun");
        assertEquals(worker.getPlayerOrder(), ex);
    }

    @Test //tests the trash button
    public void testTrash() {
        OrderInProgress worker = new OrderInProgress();
        ArrayList<String> ex = new ArrayList<String>();

        ex.add("bun");
        worker.addIngredient("bun");
        assertEquals(worker.getPlayerOrder(), ex);

        ex.clear();
        worker.trash();
        assertTrue(worker.getPlayerOrder().isEmpty());
    }

    @Test //tests checksCorrect
    public void testChecksCorrectWrong(){

        OrderInProgress worker = new OrderInProgress();
        worker.addIngredient(BUN);

        Order customer = new Order();

        boolean test = worker.checkCorrect(customer.getCurrMenuItem());
        assertEquals(test, false);
    }

    @Test //tests checksCorrect method
    public void testChecksCorrectRight(){

        OrderInProgress worker = new OrderInProgress();
        worker.addIngredient(BUN);
        worker.addIngredient(PATTY);
        worker.addIngredient(BUN);

        Order customer = new Order();

        assertEquals(worker.checkCorrect(customer.getCurrMenuItem()), true);
    }

    @Test //tests submit method
    public void testSubmit(){
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        MenuItem burger = new MenuItem(BURGER, 10, burgerRec);
        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, CHEESE, BUN));
        MenuItem cheeseBurger = new MenuItem(CHEESEBURGER, 12, cheeseBurgerRec);
        ArrayList<MenuItem> menu = new ArrayList<>(Arrays.asList(burger, cheeseBurger));

        Order customer = new Order();
        OrderInProgress worker = new OrderInProgress();
        worker.addIngredient(BUN);
        worker.addIngredient(PATTY);
        worker.addIngredient(BUN);

        worker.submit(customer, menu);
        assertTrue(worker.getPlayerOrder().isEmpty()); //makes sure submit clears players order
        boolean test = false;
        for (MenuItem element : menu) {
            if (element == customer.getCurrMenuItem()) {
                test = true; //checks that it selected a valid new menu Item for the next order
                break;
            }
        }

        assertTrue(test);
    }

    //--------tests for Round class-----------------------
    @Test //tests Round constructor
    public void testRoundConstructor(){
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, BUN));
        MenuItem burger = new MenuItem(BURGER, 10, burgerRec);
        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList(BUN, PATTY, CHEESE, BUN));
        MenuItem cheeseBurger = new MenuItem(CHEESEBURGER, 12, cheeseBurgerRec);
        ArrayList<MenuItem> menu = new ArrayList<>(Arrays.asList(burger, cheeseBurger));

        Round roundOne = new Round(20, 30, menu);
        assertEquals(20, roundOne.getCashGoal(), .005);
        assertEquals(30, roundOne.getTimeLimit(), .005);
        assertTrue(menu.contains(burger));
        assertTrue(menu.contains(cheeseBurger));
    }

    @Test //tests Round Num set and get
    public void testRoundNum(){
        Round example = new Round();
        example.setRoundNum(4);
        assertEquals(4, example.getRoundNum());
    }

    @Test //tests Round cashGoal set and get
    public void testRoundCashGoal(){
        Round example = new Round();
        example.setCashGoal(80.0);
        assertEquals(80, example.getCashGoal(), .005);
    }

    @Test //tests Round timeLimit set and get
    public void testRoundTimeLimit(){
        Round example = new Round();
        example.setTimeLimit(60);
        assertEquals(60, example.getTimeLimit(), .005);
    }

    @Test //tests Round newMenuItems set and get
    public void testRoundNewMenuItems(){
        Round example = new Round();

        ArrayList<String> saladRec = new ArrayList<String>(Arrays.asList("Lettuce", "Tomato", "Onion"));
        MenuItem salad = new MenuItem("Salad", 8, saladRec);

        ArrayList<MenuItem> newthings = new ArrayList<MenuItem>();
        newthings.add(salad);

        example.setNewMenuItems(newthings);
        ArrayList<MenuItem> expected = new ArrayList<MenuItem>();
        expected.add(salad);

        assertEquals(expected, example.getNewMenuItems());
    }
}