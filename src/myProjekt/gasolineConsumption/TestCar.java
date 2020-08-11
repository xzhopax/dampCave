package myProjekt.gasolineConsumption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestCar {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "", con = "", num;
        double dist = 0, price = 0, distance = 0, price2 = 0;
        int traffic = 0, speed = 0;
        boolean conditioner = true;

        Car day1 = new Car();

        while (line.equals("")) { //start initialization line (menu)
            System.out.println("<<<===<<<===<<<========МЕНЮ========>>>===>>>===>>>");
            System.out.println("<<<====<<<=====Volkswagen polo sedan====>>>====>>>");
            System.out.println("Нажми цыфру 1 для: Расчета затрат бензина в городе.");
            System.out.println("Нажми цыфру 2 для: Расчета затрат бензина на трассе.");
            System.out.println("Нажми цыфру 3 для: Выхода из программы.");
            System.out.print("Введите значение : ");
            line = reader.readLine();
            // проверка на целое число от 1 до 3, если число верное, то переходит в соответствующий кейс
            if (line.matches("\\d") && Integer.parseInt(line) > 0 && Integer.parseInt(line) < 4) {

                switch (Integer.parseInt(line)) {
                    //
                    case 1: //Расчет затрат бензина в городе
                        System.out.println("\nДля расчета затрат бензина в городе :");

                        while (dist == 0) { // start initialization dist
                            System.out.print("Введите растояние в км : ");
                            num = reader.readLine();
                            if (num.matches("(\\d+(\\.\\d+))") && Double.parseDouble(num) > 0
                                    || num.matches("\\d+") && Integer.parseInt(num) > 0) {
                                dist = Double.parseDouble(num);

                            } else {
                                System.out.println("Вы ввели неверное значение");
                                dist = 0;
                            }
                        } // end initialization dist

                        while (traffic == 0) { // start traffic
                            System.out.print("Введите загруженность дороги от 1 до 10: ");
                            num = reader.readLine();
                            if (num.matches("\\d") && Integer.parseInt(num) > 0 && Integer.parseInt(num) < 11) {
                                traffic = Integer.parseInt(num);
                            } else {
                                System.out.println("Вы ввели неверное значение");
                                traffic = 0;
                            }
                        } // end initialization traffic

                        while (price == 0) { // start initialization price
                            System.out.print("Введите стоимость бенизана за 1 литр : ");
                            num = reader.readLine();
                            if (num.matches("(\\d+(\\.\\d+))") && Double.parseDouble(num) > 0
                                    || num.matches("\\d+") && Integer.parseInt(num) > 0) {
                                price = Double.parseDouble(num);
                            } else {
                                System.out.println("Вы ввели неверное число");
                                price = 0;
                            }
                        } // end initialization price;

                        while (con.equals("")){ // start initialization conditioner
                            System.out.print("Кондиционер включен или выключен? (ввести on или off) :");
                            con = reader.readLine();
                            if (con.matches("on")|| con.matches("off")) {
                                if (con.matches("on")){
                                    conditioner = true;
                                } else if (con.matches("off")) {
                                    conditioner = false;
                                }
                            }else {
                                System.out.println("Вы ввели неправильное значение.");
                                con = "";
                            }
                        } // end initialization conditioner

                        // записсываем введенные аргументы в метод и получаем результат:
                        day1.priceGAS(dist, traffic, price, conditioner);
                        System.out.println("================Good Bay================");

                        break;
                    // end case 1
                    case 2: //Расчет затрат бензина на трассе
                        System.out.println("\nДля расчета затрат бензина на трассе :");

                        while (speed == 0) { // start initialization speed
                            System.out.print("Введите скорость в км/ч : ");
                            num = reader.readLine();
                            if (num.matches("\\d+") && Integer.parseInt(num) >= 0 && Integer.parseInt(num) < 201
                                    || num.matches("(\\d+(\\.\\d+))") && Double.parseDouble(num) > 0
                                        && Double.parseDouble(num) < 201) {
                                double d = Double.parseDouble(num); // переменная для конвертации double в int
                                speed = (int) d;
                            } else {
                                System.out.println("Вы ввели неверное значение");
                                speed = 0;
                            }
                        } // end initialization speed

                        while (distance == 0) { // start initialization distance
                            System.out.print("Введите пройденный путь в км : ");
                            num = reader.readLine();
                            if (num.matches("(\\d+(\\.\\d+))") && Double.parseDouble(num) > 0
                                    || num.matches("\\d+") && Integer.parseInt(num) > 0) {
                                distance = Double.parseDouble(num);
                            } else System.out.println("Вы ввели неверное число");
                        } // end initialization distance

                        while (price2 == 0) { // start initialization price
                            System.out.print("Введите стоимость бенизана за 1 литр : ");
                            num = reader.readLine();
                            if (num.matches("(\\d+(\\.\\d+))") && Double.parseDouble(num) > 0
                                    || num.matches("\\d+") && Integer.parseInt(num) > 0) {
                                price2 = Double.parseDouble(num);
                            } else {
                                System.out.println("Вы ввели неверное число");
                                price2 = 0;
                            }
                        } // end initialization price;


                        while (con.equals("")){ // start initialization conditioner
                            System.out.print("Кондиционер включен или выключен? (ввести on или off) :");
                            con = reader.readLine();
                            if (con.matches("on")|| con.matches("off")) {
                                if (con.matches("on")){
                                    conditioner = true;
                                } else if (con.matches("off")) {
                                    conditioner = false;
                                }
                            }else {
                                System.out.println("Вы ввели неправильное значение.");
                                con = "";
                            }
                        } // end initialization conditioner

                        day1.highwayConsumption(speed, distance, price2, conditioner);
                        System.out.println("================Good Bay================");
                        break;

                    case 3: // выход из программы.
                        System.out.println("================Good Bay================");
                        break;

                } // end switch

            } else {
                System.out.println("Вы ввели неверное число\n");
                line = "";
            } // если line не содержит целое число
        }//end initialization line (menu)
        reader.close();

    }

}
