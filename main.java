import java.util.*;

class main{
    //Menu... where to put it? it's an array storing the menuItems
    public static void main(String[] args) {
        //creating the different menuItem objects
        //---------------------------------------------
        
        //initializing burger
        ArrayList<String> burgerRec = new ArrayList<String>(Arrays.asList("Bun", "Patty", "Bun"));
        menuItem burger = new menuItem("burger", 10, burgerRec);

        //initializing cheeseburger
        ArrayList<String> cheeseBurgerRec = new ArrayList<String>(Arrays.asList("Bun", "Patty", "Cheese", "Bun"));
        menuItem cheeseBurger = new menuItem("cheese burger", 12, cheeseBurgerRec);

        //Initializing the menu
        ArrayList<menuItem> menu = new ArrayList<menuItem>(Arrays.asList(burger, cheeseBurger));
    }
}
