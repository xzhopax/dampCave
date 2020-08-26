package myProjekt.gasolineConsumption;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Car extends JFrame {

    // double[] trafficCongestion - расход бензина в зависимости от загруженности дорог

    private final double[] trafficCongestion = new double[]{7.0, 8.0, 9.0, 10.0, 12.0, 14.0, 15.0, 16.0, 18.0, 20.0};
    private final double[] speedCongestion = new double[]{9.5, 6.0, 4.8, 4.0, 3.5, 4.0, 5.0, 6.0, 8.0, 10.5};
    private static double allGas;
    private static double allMoney;

    private Calendar calendar = Calendar.getInstance();
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d.M.yyyy");
    private StringBuilder sb = new StringBuilder();

    private final Info info = new Info();
    private String line = "", con = "", dyn = "", menu = "", date = "", reset = "", num;
    private double price = 0, distance = 0, speed = 0, gas = 0, resultGas = 0;
    private int traffic = 0;
    private boolean conditioner = true, dynamicDriving = true;

    Car() throws IOException {
    }


    protected void resetGasAndResultGas(){
        setGas(0);
        setResultGas(0);
    }

    protected double countNumber(double number, double resultNumber){
        resultNumber = resultNumber + number;
        return resultNumber;
    }

    // double sc - высчитывает расход бензина в зависимости от скорости (VW polo)
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
    }

    //priceGAS - высчитываем кол-во литров бензина и потраченных денег на пройденный путь в городе (VW polo)
    protected void priceInCityGAS
    (double distance, int traffic, double gasolinePrice, boolean conditioner, boolean dynamicDriving) throws IOException {

        if (conditioner) {
            setGas(getGas() + trafficCongestion[traffic - 1] + 0.5);
        } else setGas(getGas() + trafficCongestion[traffic - 1]);

        if (dynamicDriving) {
            setGas(getGas() + 2.0);
        }
        setGas((getGas() / 100) * distance);
        setResultGas(getGas() * gasolinePrice);
    }

    //highwayConsumption - высчитывает сколько потрачено литров бензина и денег на него двигаясь по трассе (VW polo)
    protected void priceOnHighwayGAS
    (double speed, double distance, double price, boolean conditioner, boolean dynamicDriving) throws IOException {

        if (conditioner) {
            setGas(getGas() + sc(speed) + 0.5);
        } else setGas(getGas() + sc(speed));

        if (dynamicDriving) {
            setGas(getGas() + 2.0);
        }
        setGas((getGas() / 100) * distance);
        setResultGas(getGas() * price);
    }

    protected double validDouble(String StringNumPrice){
        double result = 0;
        if (StringNumPrice.matches("(\\d+(\\.\\d+))") && Double.parseDouble(StringNumPrice) > 0
                || StringNumPrice.matches("\\d+") && Integer.parseInt(StringNumPrice) > 0) {
            result = Double.parseDouble(StringNumPrice);
             return result;
        }
        return result;
    }

    protected int validInteger(String StringNumPrice){
        int result = 0;
        if (StringNumPrice.matches("\\d+") && Integer.parseInt(StringNumPrice) > 0) {
            result = Integer.parseInt(StringNumPrice);
            return result;
        }
        return result;
    }

//    protected void resetMenu() {
//        setMenu("");
//    }


    protected void saveReport(String line) throws IOException {
        try(Writer reportFile = new FileWriter
                ("src/myProjekt/gasolineConsumption/reportFiles/reportFile.txt",true)){
            reportFile.write(line);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void cleanResult() {
                setAllMoney(0);
                setAllGas(0);
                try(Writer reportFile = new FileWriter
                        ("src/myProjekt/gasolineConsumption/reportFiles/reportFile.txt",false)){
                    reportFile.write("");
                }catch (IOException e) {
                    e.printStackTrace();
        }
    }

    protected void todayDate(String date) {
        isDateValid(date);
        if (isDateValid(date)) {
            setDate(date);
        } else {
            setDate("");
        }
    }

    protected static boolean isDateValid(String date) {
        try {
            DateFormat df = new SimpleDateFormat("d.M.yyyy");
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    protected String reportCity() throws IOException {
        sb.setLength(0);
        sb.append("\n=============================================\n");
        sb.append(getDate()).append("\n");
        sb.append("За пройденный путь в населенном пункте вы потратили:\n");
        sb.append(String.format("Бензин : %.2f литров\n", getGas()));
        sb.append(String.format("Денег: %.2f рублей\n", getResultGas()));
        sb.append("=============================================\n");
        saveReport(sb.toString());
        return sb.toString();
    }

    protected String reportHighway() throws IOException {
        sb.setLength(0);
        sb.append("\n=============================================\n");
        sb.append(getDate()).append("\n");
        sb.append("За пройденный путь по трассе вы потратили:\n");
        sb.append(String.format("Бензин : %.2f литров\n", getGas()));
        sb.append(String.format("Денег: %.2f рублей\n", getResultGas()));
        sb.append("=============================================\n");
        saveReport(sb.toString());
        return sb.toString();

    }

    protected String outDisplayReport() throws IOException {
        StringBuilder sb = new StringBuilder();
        try(Reader reader = new FileReader("src/myProjekt/gasolineConsumption/reportFiles/reportFile.txt")){
            int data = reader.read();
            while (data != -1){
                sb.append((char) data);
                data = reader.read();
            }
            findInFileGasAndMoney(sb.toString());
        }catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }

    protected String reportTheTotal(){
        sb.setLength(0);
        sb.append(String.format("Общая сумма денег была потрачена на бензин : %.2f\n", getAllMoney()));
        sb.append(String.format("Общее количество бензина израсходавано : %.2f", getAllGas()));
        setAllMoney(0);
        setAllGas(0);
        return sb.toString();
    }

    protected void findInFileGasAndMoney(String str){
        String regex1 = "(Бензин\\s*:\\s*(\\d+,?(\\d*)))";
        String regex2 = "(Денег\\s*:\\s*(\\d+,?(\\d*)))";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher1 = pattern.matcher(str);
        Matcher matcher2 = Pattern.compile(regex2).matcher(str);
        String s1, s2;

        // find gas
        while (matcher1.find()){ //start while find gas
            s1= matcher1.group();
            String[] arrOfStr = s1.split(":\\s?");
            for (String s : arrOfStr) {
                s = s.replaceAll(",",".");
                if (s.matches("(\\d+(\\.?\\d+))")) {
                    // countAllMoney(Double.parseDouble(s));
                    setAllGas(countNumber(Double.parseDouble(s),getAllGas()));
                }
            }
        }//end while find money

        //find money
        while (matcher2.find()){ //start while find money
            s2= matcher2.group();
            String[] arrOfStr = s2.split(":\\s?");
            for (String s : arrOfStr) {
                s = s.replaceAll(",",".").trim();
                if (s.matches("(\\d+(\\.?\\d+))")) {
                    //countAllMoney(Double.parseDouble(s));
                    setAllMoney(countNumber(Double.parseDouble(s),getAllMoney()));
                }
            }
        } //end while find money
    }

    @Override // need rewrite
    public String toString() {
        return "Car{" +
                "trafficCongestion=" + Arrays.toString(trafficCongestion) +
                ", speedCongestion=" + Arrays.toString(speedCongestion) +
                ", calendar=" + calendar +
                ", simpleDateFormat=" + simpleDateFormat +
                ", info=" + info +
                ", line='" + line + '\'' +
                ", con='" + con + '\'' +
                ", dyn='" + dyn + '\'' +
                ", menu='" + menu + '\'' +
                ", date='" + date + '\'' +
                ", num='" + num + '\'' +
                ", price=" + price +
                ", distance=" + distance +
                ", speed=" + speed +
                ", traffic=" + traffic +
                ", conditioner=" + conditioner +
                ", dynamicDriving=" + dynamicDriving +
                '}';
    }

    //down get and set

    protected Info getInfo() {
        return info;
    }

    protected double getSpeed() {
        return speed;
    }

    protected void setSpeed(double speed) {
        this.speed = speed;
    }

    protected String getLine() {
        return line;
    }

    protected void setLine(String line) {
        this.line = line;
    }

    protected String getCon() {
        return con;
    }

    protected void setCon(String con) {
        this.con = con;
    }

    protected String getDyn() {
        return dyn;
    }

    protected void setDyn(String dyn) {
        this.dyn = dyn;
    }

    protected String getMenu() {
        return menu;
    }

    protected void setMenu(String menu) {
        this.menu = menu;
    }

    protected String getNum() {
        return num;
    }

    protected void setNum(String num) {
        this.num = num;
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

    protected String getReset() {
        return reset;
    }

    protected void setReset(String reset) {
        this.reset = reset;
    }
}
