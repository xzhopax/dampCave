package myProjekt.gasolineConsumption;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;import java.io.IOException;

public class MenuGUI extends JFrame {
    Car car = new Car();
    private JButton inCity;
    private JButton onHighway;
    private JButton showHistory;
    private JButton deleteHistory;
    private JButton exit;
    private JPanel panel;
    private JLabel menu;



    public MenuGUI() throws IOException {
//        super("this panel");
        this.setBounds(400,200,600,400);
        setTitle("Программа для расчета затрат бензина");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        Container container = this.getContentPane();

        add(panel);



        inCity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        onHighway.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        showHistory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        deleteHistory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
    panel.addComponentListener(new ComponentAdapter() { } );}
}
