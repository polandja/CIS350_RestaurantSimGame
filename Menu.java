import java.util.*;

/*
 * Class Menu of Restuarant Simulation Game
 * <p>
 * Defines MenuItems as their name, price, and ingredient list.
 * Contains working menu array.
 * 
 * @author Claire Grob, Hanna Halstead, and Jacqueline Poland
 * @version April 18, 2022
 **/

public class Menu {

    // Initializing Hamburger
    ArrayList<String> burgerRec = new ArrayList<String>(Arrays.asList("Bun", "Patty", "Bun"));
    MenuItem burger = new MenuItem("Hamburger", 10, burgerRec);

    // Initializing CheeseBurger
    ArrayList<String> cheeseBurgerRec = new ArrayList<String>(Arrays.asList("Bun", "Patty", "Cheese", "Bun"));
    MenuItem cheeseBurger = new MenuItem("CheeseBurger", 11, cheeseBurgerRec);

    // Initializing AmericanBurger
    ArrayList<String> americanBurgerRec = new ArrayList<String>(Arrays.asList("Bun", "Patty", "Cheese", "Lettuce", "Tomato", "Bun"));
    MenuItem americanBurger = new MenuItem("AmericanBurger", 15, americanBurgerRec);
   
    // Initializing QuarterPounder
    ArrayList<String> quarterPounderRec = new ArrayList<String>(Arrays.asList("Bun", "Patty", "Onion", "Bun", "Patty", "Cheese", "Bun"));
    MenuItem quarterPounder = new MenuItem("QuarterPounder", 18, quarterPounderRec);
    
    // Initializing AmericanBurger
    ArrayList<String> veggieBurgerRec = new ArrayList<String>(Arrays.asList("Bun", "Cheese", "Lettuce", "Tomato", "Onion", "Bun"));
    MenuItem veggieBurger = new MenuItem("VeggieBurger", 15, veggieBurgerRec);

    // Initializing Salad
    ArrayList<String> saladRec = new ArrayList<String>(Arrays.asList("Lettuce", "Tomato", "Onion"));
    MenuItem salad = new MenuItem("Salad", 8, saladRec);

    // Initializing Fries
    ArrayList<String> friesRec = new ArrayList<String>(Arrays.asList("Fries"));
    MenuItem fries = new MenuItem("Fries", 3, friesRec);

    // Initializing LoadedFries
    ArrayList<String> loadedFriesRec = new ArrayList<String>(Arrays.asList("Fries", "Patty", "Cheese"));
    MenuItem loadedFries = new MenuItem("LoadedFries", 5, loadedFriesRec);

    // Initializing IceCream
    ArrayList<String> iceCreamRec = new ArrayList<String>(Arrays.asList("IceCream"));
    MenuItem iceCream = new MenuItem("IceCream", 3, iceCreamRec);

    // Initializing the Menu
    //This is round depedent
    ArrayList<MenuItem> workingMenu = new ArrayList<MenuItem>(Arrays.asList(burger, cheeseBurger));
}