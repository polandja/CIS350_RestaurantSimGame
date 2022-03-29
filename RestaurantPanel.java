import java.util.*;
import java.util.Timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*************************************************************
 * Class RestaurantPanel of Restuarant Simulation Game
 * <p>
 * Contains the framework for the game itself.
 * <p>
 * Connects the front-end visual framework to the back-end functionality.
 * 
 * @author Claire Grob, Hanna Halstead, and Jacqueline Poland
 * @version March 4, 2022
 ************************************************************/
public class RestaurantPanel extends JPanel {
    
    //New Round Counter
    public int round = 0; 
    public boolean passedRound = true; 

    /*
    public void metRoundEarningCheck(timer){
        if (time= 0){
            if (neededRoundEarnings >= playerRoundEarnings){
                passedRound = true;
                totalEarnings += playRoundEarnings; 
                PlayerRoundEarnings = 0;
            }
            else{
                passedRound = false;
                playerRoundEarning = 0; 
            }
        }
    }

    public void beginNextRound(boolean passedRound, begin button action listener){
        if begin clicked & passedRound = true
            round++
            start running game
    }

    */


    // New OrderInProgress playerOrder
    private OrderInProgress playerOrder = new OrderInProgress();
    
    // New Order custOrder
    private Order custOrder = new Order();


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
    ArrayList<MenuItem> menu = new ArrayList<MenuItem>(Arrays.asList(burger, cheeseBurger));

    
    // Button bunButton
    JButton bunButton;

    // Button pattyButton
    JButton pattyButton;

    // Button cheeseButton
    JButton cheeseButton;

    // Button clearButton
    JButton clearButton;

    // Button submitButton
    JButton submitButton;

    // Button recipeBook
    JButton recipeBook;

    JTextArea custText;
    JTextArea playerText;

    JLabel restaurantBackground;
    JLabel timerText = new JLabel();

    ImageIcon restaurantImage;

    public RestaurantPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = gbc.BOTH;
        //gbc.anchor = gbc.CENTER;
        gbc.weightx = 1.0;

        // Location of bunButton

        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.ipadx = 20;
        gbc.ipady = 20;

        // New bunButton
        bunButton = new JButton("Bun");
        add(bunButton, gbc);

        // Location of pattyButton
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 20;
        gbc.ipady = 20;

        // New pattyButton
        pattyButton = new JButton("Patty");
        add(pattyButton, gbc);

        // Location of cheeseButton
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.ipadx = 20;
        gbc.ipady = 20;

        // New cheeseButton
        cheeseButton = new JButton("Cheese");
        add(cheeseButton, gbc);

        // Location of clearButton
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.ipadx = 20;
        gbc.ipady = 20;        

        // New clearButton
        clearButton = new JButton("Clear");
        add(clearButton, gbc);

        // Location of submitButton
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.ipadx = 20;
        gbc.ipady = 20;

        // New submitButton
        submitButton = new JButton("Submit");
        add(submitButton, gbc);

        // Location of recipeBook
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.ipadx = 20;
        gbc.ipady = 20;

        // New recipeBook
        recipeBook = new JButton("Recipe Book");
        add(recipeBook, gbc);

        // Location of custText
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;

        // New custText
        custText = new JTextArea(1, 5);
        custText.setEditable(false);
        add(custText, gbc);
        custText.append("Hi, can I get a Hamburger?");
        
        // Location of playerText
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 0.5;

        // New playerText
        playerText = new JTextArea(1, 5);
        playerText.setEditable(false);
        add(playerText, gbc);

        // Location of restaurantImage
        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 1; 

        // New restaurantImage
        restaurantImage = new ImageIcon(getClass().getResource("RestaurantImage3.png"));
        restaurantBackground = new JLabel(restaurantImage);
        add(restaurantBackground, gbc);

        // Adding actionListeners
        bunButton.addActionListener(new ButtonListener());
        pattyButton.addActionListener(new ButtonListener());
        cheeseButton.addActionListener(new ButtonListener());
        clearButton.addActionListener(new ButtonListener());
        submitButton.addActionListener(new ButtonListener());
        recipeBook.addActionListener(new ButtonListener());
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // On bunButton click, add to addIngredient and playerText
            if (event.getSource() == bunButton) {
                playerOrder.addIngredient("Bun");
                playerText.append("Bun ");
            }
            // On pattyButton click, add to addIngredient and playerText
            if (event.getSource() == pattyButton) {
                playerOrder.addIngredient("Patty");
                playerText.append("Patty ");
            }
            // On cheeseButton click, add to addIngredient and playerText
            if (event.getSource() == cheeseButton) {
                playerOrder.addIngredient("Cheese");
                playerText.append("Cheese ");
            }
            // On clearButton click, call trash and clear playerText
            if (event.getSource() == clearButton) {
                playerOrder.trash();
                playerText.setText("");
            }
            // On submitButton click, check if playerOrder is correct, if so, move on, otherwise stay on current order
            if (event.getSource() == submitButton) {
                playerText.setText("");
                if (playerOrder.checkCorrect(custOrder.getCurrMenuItem())) {
                    playerOrder.submit(custOrder, menu);
                    //custOrder.nextOrder(menu);
                    custText.setText("");
                    custText.append("Thank you!");
                    custText.append("\nHi, can I get a " + custOrder.getCurrMenuItem().getName() + "?");
                }
                else {
                    custText.append("\nThat's not what I ordered!");
                    playerOrder.submit(custOrder, menu);
                }
            }
            //On recipeBook click, open recipeBook
            if (event.getSource() == recipeBook) {
                RecipeBook recipeBookWindow = new RecipeBook();
            }
        }
    }
}
