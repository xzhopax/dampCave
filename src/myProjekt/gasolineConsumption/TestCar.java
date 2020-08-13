package myProjekt.gasolineConsumption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestCar {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "", con = "", dyn = "", menu = "",  num;
        double dist = 0, price = 0, distance = 0, price2 = 0;
        int traffic = 0, speed = 0;
        boolean conditioner1 = true, dynamicDriving1 = true, conditioner2 = true, dynamicDriving2 = true;

        Car car = new Car();
        Info info = new Info();

        while (!line.matches("3")) { //start initialization line (menu)
            info.menu();
            line = reader.readLine();
            // checking for an integer from 1 to 3, if the number is correct, then it goes to the corresponding case
            if (line.matches("\\d") && Integer.parseInt(line) > 0 && Integer.parseInt(line) < 4) {

                switch (Integer.parseInt(line)) { // start main switch

                    case 1: //Calculating the cost of gasoline in the city
                        info.spendingInTheCity();

                        while (dist == 0) { // start initialization dist
                            info.inDistanceTraveled();
                            num = reader.readLine();

                            if (num.matches("(\\d+(\\.\\d+))") && Double.parseDouble(num) > 0
                                    || num.matches("\\d+") && Integer.parseInt(num) > 0) {
                                dist = Double.parseDouble(num);
                            } else {
                                info.error();
                                dist = 0;
                            }
                        } // end initialization dist

                        while (traffic == 0) { // start traffic
                            info.inTrafficRoad();
                            num = reader.readLine();

                            if (num.matches("\\d") && Integer.parseInt(num) > 0 && Integer.parseInt(num) < 11) {
                                traffic = Integer.parseInt(num);
                            } else {
                                info.error();
                                traffic = 0;
                            }
                        } // end initialization traffic

                        while (price == 0) { // start initialization price
                            info.inPriceGas();
                            num = reader.readLine();

                            if (num.matches("(\\d+(\\.\\d+))") && Double.parseDouble(num) > 0
                                    || num.matches("\\d+") && Integer.parseInt(num) > 0) {
                                price = Double.parseDouble(num);
                            } else {
                                info.error();
                                price = 0;
                            }
                        } // end initialization price;

                        while (con.equals("")){ // start initialization conditioner
                            info.conditionerPosition();
                            con = reader.readLine();

                            if (con.matches("on")|| con.matches("off")) {
                                conditioner1 = car.ifFlag(con);
                            }else {
                                info.error();
                                con = "";
                            }
                        } // end initialization conditioner

                        while (dyn.equals("")){ // start initialization dynamicDriving
                            info.dynamicDrive();
                            dyn = reader.readLine();

                            if (dyn.matches("yes")|| dyn.matches("no")) {
                                dynamicDriving1 = car.ifFlag(dyn);
                            }else {
                                info.error();
                                dyn = "";
                            }
                        } // end initialization dynamicDriving


                        // write the entered arguments into the method and get the result:
                        car.priceGAS(dist, traffic, price, conditioner1, dynamicDriving1);

                        while (menu.equals("")){ // start initialization menu
                            info.returnMenu();
                            menu = reader.readLine();

                            if (menu.matches("yes") || menu.matches("no")) {
                                // if "yes" -> reset fields and return menu
                                // if "no" -> exit program
                                if (menu.matches("yes")) {
                                    System.out.println();
                                    dist = 0;
                                    traffic = 0;
                                    price = 0;
                                    menu = "";
                                    dyn = "";
                                    con = "";
                                    break;
                                } else {
                                    info.goodBay();
                                    line = "3";
                                }
                            } else {
                                info.error();
                            }
                        } // end initialization menu
                        break; // end case 1


                    case 2: //Calculating the cost of gasoline on the highway
                        info.spendingOnTheHighway();

                        while (speed == 0) { // start initialization speed
                            info.inSpeed();
                            num = reader.readLine();

                            if (num.matches("\\d+") && Integer.parseInt(num) >= 0 && Integer.parseInt(num) < 201
                                    || num.matches("(\\d+(\\.\\d+))") && Double.parseDouble(num) > 0
                                        && Double.parseDouble(num) < 201) {
                                double d = Double.parseDouble(num); // variable to convert double to int
                                speed = (int) d;
                            } else {
                                info.error();
                                speed = 0;
                            }
                        } // end initialization speed

                        while (distance == 0) { // start initialization distance
                            info.inDistanceTraveled();
                            num = reader.readLine();

                            if (num.matches("(\\d+(\\.\\d+))") && Double.parseDouble(num) > 0
                                    || num.matches("\\d+") && Integer.parseInt(num) > 0) {
                                distance = Double.parseDouble(num);
                            } else info.error();
                        } // end initialization distance

                        while (price2 == 0) { // start initialization price
                            info.inPriceGas();
                            num = reader.readLine();

                            if (num.matches("(\\d+(\\.\\d+))") && Double.parseDouble(num) > 0
                                    || num.matches("\\d+") && Integer.parseInt(num) > 0) {
                                price2 = Double.parseDouble(num);
                            } else {
                                info.error();
                                price2 = 0;
                            }
                        } // end initialization price;


                        while (con.equals("")){ // start initialization conditioner
                            info.conditionerPosition();
                            con = reader.readLine();

                            if (con.matches("on")|| con.matches("off")) {
                                conditioner2 = car.ifFlag(con);
                            }else {
                                info.error();
                                con = "";
                            }
                        } // end initialization conditioner


                        while (dyn.equals("")){ // start initialization dynamicDriving1
                            info.dynamicDrive();
                            dyn = reader.readLine();

                            if (dyn.matches("yes")|| dyn.matches("no")) {
                               dynamicDriving2 = car.ifFlag(dyn);
                            }else {
                                info.error();
                                dyn = "";
                            }
                        } // end initialization dynamicDriving2

                        // write the entered arguments into the method and get the result:
                        car.highwayConsumption(speed, distance, price2, conditioner2, dynamicDriving2);

                        while (menu.equals("")){ // start initialization menu
                            info.returnMenu();
                            menu = reader.readLine();

                            if (menu.matches("yes") || menu.matches("no")) {
                                // if "yes" -> reset fields and return menu
                                // if "no" -> exit program
                                if (menu.matches("yes")) {
                                    System.out.println();
                                    speed = 0;
                                    distance = 0;
                                    price2 = 0;
                                    menu = "";
                                    dyn = "";
                                    con = "";
                                    break;
                                } else {
                                    info.goodBay();
                                    line = "3";
                                }
                            } else {
                                info.error();
                            }
                        } // end initialization menu
                        break;

                    case 3: // exit the program.
                        info.goodBay();
                        break;
                } // end main switch

            } else { // if the line (in main switches) does not contain the desired number
                info.error();
                line = "";
            }
        }//end initialization line (menu)
        reader.close();

    }

}
