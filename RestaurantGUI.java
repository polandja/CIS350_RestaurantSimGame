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
 * @version March 4, 2022
 ************************************************************/
public class RestaurantGUI extends RestaurantPanel {
    public static void main(String[] args) {
        // JMenu fileMenu
        JMenu fileMenu;

        // JMenuItem quitItem
        JMenuItem quitItem;

        // JMenuBar menus
        JMenuBar menus;

        // roundCounter 
        int[] roundCounter = {1};

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
        roundWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New RestaurantPanelMain panel
        RestaurantPanelMain panel = new RestaurantPanelMain(quitItem);
        gui.getContentPane().add(panel);

        // New JLabel timer
        JLabel timer = new JLabel();

        // New JLabel roundCheck
        JLabel roundCheck = new JLabel();
        roundCheck.setText("");
        roundCheck.setBounds(125, 50, 100, 25);

        // New JLabel roundLabel
        JLabel roundLabel = new JLabel();
        roundLabel.setText("Round 1");
        roundLabel.setBounds(95, 75, 100, 25);

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
                        int seconds = 20;
                        
                        public void run() {
                            timer.setText("Time Left: " + seconds);
                            seconds--;
            
                            if (seconds <= 0) {
                                double moneyEarned = Double.parseDouble(panel.getPanel().moneyLabel.getText());
                                //countdownTimer.cancel();
                                gui.setVisible(false);

                                if (moneyEarned >= 20) {
                                    roundCounter[0] = 2;
                                    roundCheck.setText("You passed Round 1!");
                                    roundLabel.setText("Round 2");
                                    roundWindow.setVisible(true);
                                }
                                else {
                                    roundCheck.setText("You failed! Play again?");
                                    roundWindow.setVisible(true);
                                    seconds = seconds + 21;
                                }
                            }
                        }  
                    }, 0, 1000);
                } else if (roundCounter[0] == 2) {
                    System.out.println("We made it!");
                }
            }
        });
    }
}