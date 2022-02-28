import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Restaurant Panel Class
public class RestaurantPanel extends JPanel {
    private orderInProgress currentOrder = new orderInProgress();
    
    JButton bunButton;
    JButton pattyButton;
    JButton cheeseButton;
    JButton clearButton;
    JButton submitButton;
    JButton recipeBook;

    JTextArea orderText;

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

        // Order Text
        gbc.gridx = 1;
        gbc.gridy = 0;

        orderText = new JTextArea(1, 20);
        orderText.setEditable(false);
        add(orderText, gbc);

        // Restaurant Image        
        gbc.gridx = 1;
        gbc.gridy = 1;

        restaurantImage = new ImageIcon(getClass().getResource("RestaurantImage.jpg"));
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
                currentOrder.addIngredient("Patty");
                orderText.append("Bun ");
            }
            // Patty Button
            if (event.getSource() == pattyButton) {
                currentOrder.addIngredient("Patty");
                orderText.append("Patty ");
            }
            // Cheese Button
            if (event.getSource() == cheeseButton) {
                currentOrder.addIngredient("Cheese");
                orderText.append("Cheese ");
            }
            // Clear Button
            if (event.getSource() == clearButton) {
                currentOrder.trash();
                orderText.setText("");
            }
            // Submit Button
            if (event.getSource() == submitButton) {
                //currentOrder.submit(expected, inMenu);
                System.out.println("Submit!");
            }
            if (event.getSource() == recipeBook) {
                RecipeBook recipeBookWindow = new RecipeBook();
            }
        }
    }
}
