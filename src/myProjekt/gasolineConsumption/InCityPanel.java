package myProjekt.gasolineConsumption;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class InCityPanel extends JFrame {

    private JLabel namePanel;
    private JLabel inDate;
    private JTextField textDate;
    private JPanel panel;
    private JTextField textDistance;
    private JLabel inTraffic;
    private JLabel inDistance;
    private JTextField textTraffic;
    private JLabel isConditioner;
    private JRadioButton conditionerON;
    private JRadioButton conditionerOFF;
    private JLabel isDynamicDriving;
    private JRadioButton dynamicDrivingON;
    private JRadioButton dynamicDrivingOFF;
    private JButton start;
    private JLabel inPrice;
    private JTextField textPrice;
    private JLabel errorDate;
    private JLabel errorDistance;
    private JLabel errorTraffic;
    private JLabel errorPrice;
    private JLabel errorButton;
    private JButton returnMenu;
    private JLabel authorProgram;
    private JLabel inDateQuestion;
    private JLabel distanceQuestion;
    private JLabel trafficQuestion;
    private JLabel priceQuestion;

    Car car = new Car();

    public InCityPanel() {
        this.setBounds(400, 200, 600, 400);// initial window size
        this.setResizable(true); // you can make the window wider
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("расчет затрат бензина в городе");//window title
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
            }// end windowClosing
        });//end anonymous class WindowAdapter (X)

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

            }// end focusLost
        });//end of field textDate

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
            }// end focusLost
        });//end of field textDistance

        //when the textTraffic field loses focus, it checks if the traffic was entered correctly,
        // if not, it erases the value and asks to enter it again
        textTraffic.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                // if the string number an integer, then we write it to the variable traffic
                if (textTraffic.getText().matches("\\d+") && Integer.parseInt(textTraffic.getText()) < 11 &&
                        Integer.parseInt(textTraffic.getText()) > 0) {
                    car.setTraffic(car.validInteger(textTraffic.getText()));
                    errorTraffic.setText("");
                } else {
                    errorTraffic.setForeground(Color.RED);
                    errorTraffic.setText("Неправильно введен трафик");
                    textTraffic.setText("");
                }

            }// end focusLost
        });//end of field textTraffic

        //when the textPrice field loses focus, it checks if the price was entered correctly,
        // if not, it erases the value and asks to re-enter
        textPrice.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                // if the string number is double or an integer, then we write it to the variable price
                if (textPrice.getText().matches("(\\d+(\\.?\\d+))")
                        || textPrice.getText().matches("\\d+")) {
                    car.setPrice(car.validDouble(textPrice.getText()));
                    errorPrice.setText("");
                } else {
                    errorPrice.setForeground(Color.RED);
                    errorPrice.setText("Неправильно введена цена");
                    textPrice.setText("");
                }
            }// end focusLost
        });//end of field textPrice

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
            // write the entered arguments into the method and get the result:
            if (textDate.getText().equals("") || textDistance.getText().equals("") ||
                    textTraffic.getText().equals("") || textPrice.getText().equals("")) {
                errorButton.setForeground(Color.RED);
                errorButton.setText("Заполните все поля");
            } else {
                errorButton.setText("");
                car.priceInCityGAS(car.getDistance(), car.getTraffic(), car.getPrice(),
                        car.isConditioner(), car.isDynamicDriving());
                JOptionPane.showMessageDialog(null, car.reportCity());
                car.resetGasAndResultGas();
            }
        });// end button start

        //when you press the returnMenu button and confirm, it closes the current window and returns to the main menu
        returnMenu.addActionListener(e -> {//
            int result = JOptionPane.showConfirmDialog
                    (null, "Вы точно хотите вернуться в меню?",
                            "вернуться в меню", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                MenuGUI menuGUI = new MenuGUI();
                setVisible(false);
                dispose();
            }
        });// end button returnMenu
    }// end constructor InCityPanel

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}// end class InCityPanel
