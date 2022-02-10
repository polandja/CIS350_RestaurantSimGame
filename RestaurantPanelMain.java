import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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