import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//Restaurant Panel Class
public class RestaurantPanel extends JPanel {
    private OrderInProgress playerOrder = new OrderInProgress();
    private Order custOrder = new Order();

    // Initializing Hamburger
    ArrayList<String> burgerRec = new ArrayList<String>(Arrays.asList("Bun", "Patty", "Bun"));
    menuItem burger = new menuItem("burger", 10, burgerRec);

    // Initializing Cheeseburger
    ArrayList<String> cheeseBurgerRec = new ArrayList<String>(Arrays.asList("Bun", "Patty", "Cheese", "Bun"));
    menuItem cheeseBurger = new menuItem("cheese burger", 12, cheeseBurgerRec);

    // Initializing the Menu
    ArrayList<menuItem> menu = new ArrayList<menuItem>(Arrays.asList(burger, cheeseBurger));
    
    JButton bunButton;
    JButton pattyButton;
    JButton cheeseButton;
    JButton clearButton;
    JButton submitButton;
    JButton recipeBook;

    JTextArea custText;
    JTextArea playerText;

    JLabel restaurantBackground;
    ImageIcon restaurantImage;

    public RestaurantPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Bun Button
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.ipadx = 20;
        gbc.ipady = 40;

        bunButton = new JButton("Bun");
        add(bunButton, gbc);

        // Patty Button
        gbc.gridx = 1;
        gbc.gridy = 2;

        pattyButton = new JButton("Patty");
        add(pattyButton, gbc);

        // Cheese Button
        gbc.gridx = 2;
        gbc.gridy = 2;

        cheeseButton = new JButton("Cheese");
        add(cheeseButton, gbc);

        // Clear Button
        gbc.gridx = 0;
        gbc.gridy = 3;

        clearButton = new JButton("Clear");
        add(clearButton, gbc);

        // Submit Button
        gbc.gridx = 1;
        gbc.gridy = 3;

        submitButton = new JButton("Submit");
        add(submitButton, gbc);

        // Recipe Book
        gbc.gridx = 2;
        gbc.gridy = 3;

        recipeBook = new JButton("Recipe Book");
        add(recipeBook, gbc);

        // Customer Text
        gbc.gridx = 0;
        gbc.gridy = 0;

        custText = new JTextArea(1, 20);
        custText.setEditable(false);
        add(custText, gbc);
        custText.append("Hi, can I get a Hamburger?");
        
        // Player Text
        gbc.gridx = 1;
        gbc.gridy = 0;

        playerText = new JTextArea(1, 20);
        playerText.setEditable(false);
        add(playerText, gbc);

        // Restaurant Image        
        gbc.gridx = 1;
        gbc.gridy = 1;

        restaurantImage = new ImageIcon(getClass().getResource("Burger Restaurant.jpg"));
        restaurantBackground = new JLabel(restaurantImage);
        add(restaurantBackground, gbc);

        bunButton.addActionListener(new ButtonListener());
        pattyButton.addActionListener(new ButtonListener());
        cheeseButton.addActionListener(new ButtonListener());
        clearButton.addActionListener(new ButtonListener());
        submitButton.addActionListener(new ButtonListener());
        recipeBook.addActionListener(new ButtonListener());
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // Bun Button
            if (event.getSource() == bunButton) {
                playerOrder.addIngredient("Bun");
                playerText.append("Bun ");
            }
            // Patty Button
            if (event.getSource() == pattyButton) {
                playerOrder.addIngredient("Patty");
                playerText.append("Patty ");
            }
            // Cheese Button
            if (event.getSource() == cheeseButton) {
                playerOrder.addIngredient("Cheese");
                playerText.append("Cheese ");
            }
            // Clear Button
            if (event.getSource() == clearButton) {
                playerOrder.trash();
                playerText.setText("");
            }
            // Submit Button
            if (event.getSource() == submitButton) {
                playerText.setText("");
                if (playerOrder.checkCorrect(custOrder.getCustOrder())) {
                    custText.setText("Correct!");
                    playerOrder.submit(custOrder, menu);
                    custOrder.nextOrder(menu);
                    System.out.println(custOrder.getCustOrder());
                }
                else {
                    custText.setText("Incorrect, try again!");
                    playerOrder.submit(custOrder, menu);
                    custOrder.nextOrder(menu);
                    System.out.println(custOrder.getCustOrder());
                }
            }
            if (event.getSource() == recipeBook) {
                RecipeBook recipeBookWindow = new RecipeBook();
            }
        }
    }
}
