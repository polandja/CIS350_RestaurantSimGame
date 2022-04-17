import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    JLabel menuBackground;

    ImageIcon menuImage;
     
    RecipeBook() {

        // New menuImage
        menuImage = new ImageIcon(getClass().getResource("Menu.png"));
        menuBackground = new JLabel(menuImage);

        recipeBookFrame.add(menuBackground);
        recipeBookFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        recipeBookFrame.setSize(250, 250);
        recipeBookFrame.pack();
        recipeBookFrame.setLayout(null);
        recipeBookFrame.setVisible(true);
    }
}