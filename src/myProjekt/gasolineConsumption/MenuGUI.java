package myProjekt.gasolineConsumption;

import javax.swing.*;
import java.awt.event.*;

public class MenuGUI extends JFrame {
    Car car = new Car();
    private JButton inCity;
    private JButton onHighway;
    private JButton showHistory;
    private JButton deleteHistory;
    private JButton exit;
    private JPanel panel;
    private JLabel menu;
    private JLabel authorProgram;

    //a static method to display an error message to the user.
    protected static void error() {
        JOptionPane.showMessageDialog(null, "что-то пошло не так");
    } // end error

    public MenuGUI() {
        this.setBounds(400, 200, 600, 400); // initial window size
        this.setResizable(true); // you can make the window wider
        setTitle("Программа для расчета затрат бензина");//window title
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);// show panel
        add(panel);// add the panel MenuGUI

        //I catch the program cross to confirm the exit
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent arg0) {
                int result = JOptionPane
                        .showConfirmDialog(null,
                                "Закрыть программу?", "Выход из программы",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } // end if
            }// end windowClosing
        }); //end this.addWindowListener(new WindowAdapter()

        //when you click on the button in the inCity menu, the menu closes and a panel
        // is created for calculating costs in the city
        inCity.addActionListener(e -> SwingUtilities.invokeLater(() -> {
            InCityPanel city = new InCityPanel();
            setVisible(false); // close the current frame
            dispose();
        })); // end inCity

        //when you click on the button in the onHighway menu, the menu closes and a panel
        // is created for calculating costs on the highway
        onHighway.addActionListener(e -> SwingUtilities.invokeLater(() -> {
            OnHighwayPanel highwayPanel = new OnHighwayPanel();
            setVisible(false); // close the current frame
            dispose();
        }));// end onHighway

        //when you press the button in the showHistory menu,
        // the trip history is displayed on the screen written to a file through the panel with a slider
        showHistory.addActionListener(e -> {
            JFrame frame = new JFrame();
            StringBuilder sb = new StringBuilder();
            sb.append(car.outDisplayReport()).append("\n").append(car.reportTheTotal());
            JTextArea textArea = new JTextArea(15, 35);
            textArea.setText(sb.toString());
            textArea.setEditable(false);
            JScrollPane sp = new JScrollPane(textArea);
            JOptionPane.showMessageDialog(frame, sp);
        });// end showHistory

        //when you press the button in the deleteHistory menu, after confirmation,
        // the history file will be erased and the static fields of the Car class
        // with the total amount of gasoline and the money spent will be reset
        deleteHistory.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog
                    (null, "Вы точно хотите очистить историю?",
                            "очистка истории", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                car.cleanResult();
            } // end if
        });// end deleteHistory

        //when you press the button in the exit menu, after confirmation the program will close
        exit.addActionListener(e -> {//
            int result = JOptionPane.showConfirmDialog
                    (null, "Вы точно хотите выйти?", "Выход", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                System.exit(0);
            }//end if
        });//end exit
    }
}
