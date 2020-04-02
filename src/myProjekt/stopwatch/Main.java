package myProjekt.stopwatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        String str;

//            Timer t1 = new Timer(23, 59, 57);
//        t1.start();
             Timer t2 = new Timer();
             t2.start();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            str = reader.readLine();
            if (str.isEmpty()){ // если нажать Enter
                Timer.setStop(); // остановка цикла (кнопка стоп)
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close(); // закрываем ввод с консоли
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
