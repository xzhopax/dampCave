package myProjekt.gasolineConsumption;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    Car car = new Car();

    public InCityPanel() throws IOException {
        this.setBounds(400, 200, 600, 400);
        setTitle("расчет затрат бензина в городе");
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
                car.setDistance(car.validDouble(textDistance.getText()) );
                car.setTraffic(car.validInteger(textTraffic.getText()));
                car.setPrice(car.validDouble(textPrice.getText()));

                // write the entered arguments into the method and get the result:
                try {
                    car.priceInCityGAS(car.getDistance(), car.getTraffic(), car.getPrice(),
                            car.isConditioner(), car.isDynamicDriving());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                try {
                    JOptionPane.showMessageDialog(null , car.reportCity());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                car.resetGasAndResultGas();
            }
        });
    }
}
