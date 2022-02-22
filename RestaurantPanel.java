import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Restaurant Panel Class
public class RestaurantPanel extends JPanel {
    private orderInProgress currentOrder;
    
    JButton bunButton;
    JButton pattyButton;
    JButton cheeseButton;
    JButton recipeBook;
    JButton clearButton;

    public RestaurantPanel() {
        bunButton = new JButton("Bun");
        bunButton.setAlignmentY(1f);
        add(bunButton);

        pattyButton = new JButton("Patty");
        add(pattyButton);

        cheeseButton = new JButton("Cheese");
        add(cheeseButton);

        recipeBook = new JButton("Recipe Book");
        add(recipeBook);

        clearButton = new JButton("Clear");
        add(clearButton);

        bunButton.addActionListener(new ButtonListener());
        pattyButton.addActionListener(new ButtonListener());
        cheeseButton.addActionListener(new ButtonListener());
        recipeBook.addActionListener(new ButtonListener());
        clearButton.addActionListener(new ButtonListener());
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == bunButton) {
                System.out.println("Hamburger Bun");
            }
            if (event.getSource() == pattyButton) {
                System.out.println("Beef Patty");
            }
            if (event.getSource() == cheeseButton) {
                System.out.println("Cheddar Cheese");
            }
            if (event.getSource() == recipeBook) {
                RecipeBook recipeBookWindow = new RecipeBook();
            }
            if (event.getSource() == clearButton) {
                currentOrder.trash();
            }

        }
    }
}
