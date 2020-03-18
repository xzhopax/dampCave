package oracle.JavaFX.learnJOptionPane;

import javax.swing.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //<<<<<<<<<<<<<<<<<<<<<<<< Урок 1 >>>>>>>>>>>>>>>>>>>>>>>>>
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

 //       int numb = 0;
//        String input01 = JOptionPane.showInputDialog("Введите текст:");
//
//        if (input.matches("[-+]\\d+")) {
//            numb = Integer.parseInt(input01);
//            numb++;
//        } else System.out.println("Вы ввели не целочисленное число");
//
//        System.out.println(numb);

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // <<<<<<<<<<<<<<<<<<<<<<<< Урок 1-1 >>>>>>>>>>>>>>>>>>>>>>>
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//        String input1 = (String)JOptionPane.showInputDialog(null, "Это вопрос?",
//                "Заголовок диалогового окна", 2, null,
//                null, "Введите текст.");
//
//        System.out.println(input1);

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // <<<<<<<<<<<<<<<<<<<<<<<< Урок 1-2 >>>>>>>>>>>>>>>>>>>>>>>
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//       String[] acceptableValues = {"Выбор 1", "Выбор 2", "Выбор 3"};
//       String input2 = (String)JOptionPane.showInputDialog(null, "Это вопрос?",
//               "Заголовок диалогового окна", 2, null, acceptableValues,acceptableValues[2]);

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // <<<<<<<<<<<<<<<<<<<<<<<< Урок 1-3 >>>>>>>>>>>>>>>>>>>>>>>
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//
//        JOptionPane.showMessageDialog(null,
//                "Здесь не предусмотрен ввод данных, просто отображается сообщение",
//                             "Заголовок", 0);

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // <<<<<<<<<<<<<<<<<<<<<<<< Урок 2 >>>>>>>>>>>>>>>>>>>>>>>>>
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


//        JOptionPane.showMessageDialog(null,
//                "Сюда можно вписать, что угодно",
//                "Изменил",
//                0);
//
//
//        String input1 = (String)JOptionPane.showInputDialog(null,
//                "Вопрос",
//                "Измененное Название",
//                1,
//                null,
//                null,
//                "Сюда можно вписать:");
//
//
//        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
//        String input2 = (String)JOptionPane.showInputDialog(null,
//                "Опросник?",
//                "Изменил название окна",
//                1,
//                null,
//                acceptableValues,
//                acceptableValues[1]);
//        System.out.println(input1);
//        System.out.println(input2);

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // <<<<<<<<<<<<<<<<<<<<<<<< Урок 3 >>>>>>>>>>>>>>>>>>>>>>>>>
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        // Буду использовать вместо Scanner --> BufferedReader

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line = null; // для считывания с консоли
//        int count = 0; // счетчик
//        int score = 0; // переменная для хранения общей суммы
//
//
//        try{
//            while (count != 3) { // вводить с консоли пока: счетчик не раве 3
//                line = reader.readLine();
//                if (line.matches("([-+])?\\d+")) { // если ввод содержит int
//                    score += Integer.parseInt(line);
//                    count++;
//                } else // если ввод не содержит int
//                    System.out.println("Вы ввели не целочисленное число");
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//
//            try {
//                reader.close();  // закрываю ввод
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        System.out.println(score); // вывод результата


        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // <<<<<<<<<<<<<<<<<<<<<<<< Урок 3 - 1 >>>>>>>>>>>>>>>>>>>>>>>>>
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        // Буду использовать вместо Scanner --> BufferedReader

//       FileReader inputReader = new FileReader("C:\\java\\1.txt");
////      final String FILENAME = "C:\\java\\1.txt";
////       String str = null;

        String connect = new File("").getAbsolutePath();
        connect = connect.concat("/1.txt");
      // InputStream inputStream = Main.class.getResourceAsStream();
       String str = null;
        FileReader fr = new FileReader(connect);
       BufferedReader reader = new BufferedReader(fr);

       while ((str = reader.readLine()) != null) {
           System.out.println(str);
       }





     }
   }



