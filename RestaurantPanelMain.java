import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*************************************************************
 * Class RestaurantPanelMain of Restuarant Simulation Game
 * <p>
 * Creates a button panel to quit game.
 * 
 * @author Claire Grob, Hanna Halstead, & Jacqueline Poland
 * @version March 4, 2022
 ************************************************************/
public class RestaurantPanelMain extends JPanel {
    
    private JMenuItem quitItem;

    public RestaurantPanelMain (JMenuItem quitItem) {
        JPanel panel = new JPanel();
        panel.add(new RestaurantPanel());
        add(panel);
    
        this.quitItem = quitItem;

        quitItem.addActionListener(new MyListener());
    }

    private class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == quitItem) {
                System.exit(1);
            }
        }
    }
}