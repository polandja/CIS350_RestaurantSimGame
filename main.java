import java.util.*;

class Main{
    //Menu... where to put it? it's an array storing the MenuItems
    public static void main(String[] args) {
        //creating the different MenuItem objects
        //---------------------------------------------
        
        //initializing burger
        //round 1 menu item 
        ArrayList<String> burgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Bun"));
        MenuItem burger = new MenuItem("burger", 10, burgerRec);

        //initializing cheeseburger
        //round 1 menu item 
        ArrayList<String> cheeseBurgerRec = new ArrayList<>(Arrays.asList("Bun", "Patty", "Cheese", "Bun"));
        MenuItem cheeseBurger = new MenuItem("cheese burger", 12, cheeseBurgerRec);

        //Initializing the menu
        ArrayList<MenuItem> menu = new ArrayList<>(Arrays.asList(burger, cheeseBurger));
    }
}
