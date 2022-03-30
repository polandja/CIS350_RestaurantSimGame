import java.util.*;
import java.util.Timer;
import javax.swing.*;

/*************************************************************
 * Class RestaurantGUI of Restuarant Simulation Game
 * <p>
 * Creates the framework of the GUI to host a game. 
 * 
 * @author Claire Grob, Hanna Halstead, and Jacqueline Poland
 * @version March 4, 2022
 ************************************************************/
public class RestaurantGUI {
    public static void main(String[] args) {
        // JMenu fileMenu
        JMenu fileMenu;

        // JMenuItem quitItem
        JMenuItem quitItem;

        // JMenuBar menus
        JMenuBar menus;

        // New fileMenu
        fileMenu = new JMenu("File");

        // New quitItem
        quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);

        // New menus
        menus = new JMenuBar();
        menus.add(fileMenu);

        // New JFrame GUI
        JFrame gui = new JFrame("Restaurant Game");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame roundWindow
        JFrame roundWindow = new JFrame("Round Start");

        // New RestaurantPanelMain panel
        RestaurantPanelMain panel = new RestaurantPanelMain(quitItem);
        gui.getContentPane().add(panel);

        // New JLabel timer
        JLabel timer = new JLabel();

        // New JLabel roundLabel
        JLabel roundLabel = new JLabel();
        roundLabel.setText("Round");
        roundLabel.setBounds(50, 50, 50, 50);

        // New JButton startButton
        JButton startButton = new JButton("Start");

        menus.add(Box.createHorizontalGlue());
        menus.add(timer);

        gui.pack();
        gui.setSize(1000, 1000);
        gui.setJMenuBar(menus);
        gui.setVisible(true);

        roundWindow.add(roundLabel);
        roundWindow.add(startButton);
        roundWindow.pack();
        roundWindow.setSize(250, 250);
        roundWindow.setLayout(null);
        roundWindow.setVisible(true);

        Timer countdownTimer = new Timer();

        countdownTimer.scheduleAtFixedRate(new TimerTask() {
            int i = 60;

            public void run() {
                timer.setText("Time left: " + i);
                i--;

                if (i < 0) {
                    countdownTimer.cancel();
                    timer.setText("Time Over");
                }
            }
            
        }, 0, 1000);

    }
}