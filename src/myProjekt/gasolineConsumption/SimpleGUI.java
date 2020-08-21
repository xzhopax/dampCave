package myProjekt.gasolineConsumption;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {

    private JButton menu1 = new JButton("Расчет затрат бензина в городе");
    private JButton menu2 = new JButton("Расчет затрат бензина на трассе");
    private JButton menu3 = new JButton("Посмотреть историю");
    private JButton menu4 = new JButton("Очистить историю");
    private JButton menu5 = new JButton("Выход из программы");

    private JLabel menu = new JLabel("Меню");
    private JLabel history = new JLabel("История");
    private JLabel inCity = new JLabel("В городе");
    private JLabel onHighway = new JLabel("На трассе");

    private JTextField speed = new JTextField("Введите среднюю скорость в км/ч от 0 до 200");
    private JTextField traffic = new JTextField("Введите загруженность дороги от 1 до 10");
    private JTextField distance = new JTextField("Введите пройденный путь в км");
    private JTextField price = new JTextField("Введите стоимость бенизана за 1 литр");

    private JRadioButton conditioner = new JRadioButton("Кондиционер включен или выключен?");
    private JRadioButton dynamicDriving = new JRadioButton("Динамичная еда?");
    private JRadioButton returnMenu = new JRadioButton("Вернуться в главное меню?");
    private JRadioButton deleteReport = new JRadioButton("Вы точно хотите удалить записи?");





}
