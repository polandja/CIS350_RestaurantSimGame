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
        // JMenu fileMenu1
        JMenu fileMenu1;

        // JMenu fileMenu2
        JMenu fileMenu2;

        // JMenu fileMenu3
        JMenu fileMenu3;

        // JMenu fileMenu4
        JMenu fileMenu4;

        // JMenu fileMenu5
        JMenu fileMenu5;

        // JMenu fileMenu6
        JMenu fileMenu6;

        // JMenuItem quitItem1
        JMenuItem quitItem1;

        // JMenuItem quitItem2
        JMenuItem quitItem2;

        // JMenuItem quitItem3
        JMenuItem quitItem3;

        // JMenuItem quitItem4
        JMenuItem quitItem4;

        // JMenuItem quitItem5
        JMenuItem quitItem5;

        // JMenuItem quitItem6
        JMenuItem quitItem6;

        // JMenuItem helpItem1
        JMenuItem helpItem1;

        // JMenuItem helpItem2
        JMenuItem helpItem2;

        // JMenuItem helpItem3
        JMenuItem helpItem3;

        // JMenuItem helpItem4
        JMenuItem helpItem4;

        // JMenuItem helpItem5
        JMenuItem helpItem5;

        // JMenuItem helpItem6
        JMenuItem helpItem6;

        // JMenuItem recipeBook1
        JMenuItem recipeBook1;

        // JMenuItem recipeBook2
        JMenuItem recipeBook2;

        // JMenuItem recipeBook3
        JMenuItem recipeBook3;

        // JMenuItem recipeBook4
        JMenuItem recipeBook4;

        // JMenuItem recipeBook5
        JMenuItem recipeBook5;

        // JMenuItem recipeBook6
        JMenuItem recipeBook6;

        // JMenuBar menus1
        JMenuBar menus1;

        // JMenuBar menus2
        JMenuBar menus2;

        // JMenuBar menus3
        JMenuBar menus3;

        // JMenuBar menus4
        JMenuBar menus4;

        // JMenuBar menus5
        JMenuBar menus5;

        // JMenuBar menus6
        JMenuBar menus6;

        // roundCounter 
        int[] roundCounter = {1};

        // New fileMenu1
        fileMenu1 = new JMenu("File");

        // New fileMenu2
        fileMenu2 = new JMenu("File");

        // New fileMenu3
        fileMenu3 = new JMenu("File");

        // New fileMenu4
        fileMenu4 = new JMenu("File");

        // New fileMenu5
        fileMenu5 = new JMenu("File");

        // New fileMenu6
        fileMenu6 = new JMenu("File");

        // New quitItem1
        quitItem1 = new JMenuItem("Quit");
        fileMenu1.add(quitItem1);

        // New quitItem2
        quitItem2 = new JMenuItem("Quit");
        fileMenu2.add(quitItem2);

        // New quitItem3
        quitItem3 = new JMenuItem("Quit");
        fileMenu3.add(quitItem3);

        // New quitItem4
        quitItem4 = new JMenuItem("Quit");
        fileMenu4.add(quitItem4);

        // New quitItem5
        quitItem5 = new JMenuItem("Quit");
        fileMenu5.add(quitItem5);

        // New quitItem6
        quitItem6 = new JMenuItem("Quit");
        fileMenu6.add(quitItem6);

        // New helpItem1
        helpItem1 = new JMenuItem("Help");
        fileMenu1.add(helpItem1);

        // New helpItem2
        helpItem2 = new JMenuItem("Help");
        fileMenu2.add(helpItem2);

        // New helpItem3
        helpItem3 = new JMenuItem("Help");
        fileMenu3.add(helpItem3);

        // New helpItem4
        helpItem4 = new JMenuItem("Help");
        fileMenu4.add(helpItem4);

        // New helpItem5
        helpItem5 = new JMenuItem("Help");
        fileMenu5.add(helpItem5);

        // New helpItem6
        helpItem6 = new JMenuItem("Help");
        fileMenu6.add(helpItem6);

        // New recipeBook1
        recipeBook1 = new JMenuItem("Recipe Book");
        fileMenu1.add(recipeBook1);

        // New recipeBook2
        recipeBook2 = new JMenuItem("Recipe Book");
        fileMenu2.add(recipeBook2);

        // New recipeBook3
        recipeBook3 = new JMenuItem("Recipe Book");
        fileMenu3.add(recipeBook3);

        // New recipeBook4
        recipeBook4 = new JMenuItem("Recipe Book");
        fileMenu4.add(recipeBook4);

        // New recipeBook5
        recipeBook5 = new JMenuItem("Recipe Book");
        fileMenu5.add(recipeBook5);

        // New recipeBook6
        recipeBook6 = new JMenuItem("Recipe Book");
        fileMenu6.add(recipeBook6);

        // New menus1
        menus1 = new JMenuBar();
        menus1.add(fileMenu1);

        // New menus2
        menus2 = new JMenuBar();
        menus2.add(fileMenu2);

        // New menus3
        menus3 = new JMenuBar();
        menus3.add(fileMenu3);

        // New menus4
        menus4 = new JMenuBar();
        menus4.add(fileMenu4);

        // New menus5
        menus5 = new JMenuBar();
        menus5.add(fileMenu5);

        // New menus6
        menus6 = new JMenuBar();
        menus6.add(fileMenu6);

        // New JFrame GUI
        JFrame gui = new JFrame("Restaurant Game");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame GUI2
        JFrame gui2 = new JFrame("Restaurant Game");
        gui2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame GUI3
        JFrame gui3 = new JFrame("Restaurant Game");
        gui3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame GUI4
        JFrame gui4 = new JFrame("Restaurant Game");
        gui4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame GUI5
        JFrame gui5 = new JFrame("Restaurant Game");
        gui5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame GUI6
        JFrame gui6 = new JFrame("Restaurant Game");
        gui6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame roundWindow
        JFrame roundWindow = new JFrame("Round Start");
        roundWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame roundWindow2
        JFrame roundWindow2 = new JFrame("Round Start");
        roundWindow2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame roundWindow3
        JFrame roundWindow3 = new JFrame("Round Start");
        roundWindow3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame roundWindow4
        JFrame roundWindow4 = new JFrame("Round Start");
        roundWindow4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame roundWindow5
        JFrame roundWindow5 = new JFrame("Round Start");
        roundWindow5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame roundWindow6
        JFrame roundWindow6 = new JFrame("Round Start");
        roundWindow6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New JFrame roundWindow7
        JFrame roundWindow7 = new JFrame("Round Finish");
        roundWindow7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New RestaurantPanelMain panel
        RestaurantPanelMain panel = new RestaurantPanelMain(quitItem1, helpItem1, recipeBook1);
        gui.getContentPane().add(panel);

        // New RestaurantPanelMain panel2
        RestaurantPanelMain panel2 = new RestaurantPanelMain(quitItem2, helpItem2, recipeBook2);
        gui2.getContentPane().add(panel2);

        // New RestaurantPanelMain panel3
        RestaurantPanelMain panel3 = new RestaurantPanelMain(quitItem3, helpItem3, recipeBook3);
        gui3.getContentPane().add(panel3);

        // New RestaurantPanelMain panel4
        RestaurantPanelMain panel4 = new RestaurantPanelMain(quitItem4, helpItem4, recipeBook4);
        gui4.getContentPane().add(panel4);

        // New RestaurantPanelMain panel5
        RestaurantPanelMain panel5 = new RestaurantPanelMain(quitItem5, helpItem5, recipeBook5);
        gui5.getContentPane().add(panel5);

        // New RestaurantPanelMain panel6
        RestaurantPanelMain panel6 = new RestaurantPanelMain(quitItem6, helpItem6, recipeBook6);
        gui6.getContentPane().add(panel6);

        // New JLabel timers
        JLabel timer1 = new JLabel();
        JLabel timer2 = new JLabel();
        JLabel timer3 = new JLabel();
        JLabel timer4 = new JLabel();
        JLabel timer5 = new JLabel();
        JLabel timer6 = new JLabel();

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
        timeLabel.setText("Time: 45");
        timeLabel.setBounds(60, 15, 50, 50);

        // New JLabel moneyGoalLabel
        JLabel moneyGoalLabel = new JLabel();
        moneyGoalLabel.setText("Goal: $100");
        moneyGoalLabel.setBounds(125, 15, 100, 50);

        // New JButton startButton1
        JButton startButton1 = new JButton("Start");
        
        // New JButton startButton2
        JButton startButton2 = new JButton("Start");

        // New JButton startButton3
        JButton startButton3 = new JButton("Start");

        // New JButton startButton4
        JButton startButton4 = new JButton("Start");

        // New JButton startButton5
        JButton startButton5 = new JButton("Start");

        // New JButton startButton6
        JButton startButton6 = new JButton("Start");

        // New JButton finishButton
        JButton finishButton = new JButton("Finish");

        ArrayList<MenuItem> menu = new ArrayList<>();

        // roundOne created
        Round roundOne = new Round(100, 45, menu);

        // roundTwo created
        Round roundTwo = new Round(125, 60, menu);

        // roundThree created
        Round roundThree = new Round(150, 75, menu);

        // roundFour created
        Round roundFour = new Round(175, 90, menu);

        // roundFive created
        Round roundFive = new Round(200, 105, menu);

        // roundFinal created
        Round roundFinal = new Round(250, 120, menu);

        // roundWindow created
        roundWindow.add(moneyGoalLabel);
        roundWindow.add(timeLabel);
        roundWindow.add(roundLabel);
        roundWindow.add(roundCheck);
        roundWindow.add(startButton1);
        roundWindow.pack();
        roundWindow.setSize(250, 250);
        roundWindow.setLayout(null);
        roundWindow.setVisible(true);

        // startButton1 created
        startButton1.setBounds(70, 100, 100, 25);

        // Adding timer to menus 
        menus1.add(Box.createHorizontalGlue());
        menus1.add(timer1);

        Timer countdownTimer1 = new Timer();
        Timer countdownTimer2 = new Timer();
        Timer countdownTimer3 = new Timer();
        Timer countdownTimer4 = new Timer(); 
        Timer countdownTimer5 = new Timer();
        Timer countdownTimer6 = new Timer();

        startButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // roundWindow disappears
                roundWindow.setVisible(false);
                roundWindow.dispose();

                if (roundCounter[0] == 1) {
                    // gui created
                    gui.pack();
                    gui.setSize(1000, 1000);
                    gui.setJMenuBar(menus1);
                    gui.setVisible(true);

                    countdownTimer1.scheduleAtFixedRate(new TimerTask() {
                        int seconds = roundOne.getTimeLimit();
                        
                        public void run() {
                            timer1.setText("Time Left: " + seconds);
                            seconds--;
            
                            if (seconds <= 0) {
                                double moneyEarned = Double.parseDouble(panel.getPanel().moneyLabel.getText());
                                gui.setVisible(false);

                                // check if moneyEarned satisfies roundOne conditions
                                if (moneyEarned >= roundOne.getCashGoal() && roundCounter[0] == 1) {
                                    timeLabel.setText("Time: 60");
                                    moneyGoalLabel.setText("Goal: $125");
                                    roundCheck.setText("You passed Round 1!");
                                    roundLabel.setText("Round 2");
                                    roundCounter[0] = 2;

                                    // roundWindow2 populated
                                    roundWindow2.add(moneyGoalLabel);
                                    roundWindow2.add(timeLabel);
                                    roundWindow2.add(roundLabel);
                                    roundWindow2.add(roundCheck);
                                    roundWindow2.add(startButton2);

                                    // JLabel bounds set
                                    roundLabel.setBounds(95, 75, 100, 25);
                                    roundCheck.setBounds(60, 50, 150, 25);

                                    // roundWindow2 created
                                    roundWindow2.pack();
                                    roundWindow2.setSize(250, 250);
                                    roundWindow2.setLayout(null);
                                    roundWindow2.setVisible(true);

                                    // JButton bounds set
                                    startButton2.setBounds(70, 100, 100, 25);
                                }
                                else if (moneyEarned < roundOne.getCashGoal()) {
                                    roundCheck.setText("You failed! Play again?");
                                    roundWindow.setVisible(true);
                                    panel.getPanel().moneyLabel.setText("0.0");
                                    seconds = seconds + 46;
                                }
                            }
                        }  
                    }, 0, 1000);
                } 
            }
        });

        startButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // roundWindow2 disappears
                roundWindow2.setVisible(false);
                roundWindow2.dispose();
                panel2.getPanel().counterLabel.setText("2");

                // gui created
                gui2.pack();
                gui2.setSize(1000, 1000);
                gui2.setJMenuBar(menus2);
                gui2.setVisible(true);

                // remove timer1 and add timer2
                menus2.remove(timer1);
                menus2.add(Box.createHorizontalGlue());
                menus2.add(timer2);

                countdownTimer2.scheduleAtFixedRate(new TimerTask() {
                    int seconds = roundTwo.getTimeLimit();

                    @Override
                    public void run() {
                        timer2.setText("Time Left: " + seconds);
                        seconds--;

                        if (seconds <= 0) {
                            double moneyEarned = Double.parseDouble(panel2.getPanel().moneyLabel.getText());
                            gui2.setVisible(false);

                            // check if moneyEarned satisfies roundTwo conditions
                            if (moneyEarned >= roundTwo.getCashGoal() && roundCounter[0] == 2) {
                                timeLabel.setText("Time: 75");
                                moneyGoalLabel.setText("Goal: $150");
                                roundCheck.setText("You passed Round 2!");
                                roundLabel.setText("Round 3");
                                roundCounter[0] = 3;

                                // roundWindow3 populated
                                roundWindow3.add(timeLabel);
                                roundWindow3.add(moneyGoalLabel);
                                roundWindow3.add(roundLabel);
                                roundWindow3.add(roundCheck);
                                roundWindow3.add(startButton3);

                                // JLabel bounds set
                                roundLabel.setBounds(95, 75, 100, 25);
                                roundCheck.setBounds(60, 50, 150, 25);

                                // roundWindow3 created
                                roundWindow3.pack();
                                roundWindow3.setSize(250, 250);
                                roundWindow3.setLayout(null);
                                roundWindow3.setVisible(true);

                                // JButton bounds set
                                startButton3.setBounds(70, 100, 100, 25);
                            }
                            else if (moneyEarned < roundTwo.getCashGoal()) {
                                roundCheck.setText("You failed! Play again?");
                                roundWindow2.setVisible(true);
                                panel2.getPanel().moneyLabel.setText("0.0");
                                seconds = seconds + 61;
                            }
                        }   
                    }  
                }, 0, 1000);
            }
        });

        startButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // roundWindow3 disappears
                roundWindow3.setVisible(false);
                roundWindow3.dispose();
                panel3.getPanel().counterLabel.setText("3");

                // gui created
                gui3.pack();
                gui3.setSize(1000, 1000);
                gui3.setJMenuBar(menus3);
                gui3.setVisible(true);

                // remove timer2 and add timer3
                menus3.remove(timer2);
                menus3.add(Box.createHorizontalGlue());
                menus3.add(timer3);

                countdownTimer3.scheduleAtFixedRate(new TimerTask() {
                    int seconds = roundThree.getTimeLimit();

                    @Override
                    public void run() {
                        timer3.setText("Time Left: " + seconds);
                        seconds--;

                        if (seconds <= 0) {
                            double moneyEarned = Double.parseDouble(panel3.getPanel().moneyLabel.getText());
                            gui3.setVisible(false);

                            // check if moneyEarned satisfies roundThree conditions
                            if (moneyEarned >= roundThree.getCashGoal() && roundCounter[0] == 3) {
                                timeLabel.setText("Time: 90");
                                moneyGoalLabel.setText("Goal: $175");
                                roundCheck.setText("You passed Round 3!");
                                roundLabel.setText("Round 4");
                                roundCounter[0] = 4;

                                // roundWindow4 populated
                                roundWindow4.add(timeLabel);
                                roundWindow4.add(moneyGoalLabel);
                                roundWindow4.add(roundLabel);
                                roundWindow4.add(roundCheck);
                                roundWindow4.add(startButton4);

                                // JLabel bounds set
                                roundLabel.setBounds(95, 75, 100, 25);
                                roundCheck.setBounds(60, 50, 150, 25);

                                // roundWindow4 created
                                roundWindow4.pack();
                                roundWindow4.setSize(250, 250);
                                roundWindow4.setLayout(null);
                                roundWindow4.setVisible(true);

                                // JButton bounds set
                                startButton4.setBounds(70, 100, 100, 25);
                            }
                            else if (moneyEarned < roundThree.getCashGoal()) {
                                roundCheck.setText("You failed! Play again?");
                                roundWindow3.setVisible(true);
                                panel3.getPanel().moneyLabel.setText("0.0");
                                seconds = seconds + 76;
                            }
                        }   
                    }  
                }, 0, 1000);
            }
        });

        startButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // roundWindow3 disappears
                roundWindow4.setVisible(false);
                roundWindow4.dispose();
                panel4.getPanel().counterLabel.setText("4");

                // gui created
                gui4.pack();
                gui4.setSize(1000, 1000);
                gui4.setJMenuBar(menus4);
                gui4.setVisible(true);

                // remove timer3 and add timer4
                menus4.remove(timer3);
                menus4.add(Box.createHorizontalGlue());
                menus4.add(timer4);

                countdownTimer4.scheduleAtFixedRate(new TimerTask() {
                    int seconds = roundFour.getTimeLimit();

                    @Override
                    public void run() {
                        timer4.setText("Time Left: " + seconds);
                        seconds--;

                        if (seconds <= 0) {
                            double moneyEarned = Double.parseDouble(panel4.getPanel().moneyLabel.getText());
                            gui4.setVisible(false);

                            // check if moneyEarned satisfies roundFour conditions
                            if (moneyEarned >= roundFour.getCashGoal() && roundCounter[0] == 4) {
                                timeLabel.setText("Time: 105");
                                moneyGoalLabel.setText("Goal: $200");
                                roundCheck.setText("You passed Round 4!");
                                roundLabel.setText("Round 5");
                                roundCounter[0] = 5;

                                // roundWindow5 populated
                                roundWindow5.add(timeLabel);
                                roundWindow5.add(moneyGoalLabel);
                                roundWindow5.add(roundLabel);
                                roundWindow5.add(roundCheck);
                                roundWindow5.add(startButton5);

                                // JLabel bounds set
                                roundLabel.setBounds(95, 75, 100, 25);
                                roundCheck.setBounds(60, 50, 150, 25);

                                // roundWindow4 created
                                roundWindow5.pack();
                                roundWindow5.setSize(250, 250);
                                roundWindow5.setLayout(null);
                                roundWindow5.setVisible(true);

                                // JButton bounds set
                                startButton5.setBounds(70, 100, 100, 25);
                            }
                            else if (moneyEarned < roundFour.getCashGoal()) {
                                roundCheck.setText("You failed! Play again?");
                                roundWindow4.setVisible(true);
                                panel4.getPanel().moneyLabel.setText("0.0");
                                seconds = seconds + 91;
                            }
                        }   
                    }  
                }, 0, 1000);
            }
        });

        startButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // roundWindow5 disappears
                roundWindow5.setVisible(false);
                roundWindow5.dispose();
                panel5.getPanel().counterLabel.setText("5");

                // gui created
                gui5.pack();
                gui5.setSize(1000, 1000);
                gui5.setJMenuBar(menus5);
                gui5.setVisible(true);

                // remove timer4 and add timer5
                menus5.remove(timer4);
                menus5.add(Box.createHorizontalGlue());
                menus5.add(timer5);

                countdownTimer5.scheduleAtFixedRate(new TimerTask() {
                    int seconds = roundFive.getTimeLimit();

                    @Override
                    public void run() {
                        timer5.setText("Time Left: " + seconds);
                        seconds--;

                        if (seconds <= 0) {
                            double moneyEarned = Double.parseDouble(panel5.getPanel().moneyLabel.getText());
                            gui5.setVisible(false);

                            // check if moneyEarned satisfies roundFive conditions
                            if (moneyEarned >= roundFive.getCashGoal() && roundCounter[0] == 5) {
                                timeLabel.setText("Time: 120");
                                moneyGoalLabel.setText("Goal: $250");
                                roundCheck.setText("You passed Round 5!");
                                roundLabel.setText("Final Round");
                                roundCounter[0] = 6;

                                // roundWindow6 populated
                                roundWindow6.add(timeLabel);
                                roundWindow6.add(moneyGoalLabel);
                                roundWindow6.add(roundLabel);
                                roundWindow6.add(roundCheck);
                                roundWindow6.add(startButton6);

                                // JLabel bounds set
                                roundLabel.setBounds(95, 75, 100, 25);
                                roundCheck.setBounds(60, 50, 150, 25);

                                // roundWindow6 created
                                roundWindow6.pack();
                                roundWindow6.setSize(250, 250);
                                roundWindow6.setLayout(null);
                                roundWindow6.setVisible(true);

                                // JButton bounds set
                                startButton6.setBounds(70, 100, 100, 25);
                            }
                            else if (moneyEarned < roundFive.getCashGoal()) {
                                roundCheck.setText("You failed! Play again?");
                                roundWindow5.setVisible(true);
                                panel5.getPanel().moneyLabel.setText("0.0");
                                seconds = seconds + 106;
                            }
                        }   
                    }  
                }, 0, 1000);
            }
        });

        startButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // roundWindow6 disappears
                roundWindow6.setVisible(false);
                roundWindow6.dispose();
                panel6.getPanel().counterLabel.setText("6");

                // gui created
                gui6.pack();
                gui6.setSize(1000, 1000);
                gui6.setJMenuBar(menus6);
                gui6.setVisible(true);

                // remove timer4 and add timer5
                menus6.remove(timer5);
                menus6.add(Box.createHorizontalGlue());
                menus6.add(timer6);

                countdownTimer6.scheduleAtFixedRate(new TimerTask() {
                    int seconds = roundFinal.getTimeLimit();

                    @Override
                    public void run() {
                        timer6.setText("Time Left: " + seconds);
                        seconds--;

                        if (seconds <= 0) {
                            double moneyEarned = Double.parseDouble(panel6.getPanel().moneyLabel.getText());
                            gui6.setVisible(false);

                            // check if moneyEarned satisfies roundFive conditions
                            if (moneyEarned >= roundFinal.getCashGoal() && roundCounter[0] == 6) {
                                roundCheck.setText("You passed the Final Round!");
                                roundLabel.setText("Congratulations!");
                                roundCounter[0] = 7;

                                // roundWindow7 populated
                                roundWindow7.add(roundLabel);
                                roundWindow7.add(roundCheck);
                                roundWindow7.add(finishButton);

                                // JLabel bounds set
                                roundLabel.setBounds(95, 75, 100, 25);
                                roundCheck.setBounds(60, 50, 150, 25);

                                // roundWindow7 created
                                roundWindow7.pack();
                                roundWindow7.setSize(250, 250);
                                roundWindow7.setLayout(null);
                                roundWindow7.setVisible(true);

                                // JButton bounds set
                                finishButton.setBounds(70, 100, 100, 25);
                            }
                            else if (moneyEarned < roundFinal.getCashGoal()) {
                                roundCheck.setText("You failed! Play again?");
                                roundWindow6.setVisible(true);
                                panel6.getPanel().moneyLabel.setText("0.0");
                                seconds = seconds + 121;
                            }
                        }   
                    }  
                }, 0, 1000);
            }
        });
        
        finishButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (roundCounter[0] == 7) {
                    roundWindow7.dispose();
                    System.exit(0);
                }
            }
        });
    }
}
