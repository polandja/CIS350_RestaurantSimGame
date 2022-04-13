import javax.swing.*;

public class Help {
    // New JFrame helpFrame
    JFrame helpFrame = new JFrame("Help");

    // New JTextArea helpText
    JTextArea helpText = new JTextArea(10, 100);

    Help() {
        helpText.setText("Welcome to Burger Thyme! \n" + "Don’t worry, our restaurant is easy to run. \n" +
        "Before you is your workstation with fresh ingredients to fulfill orders for the awaiting customers! \n" +
        "You’ll be slowly introduced to new recipes. If you ever forget one, you can glance at the Recipe Book \n!" +
        "You have to build the customer order in the same order as the recipe book \n Press Submit to deliver the finished customer order! \n" +
        "If you submit a customer order right first try you get the menu item price + a tip! \n" +
        "However, if you get a customer order right on the second try, you’ll only get the menu item price. \n" +
        "If you get it right on the third try the customer gets the meal for free. \n" +
        "The customer will leave after 3 incorrect attempts! \n" + 
        "No taking off ingredients! If you mess up an order, you can restart by pressing Clear- but it’ll cost you $1 per ingredient wasted! \n" +
        "You’ll need to meet the day’s income quota to progress to the next day/ round. \n" +
        "Careful not to run out of time!");

        helpText.setEditable(false);
        helpFrame.add(helpText);
        helpFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        helpFrame.setSize(250, 250);
        helpFrame.pack();
        helpFrame.setLayout(null);
        helpFrame.setVisible(true);
    }
    
}
