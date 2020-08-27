package myProjekt.com.dampCave.gasolineConsumption;

import javax.swing.*;

/**
 * @author Aleksey Ilin
*/

public class RunProgram {
    /**
     * Program launch
     * creating a menu bar
     *
     * 1.SwingUtilities.invokeLater - is designed to start an asynchronous operation.
     * It saves the action (Runnable), and runs it in one of the next iterations of the message loop.
     * 2.creat panel MenuGUI
     * 3.show panel
     */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuGUI gui = new MenuGUI();// creat panel MenuGUI
            gui.setVisible(true); // show panel
        });
    }
}
