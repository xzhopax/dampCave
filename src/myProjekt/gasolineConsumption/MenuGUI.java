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
        add(panel);

        inCity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            InCityPanel city = new InCityPanel();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                    }
                });
            }
        });
        onHighway.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            OnHighwayPanel highwayPanel = new OnHighwayPanel();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                    }
                });

            }
        });
        showHistory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JFrame frame = new JFrame();
                    StringBuilder sb = new StringBuilder();
                    sb.append(car.outDisplayReport()).append("\n").append(car.reportTheTotal());
                    JTextArea textArea = new JTextArea(15, 35);
                    textArea.setText(sb.toString());
                    textArea.setEditable(false);
                    JScrollPane sp = new JScrollPane(textArea);
                    JOptionPane.showMessageDialog(frame,sp);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        deleteHistory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog
                        (null,"Вы точно хотите очистить историю?", "очистка истории", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION){
                    car.cleanResult();
                }
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//
               int result = JOptionPane.showConfirmDialog
                        (null,"Вы точно хотите выйти?", "Выход", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION){
                    System.exit(1);
                } }
        });
    panel.addComponentListener(new ComponentAdapter() { } );}
}
