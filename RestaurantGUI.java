import java.util.*;
import javax.swing.*;

/*************************************************************
 * Class RestaurantGUI of Restuarant Simulation Game
 * <p>
 * Creates the framework of the GUI to host a game. 
 * 
 * @author Claire Grob, Hanna Halstead, & Jacqueline Poland
 * @version March 4, 2022
 ************************************************************/
public class RestaurantGUI {
    public static void main(String[] args) {
        
        JMenu fileMenu;
        JMenuItem quitItem;
        JMenuBar menus;

        fileMenu = new JMenu("File");
        quitItem = new JMenuItem("Quit");
        
        fileMenu.add(quitItem);
        menus = new JMenuBar();

        menus.add(fileMenu);

        JFrame gui = new JFrame("Restaurant Game");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RestaurantPanelMain panel = new RestaurantPanelMain(quitItem);
        gui.getContentPane().add(panel);

        gui.pack();
        gui.setSize(1200, 800);
        gui.setJMenuBar(menus);
        gui.setVisible(true);
    }
}