import java.util.*;
import java.util.Timer;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*************************************************************
 * Class RestaurantGUI of Restuarant Simulation Game
 * <p>
 * Creates the framework of the GUI to host a game. 
 * 
 * @author Claire Grob, Hanna Halstead, and Jacqueline Poland
 * @version April 18, 2022
 ************************************************************/
public class RestaurantGUI extends RestaurantPanel {
    public static void main(String[] args) {
        // JMenu fileMenu
        JMenu fileMenu;

        // JMenuItem quitItem
        JMenuItem quitItem;

        // JMenuItem helpItem
        JMenuItem helpItem;

        // JMenuItem recipeBook
        JMenuItem recipeBook;

        // JMenuBar menus
        JMenuBar menus;

        // roundCounter 
        int[] roundCounter = {1};

        // New fileMenu
        fileMenu = new JMenu("File");

        // New quitItem
        quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);

        // New helpItem
        helpItem = new JMenuItem("Help");
        fileMenu.add(helpItem);

        recipeBook = new JMenuItem("Recipe Book");
        fileMenu.add(recipeBook);

        // New menus
        menus = new JMenuBar();
        menus.add(fileMenu);

        // New JFrame GUI
        JFrame gui = new JFrame("Restaurant Game");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame roundWindow
        JFrame roundWindow = new JFrame("Round Start");
        roundWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New RestaurantPanelMain panel
        RestaurantPanelMain panel = new RestaurantPanelMain(quitItem, helpItem, recipeBook);
        gui.getContentPane().add(panel);

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

        // New JLabel roundCheck
        JLabel roundCheck = new JLabel();
        roundCheck.setText("");
        roundCheck.setBounds(75, 50, 125, 25);

        // New JLabel roundLabel
        JLabel roundLabel = new JLabel();
        roundLabel.setText("Round 1");
        roundLabel.setBounds(95, 75, 100, 25);

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
        
        // roundWindow created
        roundWindow.add(roundLabel);
        roundWindow.add(roundCheck);
        roundWindow.add(startButton);
        roundWindow.pack();
        roundWindow.setSize(250, 250);
        roundWindow.setLayout(null);
        roundWindow.setVisible(true);

        // startButton created
        startButton.setBounds(70, 100, 100, 25);

        // Adding timer to menus 
        menus.add(Box.createHorizontalGlue());
        menus.add(timer);

        Timer countdownTimer = new Timer();

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // roundWindow disappears
                roundWindow.setVisible(false);;
                
                // gui created
                gui.pack();
                gui.setSize(1000, 1000);
                gui.setJMenuBar(menus);
                gui.setVisible(true);

                if (roundCounter[0] == 1) {
                    countdownTimer.scheduleAtFixedRate(new TimerTask() {
                        int seconds = 120;
                        
                        public void run() {
                            timer.setText("Time Left: " + seconds);
                            seconds--;
            
                            if (seconds <= 0) {
                                double moneyEarned = Double.parseDouble(panel.getPanel().moneyLabel.getText());
                                //countdownTimer.cancel();
                                gui.setVisible(false);

                                if (moneyEarned >= 120) {
                                    roundCounter[0] = 2;
                                    roundCheck.setText("You passed Round 1!");
                                    roundLabel.setText("Round 2");
                                    roundWindow.setVisible(true);
                                }
                                else {
                                    roundCheck.setText("You failed! Play again?");
                                    roundWindow.setVisible(true);
                                    seconds = seconds + 121;
                                }
                            }
                        }  
                    }, 0, 1000);
                } else if (roundCounter[0] == 2) {
                    countdownTimer.scheduleAtFixedRate(new TimerTask() {
                        int seconds = 110;

                        @Override
                        public void run() {
                            timer.setText("Time Left: " + seconds);
                            seconds--;

                            if (seconds <= 0) {
                                double moneyEarned = Double.parseDouble(panel.getPanel().moneyLabel.getText());
                                gui.setVisible(false);

                                if (moneyEarned >= 130) {
                                    roundCounter[0] = 3;
                                    roundCheck.setText("You passed Round 2!");
                                    roundLabel.setText("Round 3");
                                    roundWindow.setVisible(true);
                                }
                                else {
                                    roundCheck.setText("You failed! Play again?");
                                    roundWindow.setVisible(true);
                                    seconds = seconds + 111;
                                }
                            }   
                        }  
                    }, 0, 1000);
                }
            }
        });
    }
}
