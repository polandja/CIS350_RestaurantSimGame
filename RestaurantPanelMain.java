import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*************************************************************
 * Class RestaurantPanelMain of Restuarant Simulation Game
 * <p>
 * Creates a button panel to quit game.
 * 
 * @author Claire Grob, Hanna Halstead, and Jacqueline Poland
 * @version April 18, 2022
 ************************************************************/

public class RestaurantPanelMain extends JPanel {
    
    // JMenuItem quitItem
    private JMenuItem quitItem;
    private JMenuItem helpItem;
    private JMenuItem recipeBook;
    private RestaurantPanel restaurantPanel = new RestaurantPanel();

    public RestaurantPanelMain (JMenuItem quitItem, JMenuItem helpItem, JMenuItem recipeBook) {
        // Creating new JPanel panel
        JPanel panel = new JPanel();
        panel.add(restaurantPanel);
        add(panel);
    
        this.quitItem = quitItem;
        this.helpItem = helpItem;
        this.recipeBook = recipeBook;

        quitItem.addActionListener(new MyListener());
        helpItem.addActionListener(new MyListener());
        recipeBook.addActionListener(new MyListener());
    }

    public RestaurantPanel getPanel() {
        return restaurantPanel;
    }

    private class MyListener implements ActionListener {
        // On quitItem click, quit the game
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == quitItem) {
                System.exit(1);
            } 
            else if (e.getSource() == helpItem) {
                System.out.println("Help Button");
            }
            else if (e.getSource() == recipeBook) {
                RecipeBook recipeBookWindow = new RecipeBook();
            }
        }
    }
}
