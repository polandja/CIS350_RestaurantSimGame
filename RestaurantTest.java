import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.*;

public class RestaurantTest{


    //----tests for MenuItem class---------------------------

    @Test //tests the MenuItem constructor as well as it's setters
    public void menuItemGetTests(){
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Bun"));
        MenuItem burger = new MenuItem("burger", 10, burgerRec);

        assertEquals("burger", burger.getName());
        assertEquals(10, burger.getPrice(), .001);
        assertEquals(burgerRec, burger.getRecipe());
    }

    @Test //tests the MenuItem getter methods
    public void menuItemSetTests(){
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Bun"));
        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Cheese", "Bun"));
        MenuItem burger = new MenuItem("burger", 10, burgerRec);
        burger.setRecipe(cheeseBurgerRec);
        burger.setName("cheese burger");
        burger.setPrice(12);

        assertEquals(cheeseBurgerRec, burger.getRecipe());
        assertEquals("cheese burger", burger.getName());
        assertEquals(burger.getPrice(),12, .0001);
    }

    //--------tests for order class-----------------------

    @Test //tests the getCurrMenuItem method
    public void testGetCurrMenuItem() {
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Bun"));
        MenuItem burger = new MenuItem("burger", 10, burgerRec);
        Order customer = new Order();
        customer.setCurrMenuItem(burger);

        assertEquals(burger, customer.getCurrMenuItem());
    }

    @Test //tests the getCustOrder method
    public void testGetCustOrder() {
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Bun"));
        MenuItem burger = new MenuItem("burger", 10, burgerRec);
        Order customer = new Order();
        customer.setCurrMenuItem(burger);

        assertEquals(burgerRec, customer.getCurrMenuItem().getRecipe());
        assertEquals(burgerRec, customer.getCustOrder());
        assertEquals(customer.getCustOrder(), customer.getCurrMenuItem().getRecipe());
    }

    @Test //tests to make sure nextOrder assigns a menuItem within the menu 
    public void testNextOrder() {
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Bun"));
        MenuItem burger = new MenuItem("burger", 10, burgerRec);

        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Cheese", "Bun"));
        MenuItem cheeseBurger = new MenuItem("cheese burger", 12, cheeseBurgerRec);

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
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Bun"));
        MenuItem burger = new MenuItem("burger", 10, burgerRec);
        Order customer = new Order();
        customer.setCurrMenuItem(burger);

        assertEquals(burger, customer.getCurrMenuItem());

        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Cheese", "Bun"));
        MenuItem cheeseburger = new MenuItem("cheese burger", 12, cheeseBurgerRec);
        customer.setCurrMenuItem(cheeseburger);

    }

    @Test
    public void testSetCustOrder() {
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Bun"));
        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Cheese", "Bun"));
        Order customer = new Order();

        customer.setCustOrder(cheeseBurgerRec);
        assertEquals(cheeseBurgerRec, customer.getCustOrder());

        customer.setCustOrder(burgerRec);
        assertEquals(burgerRec, customer.getCustOrder());

    }

    //--------tests for orderInProgress class-----------------------
    @Test
    public void testAddIngrediant() {
        
    }
}