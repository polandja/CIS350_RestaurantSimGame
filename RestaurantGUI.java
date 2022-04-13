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
        "
        */

        // New JLabel timer
        JLabel timer1 = new JLabel();
        JLabel timer2 = new JLabel();

        // New JLabel roundCheck
        JLabel roundCheck = new JLabel();
        roundCheck.setText("");
        roundCheck.setBounds(60, 50, 150, 25);

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

        // New JButton startButton1
        JButton startButton1 = new JButton("Start");
        
        // New JButton startButton2
        JButton startButton2 = new JButton("Start");

        ArrayList<MenuItem> menu = new ArrayList<>();

        // roundOne created
        Round roundOne = new Round(20, 20, menu);

        // roundTwo created
        Round roundTwo = new Round(120, 65, menu);

        // roundThree created
        Round roundThree = new Round(140, 55, menu);

        // roundFour created
        Round roundFour = new Round(160, 50, menu);

        // roundFive created
        Round roundFive = new Round(180, 45, menu);

        // roundFinal created
        Round roundFinal = new Round(200, 40, menu);

        // roundWindow created
        roundWindow.add(roundLabel);
        roundWindow.add(roundCheck);
        roundWindow.add(startButton1);
        roundWindow.pack();
        roundWindow.setSize(250, 250);
        roundWindow.setLayout(null);
        roundWindow.setVisible(true);

        // startButton1 created
        startButton1.setBounds(70, 100, 100, 25);

        // startButton2 created
        startButton2.setBounds(70, 100, 100, 25);

        // Adding timer to menus 
        menus.add(Box.createHorizontalGlue());
        menus.add(timer1);

        Timer countdownTimer1 = new Timer();
        Timer countdownTimer2 = new Timer();

        startButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // roundWindow disappears
                roundWindow.setVisible(false);

                if (roundCounter[0] == 1) {
                    // gui created
                    gui.pack();
                    gui.setSize(1000, 1000);
                    gui.setJMenuBar(menus);
                    gui.setVisible(true);
                    countdownTimer1.scheduleAtFixedRate(new TimerTask() {
                        int seconds = roundOne.getTimeLimit();
                        
                        public void run() {
                            timer1.setText("Time Left: " + seconds);
                            seconds--;
            
                            if (seconds <= 0) {
                                double moneyEarned = Double.parseDouble(panel.getPanel().moneyLabel.getText());
                                gui.setVisible(false);

                                if (moneyEarned >= roundOne.getCashGoal()) {
                                    roundCheck.setText("You passed Round 1!");
                                    roundLabel.setText("Round 2");
                                    roundWindow.remove(startButton1);
                                    roundWindow.add(startButton2);
                                    roundWindow.setVisible(true);
                                }
                                else {
                                    roundCheck.setText("You failed Round 1! Play again?");
                                    //panel.getPanel().moneyLabel.setText("0.0");
                                    roundWindow.setVisible(true);
                                    seconds = seconds + 76;
                                }
                            }
                        }  
                    }, 0, 1000);
                } 
                // else if (roundCounter[0] == 3) {
                //     countdownTimer2.scheduleAtFixedRate(new TimerTask() {
                //         int seconds = roundThree.getTimeLimit();

                //         @Override
                //         public void run() {
                //             timer2.setText("Time Left: " + seconds);
                //             seconds--;

                //             if (seconds <= 0) {
                //                 double moneyEarned = Double.parseDouble(panel.getPanel().moneyLabel.getText());
                //                 gui.setVisible(false);

                //                 if (moneyEarned >= roundThree.getCashGoal()) {
                //                     roundCounter[0] = 4;
                //                     roundCheck.setText("You passed Round 3!");
                //                     roundLabel.setText("Round 4");
                //                     roundWindow.setVisible(true);
                //                 }
                //                 else {
                //                     roundCheck.setText("You failed! Play again?");
                //                     roundWindow.setVisible(true);
                //                     seconds = seconds + 56;
                //                 }
                //             }   
                //         }  
                //     }, 0, 1000);
                // }
                // else if (roundCounter[0] == 4) {
                //     countdownTimer2.scheduleAtFixedRate(new TimerTask() {
                //         int seconds = roundFour.getTimeLimit();

                //         @Override
                //         public void run() {
                //             timer2.setText("Time Left: " + seconds);
                //             seconds--;

                //             if (seconds <= 0) {
                //                 double moneyEarned = Double.parseDouble(panel.getPanel().moneyLabel.getText());
                //                 gui.setVisible(false);

                //                 if (moneyEarned >= roundFour.getCashGoal()) {
                //                     roundCounter[0] = 5;
                //                     roundCheck.setText("You passed Round 4!");
                //                     roundLabel.setText("Round 5");
                //                     roundWindow.setVisible(true);
                //                 }
                //                 else {
                //                     roundCheck.setText("You failed! Play again?");
                //                     roundWindow.setVisible(true);
                //                     seconds = seconds + 51;
                //                 }
                //             }   
                //         }  
                //     }, 0, 1000);
                // }
                // else if (roundCounter[0] == 5) {
                //     countdownTimer2.scheduleAtFixedRate(new TimerTask() {
                //         int seconds = roundFive.getTimeLimit();

                //         @Override
                //         public void run() {
                //             timer2.setText("Time Left: " + seconds);
                //             seconds--;

                //             if (seconds <= 0) {
                //                 double moneyEarned = Double.parseDouble(panel.getPanel().moneyLabel.getText());
                //                 gui.setVisible(false);

                //                 if (moneyEarned >= roundFive.getCashGoal()) {
                //                     roundCounter[0] = 6;
                //                     roundCheck.setText("You passed Round 5!");
                //                     roundLabel.setText("Final Round");
                //                     roundWindow.setVisible(true);
                //                 }
                //                 else {
                //                     roundCheck.setText("You failed! Play again?");
                //                     roundWindow.setVisible(true);
                //                     seconds = seconds + 46;
                //                 }
                //             }   
                //         }  
                //     }, 0, 1000);
                // }
                // else if (roundCounter[0] == 6) {
                //     countdownTimer2.scheduleAtFixedRate(new TimerTask() {
                //         int seconds = roundFinal.getTimeLimit();

                //         @Override
                //         public void run() {
                //             timer2.setText("Time Left: " + seconds);
                //             seconds--;

                //             if (seconds <= 0) {
                //                 double moneyEarned = Double.parseDouble(panel.getPanel().moneyLabel.getText());
                //                 gui.setVisible(false);

                //                 if (moneyEarned >= roundFinal.getCashGoal()) {
                //                     roundCounter[0] = 7;
                //                     roundCheck.setText("You beat the game!");
                //                     roundLabel.setText("");
                //                     roundWindow.setVisible(true);
                //                 }
                //                 else {
                //                     roundCheck.setText("You failed! Play again?");
                //                     roundWindow.setVisible(true);
                //                     seconds = seconds + 41;
                //                 }
                //             }   
                //         }  
                //     }, 0, 1000);
                // }
                
            }
        });

        startButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Made it here!");
                // roundWindow disappears
                roundWindow.setVisible(false);

                // remove timer1 and add timer2
                menus.remove(timer1);
                menus.add(Box.createHorizontalGlue());
                menus.add(timer2);

                // gui created
                gui.pack();
                gui.setSize(1000, 1000);
                gui.setJMenuBar(menus);
                gui.setVisible(true);

                //panel.getPanel().moneyLabel.setText("0.0");
                countdownTimer2.scheduleAtFixedRate(new TimerTask() {
                    int seconds = 65;

                    @Override
                    public void run() {
                        timer2.setText("Time Left: " + seconds);
                        seconds--;

                        if (seconds <= 0) {
                            double moneyEarned = Double.parseDouble(panel.getPanel().moneyLabel.getText());
                            gui.setVisible(false);

                            if (moneyEarned >= roundTwo.getCashGoal()) {
                                roundCounter[0] = 3;
                                roundCheck.setText("You passed Round 2!");
                                roundLabel.setText("Round 3");
                                roundWindow.setVisible(true);
                            }
                            else {
                                roundCheck.setText("You failed Round 2! Play again?");
                                roundWindow.setVisible(true);
                                seconds = seconds + 66;
                            }
                        }   
                    }  
                }, 0, 1000);
            }
        });
    }
}
