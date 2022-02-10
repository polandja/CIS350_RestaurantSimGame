import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestaurantPanel extends JPanel {
    JButton bunButton;

    public RestaurantPanel() {
        bunButton = new JButton("Hamburger Bun");
        add(bunButton);

        bunButton.addActionListener(new ButtonListener());
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == bunButton) {
                System.out.println("Hamburger Bun");
            }
        }
    }
}
