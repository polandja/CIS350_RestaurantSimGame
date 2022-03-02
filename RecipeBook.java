import javax.swing.*;

/*************************************************************
 * Class RecipeBook of Restuarant Simulation Game
 * <p>
 * Assistive class to the GUI.
 * <p>
 * Contains the dishes/ recipes able to be ordered/ created. 
 * 
 * @author Claire Grob, Hanna Halstead, & Jacqueline Poland
 * @version March 4, 2022
 ************************************************************/
public class RecipeBook {
    
    JFrame recipeBookFrame = new JFrame("Recipe Book");
    JTextField recipeBookText1 = new JTextField();
    JTextField recipeBookText2 = new JTextField();
     
    RecipeBook() {
        recipeBookText1.setText("Hamburger = [Bun, Patty, Bun]");
        recipeBookText2.setText("Cheeseburger = [Bun, Patty, Cheese, Bun]");

        recipeBookFrame.add(recipeBookText1);
        recipeBookFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        recipeBookFrame.setSize(250, 250);
        recipeBookFrame.pack();
        recipeBookFrame.setLayout(null);
        recipeBookFrame.setVisible(true);
    }
}