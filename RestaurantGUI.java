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

        // JMenuItem helpItem
        JMenuItem helpItem;

        // JMenuBar menus
        JMenuBar menus;

        // New fileMenu
        fileMenu = new JMenu("File");

        // New quitItem
        quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);

        // New helpItem
        helpItem = new JMenuItem("Help");
        fileMenu.add(helpItem);

        // New menus
        menus = new JMenuBar();
        menus.add(fileMenu);

        // New JFrame GUI
        JFrame gui = new JFrame("Restaurant Game");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame roundWindow
        JFrame roundWindow = new JFrame("Round Start");

        // New RestaurantPanelMain panel
        //RestaurantPanelMain panel = new RestaurantPanelMain(quitItem);
        //gui.getContentPane().add(panel);

        // New RestaurantPanelMain panel
        RestaurantPanelMain quitPanel = new RestaurantPanelMain(quitItem);
        gui.getContentPane().add(quitPanel);

        // New RestaurantPanelMain panel
        RestaurantPanelMain helpPanel = new RestaurantPanelMain(helpItem);
        gui.getContentPane().add(helpPanel);

        /*
        "Welcome to Burger Thyme!

        Don’t worry, our restaurant is easy to run. Before you is your workstation
         with fresh ingredients to fulfill orders for the awaiting customers!
        
        
        You’ll be slowly introduced to new recipes. If you ever forget one, you can
         glance at the Recipe Book!
        
        
        You have to build the customer order in the same order as the recipe book.
         Press Submit to deliver the finished customer order!
        
        
        If you submit a customer order right first try you get the menu item price +
         a tip! However, if you get a customer order right on the second try, you’ll
         only get the menu item price. If you get it right on the third try the
         customer gets the meal for free. 
        
        The customer will leave after 3 incorrect attempts!
        
        
        No taking off ingredients! If you mess up an order, you can restart by
         pressing Clear- but it’ll cost you $1 per ingredient wasted! 
        
        
        You’ll need to meet the day’s income quota to progress to the next day/ round.
         Careful not to run out of time!
        
        
        Press Begin to start playing!
        "
        */

        // New JLabel timer
        JLabel timer = new JLabel();

        // New JLabel roundLabel
        JLabel roundLabel = new JLabel();
        roundLabel.setText("Round: "); // + Round.getRoundNum()  or something??
        roundLabel.setBounds(50, 50, 50, 50);

        // New JLabel timeLabel
        JLabel timeLabel = new JLabel();
        timeLabel.setText("Time: ");
        timeLabel.setBounds(50, 80, 50, 50);

        // New JLabel moneyGoalLabel
        JLabel moneyGoalLabel = new JLabel();
        moneyGoalLabel.setText("Goal: $");
        moneyGoalLabel.setBounds(50, 110, 50, 50);

        // New JButton startButton
        JButton startButton = new JButton("Start");

        menus.add(Box.createHorizontalGlue());
        menus.add(timer);

        gui.pack();
        gui.setSize(1000, 1000);
        gui.setJMenuBar(menus);
        gui.setVisible(true);

        roundWindow.add(roundLabel);
        roundWindow.add(timeLabel);
        roundWindow.add(moneyGoalLabel);
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