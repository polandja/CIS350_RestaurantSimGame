import javax.swing.*;

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

        gui.setSize(600, 400);
        gui.setJMenuBar(menus);
        gui.pack();
        gui.setVisible(true);
    }
}