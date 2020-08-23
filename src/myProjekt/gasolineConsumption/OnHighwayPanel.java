package myProjekt.gasolineConsumption;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

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

    Car car = new Car();

    public OnHighwayPanel() throws IOException {
        this.setBounds(400, 200, 600, 400);
        setTitle("расчет затрат бензина на трассе");
        setVisible(true);
        add(panel);

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
                car.todayDate(textDate.getText());
                car.setDistance(car.validDouble(textDistance.getText()));
                car.setSpeed(car.validDouble(textSpeed.getText()));
                car.setPrice(car.validDouble(textPrice.getText()));

                try {
                    car.priceOnHighwayGAS(car.getSpeed(), car.getDistance(), car.getPrice(),
                            car.isConditioner(), car.isDynamicDriving());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                try {
                    JOptionPane.showMessageDialog(null, car.reportHighway());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                 car.resetGasAndResultGas();   // reset in car gas = 0 and resultGas = 0
            }
        });
    }

}
