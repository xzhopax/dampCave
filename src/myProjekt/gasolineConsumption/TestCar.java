package myProjekt.gasolineConsumption;

import javax.swing.*;


public class TestCar {

    public static void main(String[] args) {

        //SwingUtilities.invokeLater - is designed to start an asynchronous operation.
        // It saves the action (Runnable), and runs it in one of the next iterations of the message loop.
        SwingUtilities.invokeLater(() -> {
            MenuGUI gui = new MenuGUI();// creat panel MenuGUI
            gui.setVisible(true); // show panel
        });
    }
}
