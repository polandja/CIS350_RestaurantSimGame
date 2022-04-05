import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*************************************************************
 * Class RestaurantPanelMain of Restuarant Simulation Game
 * <p>
 * Creates a button panel to quit game.
 * 
 * @author Claire Grob, Hanna Halstead, and Jacqueline Poland
 * @version March 4, 2022
 ************************************************************/
public class RestaurantPanelMain extends JPanel {
    
    // JMenuItem quitItem
    private JMenuItem quitItem;
    private RestaurantPanel restaurantPanel = new RestaurantPanel();

    public RestaurantPanelMain (JMenuItem quitItem) {
        // Creating new JPanel panel
        JPanel panel = new JPanel();
        panel.add(restaurantPanel);
        add(panel);
    
        this.quitItem = quitItem;

        quitItem.addActionListener(new MyListener());
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
        }
    }
}