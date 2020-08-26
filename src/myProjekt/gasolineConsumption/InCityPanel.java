package myProjekt.gasolineConsumption;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class InCityPanel extends JFrame{
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
    private JLabel aftorProgram;

    Car car = new Car();

    public InCityPanel() throws IOException {
        this.setBounds(400, 200, 600, 400);
        this.setResizable(true); // можно раздвигать окно
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("расчет затрат бензина в городе");
        setVisible(true);
        add(panel);

        //отлавливаю крестик программы для подтверждения выхода
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
            }
        });

         textDate.addFocusListener(new FocusListener() {
             @Override
             public void focusGained(FocusEvent e) {
             }

             @Override
             public void focusLost(FocusEvent e) {
                 car.todayDate(textDate.getText());
                 if (car.getDate().equals("")){
                     errorDate.setForeground(Color.RED);
                     errorDate.setText("Неправильно введена дата");
                     textDate.setText("");
                 } else {
                     errorDate.setText("");
                 }

             }
         });
         textDistance.addFocusListener(new FocusListener() {
             @Override
             public void focusGained(FocusEvent e) {

             }

             @Override
             public void focusLost(FocusEvent e) {

                 if (textDistance.getText().matches("(\\d+(\\.?\\d+))")
                         || textDistance.getText().matches("\\d+")){
                     car.setDistance(car.validDouble(textDistance.getText()) );
                     errorDistance.setText("");

                 } else {
                     errorDistance.setForeground(Color.RED);
                     errorDistance.setText("Неправильно введена дистанция");
                     textDistance.setText("");
                 }
             }
         });
         textTraffic.addFocusListener(new FocusListener() {
             @Override
             public void focusGained(FocusEvent e) {

             }

             @Override
             public void focusLost(FocusEvent e) {
                 if (textTraffic.getText().matches("\\d+") && Integer.parseInt(textTraffic.getText()) < 11 &&
                         Integer.parseInt(textTraffic.getText()) > 0) {
                     car.setTraffic(car.validInteger(textTraffic.getText()));
                     errorTraffic.setText("");
                 } else {
                     errorTraffic.setForeground(Color.RED);
                     errorTraffic.setText("Неправильно введен трафик");
                     textTraffic.setText("");
                 }

             }
         });
         textPrice.addFocusListener(new FocusListener() {
             @Override
             public void focusGained(FocusEvent e) {

             }

             @Override
             public void focusLost(FocusEvent e) {
                 if (textPrice.getText().matches("(\\d+(\\.?\\d+))")
                         || textPrice.getText().matches("\\d+")) {
                     car.setPrice(car.validDouble(textPrice.getText()));
                     errorPrice.setText("");
                 }else {
                     errorPrice.setForeground(Color.RED);
                     errorPrice.setText("Неправильно введена цена");
                     textPrice.setText("");
                 }
             }
         });



        ButtonGroup groupConditioner = new ButtonGroup();
        groupConditioner.add(conditionerON);
        groupConditioner.add(conditionerOFF);
        conditionerON.setSelected(true);

        conditionerON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                car.setConditioner(true);
            }
        });

        conditionerOFF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                car.setConditioner(false);
            }
        });

        ButtonGroup groupDynamicDriving = new ButtonGroup();
        groupDynamicDriving.add(dynamicDrivingON);
        groupDynamicDriving.add(dynamicDrivingOFF);
        dynamicDrivingON.setSelected(true);

        dynamicDrivingON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                car.setDynamicDriving(true);
            }
        });

        dynamicDrivingOFF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                car.setDynamicDriving(false);
            }
        });

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                //car.todayDate(textDate.getText());
                //car.setDistance(car.validDouble(textDistance.getText()) );
                //car.setTraffic(car.validInteger(textTraffic.getText()));
                //car.setPrice(car.validDouble(textPrice.getText()));

                // write the entered arguments into the method and get the result:
                if (textDate.getText().equals("") || textDistance.getText().equals("") ||
                        textTraffic.getText().equals("") || textPrice.getText().equals("")){
                    errorButton.setForeground(Color.RED);
                    errorButton.setText("Заполните все поля");
                } else {
                    errorButton.setText("");
                    try {
                        car.priceInCityGAS(car.getDistance(), car.getTraffic(), car.getPrice(),
                                car.isConditioner(), car.isDynamicDriving());
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    try {
                        JOptionPane.showMessageDialog(null, car.reportCity());
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    car.resetGasAndResultGas();



                }
            }
        });
        returnMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//
                int result = JOptionPane.showConfirmDialog
                        (null,"Вы точно хотите вернуться в меню?",
                                "вернуться в меню", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION){
                    try {
                        MenuGUI menuGUI = new MenuGUI();
                        setVisible(false);
                        dispose();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                } }

        });





    }
}
