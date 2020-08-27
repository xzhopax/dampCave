package myProjekt.com.dampCave.gasolineConsumption;

import javax.swing.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aleksey Ilin
 *
 * class Car - takes the values of behavior in the car and on the road and calculates the costs of these actions
 */

public class Car extends JFrame {

    /**
     * @param trafficCongestion - gasoline consumption depending on traffic congestion
     * @param speedCongestion - gasoline consumption depending on speed
     * @param allGas - static variable for calculating the total amount of gasoline
     * @param allMoney - static variable for calculating the total amount of money spent
     */
    private final double[] trafficCongestion = new double[]{7.0, 8.0, 9.0, 10.0, 12.0, 14.0, 15.0, 16.0, 18.0, 20.0};
    private final double[] speedCongestion = new double[]{9.5, 6.0, 4.8, 4.0, 3.5, 4.0, 5.0, 6.0, 8.0, 10.5};
    private static double allGas;
    private static double allMoney;

    private final StringBuilder sb = new StringBuilder();
    private String date = "";
    private double price = 0, distance = 0, speed = 0, gas = 0, resultGas = 0;
    private int traffic = 0;
    private boolean conditioner = true, dynamicDriving = true;

    /**
     * priceInCityGAS - takes five input parameters to calculate consumed
     * gasoline and money spent for the distance traveled in the city (VW polo)
     */
    protected void priceInCityGAS // start priceInCityGAS
    (double distance, int traffic, double gasolinePrice, boolean conditioner, boolean dynamicDriving) {

        if (conditioner) {
            setGas(getGas() + trafficCongestion[traffic - 1] + 0.5);
        } else setGas(getGas() + trafficCongestion[traffic - 1]);

        if (dynamicDriving) {
            setGas(getGas() + 2.0);
        }
        setGas((getGas() / 100) * distance);
        setResultGas(getGas() * gasolinePrice);
    } // end priceInCityGAS

    /**
     * priceOnHighwayGAS - takes five input parameters to calculate the consumed gasoline and
     * the money spent for the distance traveled on the highway (VW polo)
     */
    protected void priceOnHighwayGAS // start priceOnHighwayGAS
    (double speed, double distance, double price, boolean conditioner, boolean dynamicDriving) {

        if (conditioner) {
            setGas(getGas() + sc(speed) + 0.5);
        } else setGas(getGas() + sc(speed));

        if (dynamicDriving) {
            setGas(getGas() + 2.0);
        }
        setGas((getGas() / 100) * distance);
        setResultGas(getGas() * price);
    }// end priceOnHighwayGAS

    /**
     * double sc - calculates gas mileage depending on speed (VW polo)
     * @param speed - takes your average speed at the entrance
     * @return - returns gas mileage depending on input speed
     */
    private double sc(double speed) {
        if (speed <= 10 && speed >= 0) {
            return speedCongestion[0];
        } else if (speed <= 20) {
            return speedCongestion[1];
        } else if (speed <= 30) {
            return speedCongestion[2];
        } else if (speed <= 40) {
            return speedCongestion[3];
        } else if (speed <= 60) {
            return speedCongestion[4];
        } else if (speed <= 80) {
            return speedCongestion[5];
        } else if (speed <= 100) {
            return speedCongestion[6];
        } else if (speed <= 120) {
            return speedCongestion[7];
        } else if (speed <= 150) {
            return speedCongestion[8];
        } else if (speed <= 200) {
            return speedCongestion[9];
        }
        return 0;
    } // end private double sc(double speed)

    /**
     * validDouble - checking a string for a number double
     * @param StringNumPrice - accepts a string as input to check it for double
     * @return - if the input parameter is correct, then it returns the number of doubles
     */
    protected double validDouble(String StringNumPrice) {
        double result = 0;
        if (StringNumPrice.matches("(\\d+(\\.\\d+))") && Double.parseDouble(StringNumPrice) > 0
                || StringNumPrice.matches("\\d+") && Integer.parseInt(StringNumPrice) > 0) {
            result = Double.parseDouble(StringNumPrice);
            return result;
        }
        return result;
    }// end validDouble

    /**
     * validInteger(String StringNumPrice) - checking a string for a number integer
     * @param StringNumPrice - accepts a string as an input to check it for an integer
     * @return - if the input parameter is correct, then it returns an integer
     */
    protected int validInteger(String StringNumPrice) {
        int result = 0;
        if (StringNumPrice.matches("\\d+") && Integer.parseInt(StringNumPrice) > 0) {
            result = Integer.parseInt(StringNumPrice);
            return result;
        }
        return result;
    }// end validInteger

    /**
     * isDateValid(String date) - checking if the date is entered correctly
     * @param date - accepts a string as input to check it for a date
     * @return - if the input parameter is correct, then it returns true otherwise return false
     */
    protected static boolean isDateValid(String date) {
        try {
            DateFormat df = new SimpleDateFormat("d.M.yyyy");
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }// end isDateValid

    /**
     * todayDate(String date) - if the date is entered correctly, it saves it to a variable
     * @param date - takes the string date as input
     */
    protected void todayDate(String date) {
        isDateValid(date);
        if (isDateValid(date)) {
            setDate(date);
        } else {
            setDate("");
        }
    }// end todayDate

    /**
     * countNumber - accepts two double numbers as input to add one to the other
     * @param number - the number to be added
     * @param resultNumber - to it you need to add
     * @return - will return the result of adding numbers
     */
    protected double countNumber(double number, double resultNumber) {
        resultNumber = resultNumber + number;
        return resultNumber;
    }// end countNumber

    /**
     * resetGasAndResultGas() - reset static variable total gasoline and total money
     */
    protected void resetGasAndResultGas() {
        setGas(0);
        setResultGas(0);
    }// end resetGasAndResultGas

    /**
     * findInFileGasAndMoney(String str) - searches the history file for gasoline and the money spent on it,
     * for writing them into variables to display all costs.
     * @param str - accepts a string as input to search for money or gasoline.
     */
    protected void findInFileGasAndMoney(String str) {
        String regex1 = "(Бензин\\s*:\\s*(\\d+,?(\\d*)))";
        String regex2 = "(Денег\\s*:\\s*(\\d+,?(\\d*)))";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher1 = pattern.matcher(str);
        Matcher matcher2 = Pattern.compile(regex2).matcher(str);
        String s1, s2;

        // find gas
        while (matcher1.find()) {
            s1 = matcher1.group();
            String[] arrOfStr = s1.split(":\\s?");
            for (String s : arrOfStr) {
                s = s.replaceAll(",", ".");
                if (s.matches("(\\d+(\\.?\\d+))")) {
                    // countAllMoney(Double.parseDouble(s));
                    setAllGas(countNumber(Double.parseDouble(s), getAllGas()));
                }
            }
        }//end while find money

        //find money
        while (matcher2.find()) {
            s2 = matcher2.group();
            String[] arrOfStr = s2.split(":\\s?");
            for (String s : arrOfStr) {
                s = s.replaceAll(",", ".").trim();
                if (s.matches("(\\d+(\\.?\\d+))")) {
                    //countAllMoney(Double.parseDouble(s));
                    setAllMoney(countNumber(Double.parseDouble(s), getAllMoney()));
                }
            }
        } //end while find money
    }// end findInFileGasAndMoney

    /**
     * saveReport(String line) - save the report to a file
     * @param line - takes a string as input to be written to a file
     */
    protected void saveReport(String line) {
        try (Writer reportFile = new FileWriter
                ("src/myProjekt/com/dampCave/gasolineConsumption/resources/reportFile.txt", true)) {
            reportFile.write(line);
        } catch (IOException e) {
            MenuGUI.error();
            e.printStackTrace();
        }
    }// end save report

    /**
     * cleanResult() - delete records from the file and reset the static
     * fields to display the report history on the screen
     */
    protected void cleanResult() {// start clean
        setAllMoney(0);
        setAllGas(0);
        try (Writer reportFile = new FileWriter
                ("src/myProjekt/com/dampCave/gasolineConsumption/resources/reportFile.txt", false)) {
            reportFile.write("");
        } catch (IOException e) {
            MenuGUI.error();
            e.printStackTrace();
        }
    }// end clean

    /**
     * reportCity() - city driving report for display
     * @return - returns a line with a report of the cost of city driving on the specified day
     */
    protected String reportCity() {
        sb.setLength(0);
        sb.append("\n=============================================\n");
        sb.append(getDate()).append("\n");
        sb.append("За пройденный путь в населенном пункте вы потратили:\n");
        sb.append(String.format("Бензин : %.2f литров\n", getGas()));
        sb.append(String.format("Денег: %.2f рублей\n", getResultGas()));
        sb.append("=============================================\n");
        saveReport(sb.toString());
        return sb.toString();
    } // end reportCity

    /**
     * reportHighway() - track driving report for display
     * @return - returns a line with a report of the cost of driving on the highway on the specified day
     */
    protected String reportHighway() {
        sb.setLength(0);
        sb.append("\n=============================================\n");
        sb.append(getDate()).append("\n");
        sb.append("За пройденный путь по трассе вы потратили:\n");
        sb.append(String.format("Бензин : %.2f литров\n", getGas()));
        sb.append(String.format("Денег: %.2f рублей\n", getResultGas()));
        sb.append("=============================================\n");
        saveReport(sb.toString());
        return sb.toString();
    } //end reportHighway

    /**
     * outDisplayReport() - reading history from a file to display it on the screen
     * @return - returns a string with information read from a file
     */
    protected String outDisplayReport() {
        StringBuilder sb = new StringBuilder();
        try (Reader reader = new FileReader
                ("src/myProjekt/com/dampCave/gasolineConsumption/resources/reportFile.txt")) {
            int data = reader.read();
            while (data != -1) {
                sb.append((char) data);
                data = reader.read();
            }
            findInFileGasAndMoney(sb.toString());
        } catch (IOException e) {
            MenuGUI.error();
            e.printStackTrace();
        }
        return sb.toString();
    }//end outDisplayReport

    /**
     * reportTheTotal() - displays the total amount of consumed gasoline and money spent on it
     * @return - returns a string with information about parameters of all gasoline costs and money for it
     */
    protected String reportTheTotal() {
        sb.setLength(0);
        sb.append(String.format("Общая сумма денег была потрачена на бензин : %.2f\n", getAllMoney()));
        sb.append(String.format("Общее количество бензина израсходаванно : %.2f", getAllGas()));
        setAllMoney(0);
        setAllGas(0);
        return sb.toString();
    }//end reportTheTotal

    //down get and set

    protected double getSpeed() {
        return speed;
    }

    protected void setSpeed(double speed) {
        this.speed = speed;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected double getDistance() {
        return distance;
    }

    protected void setDistance(double distance) {
        this.distance = distance;
    }

    protected int getTraffic() {
        return traffic;
    }

    protected void setTraffic(int traffic) {
        this.traffic = traffic;
    }

    protected boolean isConditioner() {
        return conditioner;
    }

    protected void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }

    protected boolean isDynamicDriving() {
        return dynamicDriving;
    }

    protected void setDynamicDriving(boolean dynamicDriving) {
        this.dynamicDriving = dynamicDriving;
    }

    protected String getDate() {
        return date;
    }

    protected void setDate(String date) {
        this.date = date;
    }

    protected double getGas() {
        return gas;
    }

    protected void setGas(double gas) {
        this.gas = gas;
    }

    protected double getResultGas() {
        return resultGas;
    }

    protected void setResultGas(double resultGas) {
        this.resultGas = resultGas;
    }

    protected static double getAllGas() {
        return allGas;
    }

    protected static void setAllGas(double allGas) {
        Car.allGas = allGas;
    }

    protected static double getAllMoney() {
        return allMoney;
    }

    protected static void setAllMoney(double allMoney) {
        Car.allMoney = allMoney;
    }
}
