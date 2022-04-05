import javax.swing.*;

/*************************************************************
 * Class RecipeBook of Restuarant Simulation Game
 * <p>
 * Assistive class to the GUI.
 * <p>
 * Contains the dishes/ recipes able to be ordered/ created. 
 * 
 * @author Claire Grob, Hanna Halstead, and Jacqueline Poland
 * @version April 18, 2022
 ************************************************************/

public class RecipeBook {
    
    // New JFrame recipeBookFrame
    JFrame recipeBookFrame = new JFrame("Recipe Book");

    // New JTextField recipeBookText1
    JTextField recipeBookText1 = new JTextField();

    // New JTextField recipeBookText2
    JTextField recipeBookText2 = new JTextField();
     
    RecipeBook() {
        
        //this is where menu/ recipe book png file will live
        
        // setText of recipeBookText1
        //recipeBookText1.setText("Hamburger = [Bun, Patty, Bun]");

        // setText of recipeBookText2
        //recipeBookText2.setText("Cheeseburger = [Bun, Patty, Cheese, Bun]");

        //recipeBookFrame.add(recipeBookText1);
        recipeBookFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        recipeBookFrame.setSize(250, 250);
        recipeBookFrame.pack();
        recipeBookFrame.setLayout(null);
        recipeBookFrame.setVisible(true);
    }
}