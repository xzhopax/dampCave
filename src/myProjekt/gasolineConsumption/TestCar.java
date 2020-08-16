package myProjekt.gasolineConsumption;

import java.io.*;


public class TestCar {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Car car = new Car();
        Info info = new Info();


        while (!car.getLine().matches("5")) { //start initialization line (menu)
            info.menu();
            car.setLine(reader.readLine());


            // checking for an integer from 1 to 3, if the number is correct, then it goes to the corresponding case
            if (car.getLine().matches("\\d") &&
                    Integer.parseInt(car.getLine()) > 0 && Integer.parseInt(car.getLine()) < 6) {

                switch (Integer.parseInt(car.getLine())) { // start main switch

                    case 1: //Calculating the cost of gasoline in the city
                        info.spendingInTheCity();

                        // write date
                        while (car.getDate().equals("")){
                            info.enteredDate();
                            car.setNum(reader.readLine());
                            car.todayDate(car.getNum());
                        }

                        // write distance
                        while (car.getDistance() == 0) { // start initialization dist
                            info.inDistanceTraveled();
                            car.setNum(reader.readLine());
                            car.getDoubleDistance(car.getNum());
                        } // end initialization dist

                        // write traffic
                        while (car.getTraffic() == 0) { // start traffic
                            info.inTrafficRoad();
                            car.setNum(reader.readLine());
                            car.getIntegerTraffic(car.getNum());
                        } // end initialization traffic

                        // write date price
                        while (car.getPrice() == 0) { // start initialization price
                            info.inPriceGas();
                            car.setNum(reader.readLine());
                            car.getDoublePrice(car.getNum());
                        } // end initialization price;

                        // write conditioner (on or off)
                        while (car.getCon().equals("")) { // start initialization conditioner
                            info.conditionerPosition();
                            car.setCon(reader.readLine());
                            car.ifConditioner(car.getCon());
                        } // end initialization conditioner

                        // write Dynamic Drive (yes or no)
                        while (car.getDyn().equals("")) { // start initialization dynamicDriving
                            info.dynamicDrive();
                            car.setDyn(reader.readLine());
                            car.ifDynamicDriving(car.getDyn());
                        } // end initialization dynamicDriving

                        // write the entered arguments into the method and get the result:
                        car.priceGAS(car.getDistance(), car.getTraffic(), car.getPrice(),
                                car.isConditioner(), car.isDynamicDriving());

                        // write return menu (yes or no)
                        while (car.getMenu().equals("")) { // start initialization menu
                            info.returnMenu();
                            car.setMenu(reader.readLine());
                            car.returnMenu(car.getMenu());

                        } // end initialization menu
                        break; // end case 1

                    case 2: //Calculating the cost of gasoline on the highway
                        info.spendingOnTheHighway();

                        // write date
                        while (car.getDate().equals("")){
                            info.enteredDate();
                            car.setNum(reader.readLine());
                            car.todayDate(car.getNum());
                        }

                        // write speed
                        while (car.getSpeed() == 0) { // start initialization speed
                            info.inSpeed();
                            car.setNum(reader.readLine());
                            car.getDoubleSpeed(car.getNum());
                        } // end initialization speed

                        // write distance
                        while (car.getDistance() == 0) { // start initialization distance
                            info.inDistanceTraveled();
                            car.setNum(reader.readLine());
                            car.getDoubleDistance(car.getNum());
                        } // end initialization distance

                        // write price
                        while (car.getPrice() == 0) { // start initialization price
                            info.inPriceGas();
                            car.setNum(reader.readLine());
                            car.getDoublePrice(car.getNum());
                        } // end initialization price;

                        // write conditioner (on or off)
                        while (car.getCon().equals("")) { // start initialization conditioner
                            info.conditionerPosition();
                            car.setCon(reader.readLine());
                            car.ifConditioner(car.getCon());//
                        } // end initialization conditioner

                        // write Dynamic Drive (yes or no)
                        while (car.getDyn().equals("")) { // start initialization dynamicDriving
                            info.dynamicDrive();
                            car.setDyn(reader.readLine());
                            car.ifDynamicDriving(car.getDyn());
                        }// end initialization dynamicDriving

                        // write the entered arguments into the method and get the result:
                        car.highwayConsumption(car.getSpeed(), car.getDistance(), car.getPrice(),
                                car.isConditioner(), car.isDynamicDriving());

                        // write return menu (yes or no)
                        while (car.getMenu().equals("")) { // start initialization menu
                            info.returnMenu();
                            car.setMenu(reader.readLine());
                            car.returnMenu(car.getMenu());
                        }// end initialization menu
                        break;

                    case 3:
                        car.outDisplayReport();
                        car.reportTheTotal();
                        break;

                    case 4:
                        car.cleanResult();

                        break;

                    case 5: // exit the program.
                        info.goodBay();
                        break;
                } // end main switch

            } else { // if the line (in main switches) does not contain the desired number
                info.error();
                car.setLine("");
            }
        }//end initialization line (menu)
        reader.close();
    }
}
