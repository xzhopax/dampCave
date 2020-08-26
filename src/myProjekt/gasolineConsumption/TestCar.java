package myProjekt.gasolineConsumption;

import javax.swing.*;
import java.io.*;


public class TestCar {


    public static void main(String[] args) throws IOException {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuGUI gui = null;
                try {
                    gui = new MenuGUI();
                    gui.setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

   }
}
