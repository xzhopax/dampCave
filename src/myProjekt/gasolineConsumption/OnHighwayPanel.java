package myProjekt.gasolineConsumption;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OnHighwayPanel extends JFrame {

    private JLabel namePanel;
    private JLabel inDate;
    private JTextField textDate;
    private JLabel inSpeed;
    private JTextField textSpeed;
    private JLabel inDistance;
    private JTextField textDistance;
    private JLabel inPrice;
    private JTextField textPrice;
    private JLabel isConditioner;
    private JRadioButton conditionerON;
    private JRadioButton conditionerOFF;
    private JLabel isDynamicDriving;
    private JRadioButton dynamicDrivingON;
    private JRadioButton dynamicDrivingOFF;
    private JButton start;
    private JPanel panel;
    private JLabel errorDate;
    private JLabel errorSpeed;
    private JLabel errorDistance;
    private JLabel errorPrice;
    private JLabel errorButton;
    private JButton returnMenu;
    private JLabel authorProgram;
    private JLabel inDateQuestion;
    private JLabel speedQuestion;
    private JLabel distanceQuestion;
    private JLabel priceQuestion;

    Car car = new Car();

    public OnHighwayPanel() {
        this.setBounds(400, 200, 600, 400);// initial window size
        this.setResizable(true); // you can make the window wider
        setTitle("расчет затрат бензина на трассе");//window title
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);// show panel
        add(panel);

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
                }
            } // end windowClosing
        }); //end anonymous class WindowAdapter (X)

        //when the textDate field loses focus, it checks if the date is correct,
        // if not, it erases the value and asks to re-enter
        textDate.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            }

            @Override
            public void focusLost(FocusEvent e) {
                car.todayDate(textDate.getText());
                if (car.getDate().equals("")) {
                    errorDate.setForeground(Color.RED);
                    errorDate.setText("Неправильно введена дата");
                    textDate.setText("");
                } else {
                    errorDate.setText("");
                }
            } // end focusLost
        }); // end anonymous class ActionListener (textDate)

        //when the textSpeed field loses focus, it checks if the speed is correct,
        // if not, it clears the value and asks to re-enter
        textSpeed.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            }

            @Override
            public void focusLost(FocusEvent e) {
                // if the string number is double and less than 200, then we write it to a variable speed
                if (textSpeed.getText().matches("(\\d+(\\.?\\d+))")
                        && Double.parseDouble(textSpeed.getText()) <= 200
                        || textSpeed.getText().matches("\\d+")
                        && Integer.parseInt(textSpeed.getText()) <= 200) {
                    car.setSpeed(car.validDouble(textSpeed.getText()));
                    errorSpeed.setText("");
                } else {
                    //
                    errorSpeed.setForeground(Color.RED);
                    errorSpeed.setText("Неправильно введена скорость");
                    textSpeed.setText("");

                }
            }
        }); // end anonymous class ActionListener (textSpeed)

        //when the textDistance field loses focus, it checks if the distance is correct,
        // if not, it erases the value and asks to re-enter
        textDistance.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                // if the string number is double or an integer, then we write it to the variable distance
                if (textDistance.getText().matches("(\\d+(\\.?\\d+))")
                        || textDistance.getText().matches("\\d+")) {
                    car.setDistance(car.validDouble(textDistance.getText()));
                    errorDistance.setText("");

                } else {
                    errorDistance.setForeground(Color.RED);
                    errorDistance.setText("Неправильно введена дистанция");
                    textDistance.setText("");
                }
            }
        }); // end anonymous class ActionListener (textDistance)

        //when the textPrice field loses focus, it checks if the price was entered correctly,
        // if not, it erases the value and asks to re-enter
        textPrice.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                //if the string number is double or an integer, then we write it to the variable price
                if (textPrice.getText().matches("(\\d+(\\.?\\d+))")
                        || textPrice.getText().matches("\\d+")) {
                    car.setPrice(car.validDouble(textPrice.getText()));
                    errorPrice.setText("");
                } else {
                    errorPrice.setForeground(Color.RED);
                    errorPrice.setText("Неправильно введена цена");
                    textPrice.setText("");
                }
            }
        }); // end anonymous class ActionListener (textPrice)

        // combine the conditionerON and conditionerOFF buttons into the group, set the initial value to ON
        ButtonGroup groupConditioner = new ButtonGroup();
        groupConditioner.add(conditionerON);
        groupConditioner.add(conditionerOFF);
        conditionerON.setSelected(true);

        //if the conditionerON button is enabled, then we assign the conditioner variable of the car class (true)
        conditionerON.addActionListener(e -> car.setConditioner(true));

        //if the conditionerOFF button is enabled, then we assign the conditioner variable of the car class (false)
        conditionerOFF.addActionListener(e -> car.setConditioner(false));

        //combine the dynamicDrivingON and dynamicDrivingOFF buttons into a group, set the initial value to ON
        ButtonGroup groupDynamicDriving = new ButtonGroup();
        groupDynamicDriving.add(dynamicDrivingON);
        groupDynamicDriving.add(dynamicDrivingOFF);
        dynamicDrivingON.setSelected(true);

        //if the dynamicDrivingON button is enabled, then assign the variable dynamicDriving of the car class (true)
        dynamicDrivingON.addActionListener(e -> car.setDynamicDriving(true));

        //if the dynamicDrivingOFF button is enabled, then assign the variable dynamicDriving of the car class (false)
        dynamicDrivingOFF.addActionListener(e -> car.setDynamicDriving(false));

        //when you click on the start button, it checks whether all the fields are filled,
        // if not, then asks to fill in the fields, and if all the fields are filled in correctly,
        // it calculates the result and displays it
        start.addActionListener(e -> {
            if (textDate.getText().equals("") || textDistance.getText().equals("") ||
                    textSpeed.getText().equals("") || textPrice.getText().equals("")) {
                errorButton.setForeground(Color.RED);
                errorButton.setText("Заполните все поля");
            } else {
                errorButton.setText("");
                car.priceOnHighwayGAS(car.getSpeed(), car.getDistance(), car.getPrice(),
                        car.isConditioner(), car.isDynamicDriving());
                JOptionPane.showMessageDialog(null, car.reportHighway());
                car.resetGasAndResultGas();   // reset in car gas = 0 and resultGas = 0
            }
        }); // end anonymous class ActionListener (button start)

        //when you press the returnMenu button and confirm, it closes the current window and returns to the main menu
        returnMenu.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog
                    (null, "Вы точно хотите вернуться в меню?",
                            "вернуться в меню", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                MenuGUI menuGUI = new MenuGUI();
                setVisible(false);//hide window
                dispose();//clear memory resources after hiding the window
            }
        }); // end anonymous class ActionListener (returnMenu)
    }// end constructor OnHighwayPanel
}// end class OnHighwayPanel
