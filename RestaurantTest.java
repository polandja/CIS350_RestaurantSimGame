import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;

public class RestaurantTest{


    
    @Test
    public void menuItemTest(){
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Bun"));
        MenuItem burger = new MenuItem("burger", 10, burgerRec);

        assertEquals("burger", burger.getName());
        assertEquals(10, burger.getPrice(), .001);
        assertEquals(burgerRec, burger.getRecipe());
    }

    @Test
    public void testGetCurrMenuItem() {
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Bun"));
        MenuItem burger = new MenuItem("burger", 10, burgerRec);
        Order customer = new Order();
        customer.setCurrMenuItem(burger);

        assertEquals(burger, customer.getCurrMenuItem());
    }

    @Test
    public void testGetCustOrder() {
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Bun"));
        MenuItem burger = new MenuItem("burger", 10, burgerRec);
        Order customer = new Order();
        customer.setCurrMenuItem(burger);

        assertEquals(burgerRec, customer.getCurrMenuItem().getRecipe());
        assertEquals(customer.getCustOrder(), customer.getCurrMenuItem().getRecipe());
    }

    @Test
    public void testNextOrder() {
        
    }

    @Test
    public void testSetCurrMenuItem() {
        
    }

    @Test
    public void testSetCustOrder() {
        
    }
}