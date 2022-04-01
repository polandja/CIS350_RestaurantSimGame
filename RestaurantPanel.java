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
 * @version April, 2022
 ************************************************************/

public class RestaurantPanel extends JPanel {

    // New OrderInProgress playerOrder
    private OrderInProgress playerOrder = new OrderInProgress();
    
    // New Order custOrder
    private Order custOrder = new Order();

    // New Menu menu
    private Menu menu = new Menu();

    // Button bunButton
    JButton bunButton;

    // Button pattyButton
    JButton pattyButton;

    // Button cheeseButton
    JButton cheeseButton;

    // Button lettuceButton
    JButton lettuceButton;

    // Button tomatoButton
    JButton tomatoButton;

    // Button onionButton
    JButton onionButton;

    // Button clearButton
    JButton clearButton;

    // Button submitButton
    JButton submitButton;

    // Button recipeBook
    JButton recipeBook;

    // JTextArea customerText
    JTextArea custText;

    // JTextArea playerText
    JTextArea playerText;

    JLabel restaurantBackground;
    JLabel moneyLabel;

    ImageIcon restaurantImage;

    public RestaurantPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = gbc.BOTH;
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

        // Location of lettuceButton
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.ipadx = 20;
        gbc.ipady = 20;

        // New lettuceButton
        lettuceButton = new JButton("Lettuce");
        add(lettuceButton, gbc);

        // Location of tomatoButton
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.ipadx = 20;
        gbc.ipady = 20;

        // New tomatoButton
        tomatoButton = new JButton("Tomato");
        add(tomatoButton, gbc);

        // Location of onionButton
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.ipadx = 20;
        gbc.ipady = 20;

        // New onionButton
        onionButton = new JButton("Onion");
        add(onionButton, gbc);

        // Location of clearButton
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.ipadx = 20;
        gbc.ipady = 20;        

        // New clearButton
        clearButton = new JButton("Clear");
        add(clearButton, gbc);

        // Location of submitButton
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.ipadx = 20;
        gbc.ipady = 20;

        // New submitButton
        submitButton = new JButton("Submit");
        add(submitButton, gbc);

        // Location of recipeBook
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 2;
        gbc.gridy = 4;
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
        restaurantImage = new ImageIcon(getClass().getResource("RestaurantImage1.png"));
        restaurantBackground = new JLabel(restaurantImage);
        add(restaurantBackground, gbc);

        // Location of moneyLabel
        gbc.gridwidth = 1;
        gbc.gridx = 4;
        gbc.gridy = 0;

        // New moneyLabel
        moneyLabel = new JLabel("Round Earnings: 0.0");
        add(moneyLabel, gbc);

        // Adding actionListeners
        bunButton.addActionListener(new ButtonListener());
        pattyButton.addActionListener(new ButtonListener());
        cheeseButton.addActionListener(new ButtonListener());
        lettuceButton.addActionListener(new ButtonListener());
        tomatoButton.addActionListener(new ButtonListener());
        onionButton.addActionListener(new ButtonListener());
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
            // On lettuceButton click, add to addIngredient and playerText
            if (event.getSource() == lettuceButton) {
                playerOrder.addIngredient("Lettuce");
                playerText.append("Lettuce ");
            }
            // On tomatoButton click, add to addIngredient and playerText
            if (event.getSource() == tomatoButton) {
                playerOrder.addIngredient("Tomato");
                playerText.append("Tomato ");
            }
            // On onionButton click, add to addIngredient and playerText
            if (event.getSource() == onionButton) {
                playerOrder.addIngredient("Onion");
                playerText.append("Onion ");
            }
            // On clearButton click, call trash and clear playerText
            if (event.getSource() == clearButton) {
                playerOrder.trash();
                playerText.setText("");
                moneyLabel.setText("Round Earnings: " + playerOrder.getPlayerMoney().toString());
            }
            // On submitButton click, check if playerOrder is correct, if so, move on, otherwise stay on current order
            if (event.getSource() == submitButton) {
                playerText.setText("");
                if (playerOrder.checkCorrect(custOrder.getCurrMenuItem())) {
                    playerOrder.submit(custOrder, menu.workingMenu);
                    moneyLabel.setText("Round Earnings: " + playerOrder.getPlayerMoney().toString());
                    custText.setText("");
                    custText.append("Thank you!");
                    custText.append("\n Hi, can I get a " + custOrder.getCurrMenuItem().getName() + "?");
                }
                else {
                    custText.append("\n That's not what I ordered!");
                    playerOrder.submit(custOrder, menu.workingMenu);
                }
            }
            // On recipeBook click, open recipeBook
            if (event.getSource() == recipeBook) {
                RecipeBook recipeBookWindow = new RecipeBook();
            }
        }
    }
}
