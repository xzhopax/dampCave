package myProjekt.gasolineConsumption;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Car {

    // double[] trafficCongestion - расход бензина в зависимости от загруженности дорог
    private final double[] trafficCongestion = new double[]{7.0,8.0,9.0,10.0,12.0,14.0,15.0,16.0,18.0,20.0};
    private final double[] speedCongestion = new double[]{9.5,6.0,4.8,4.0,3.5,4.0,5.0,6.0,8.0,10.5};
    private static List<String> result = new ArrayList<>();
    private Calendar calendar = Calendar.getInstance();
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d.M.yyyy");
    private StringBuilder sb = new StringBuilder();

    private final Info info = new Info();
    private  String line = "", con = "", dyn = "", menu = "",date = "", num;
    private  double price = 0, distance = 0,speed = 0, gas = 0, resultGas;
    private  int traffic = 0;
    private  boolean conditioner = true, dynamicDriving = true;

    Car() throws IOException {
    }

    //priceGAS - высчитываем кол-во литров бензина и потраченных денег на пройденный путь (VW polo)


    protected void priceGAS
            (double dist, int traffic, double gasolinePrice, boolean conditioner, boolean dynamicDriving) {

        if (conditioner) {
            setGas(getGas() + trafficCongestion[traffic - 1] + 0.5);
        } else setGas(getGas() + trafficCongestion[traffic - 1]);

        if (dynamicDriving) {
            setGas(getGas() + 2.0);
        }
        setGas((getGas() / 100) * dist);
        setResultGas(getGas() * gasolinePrice);
        reportCity();
        setGas(0);
        setResultGas(0);
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
        } return 0;
    }

    //highwayConsumption - высчитывает сколько потрачено литров бензина и денег на него двигаясь по трассе
    protected void highwayConsumption
             (double speed, double distance, double price, boolean conditioner, boolean dynamicDriving) {

       if (conditioner) {
           setGas(getGas() + sc(speed) + 0.5);
       } else setGas(getGas() + sc(speed));

        if (dynamicDriving) {
            setGas(getGas() + 2.0);
        }
        setGas((getGas() / 100) * distance);
        setResultGas(getGas() * price);
        reportHighway();
        setGas(0);
        setResultGas(0);
    }

    protected void ifConditioner(String incomingStream) {
        setCon(incomingStream);
        if (getCon().matches("on")|| getCon().matches("off")) {
            if (getCon().matches("on")) {
                setConditioner(true);
            } else if (getCon().matches("off")) {
                setConditioner(false);
            }
        }else {
            getInfo().error();
            setCon("");
        }

    }

    protected void ifDynamicDriving(String incomingStream) {
        setDyn(incomingStream);
        if (getDyn().matches("yes") || getDyn().matches("no")) {
            if (getDyn().matches("yes")) {
                setDynamicDriving(true);
            } else if (getDyn().matches("no")) {
                setDynamicDriving(false);
            }
        } else {
            getInfo().error();
            setDyn("");
        }
    }

    protected void returnMenu(String incomingStream){
        setMenu(incomingStream);
        if (getMenu().matches("yes") || getMenu().matches("no")) {
            // if "yes" -> reset fields and return menu
            // if "no" -> exit program
            if (getMenu().matches("yes")) {
                System.out.println();
                setDistance(0);
                setSpeed(0);
                setTraffic(0);
                setPrice(0);
                setDyn("");
                setCon("");
                setLine("");
                setDate("");
            } else {
                getInfo().goodBay();
                setLine("3");
            }
        } else {
            getInfo().error();
            setMenu("");
        }
    }

    protected void getDoublePrice(String StringNumPrice){
        setNum(StringNumPrice);

        if (getNum().matches("(\\d+(\\.\\d+))") && Double.parseDouble(getNum()) > 0
                || getNum().matches("\\d+") && Integer.parseInt(getNum()) > 0) {
            setPrice(Double.parseDouble(getNum()));
        } else {
            getInfo().error();
            setPrice(0);
        }
    }

    protected void getDoubleSpeed(String StringNumSpeed){
        setNum(StringNumSpeed);

        if (getNum().matches("(\\d+(\\.\\d+))") && Double.parseDouble(getNum()) > 0
                || getNum().matches("\\d+") && Integer.parseInt(getNum()) > 0) {
            setSpeed(Double.parseDouble(getNum()));
        } else {
            getInfo().error();
            setSpeed(0);
        }
    }

    protected void getDoubleDistance(String StringNumDistance){
        setNum(StringNumDistance);

        if (getNum().matches("(\\d+(\\.\\d+))") && Double.parseDouble(getNum()) > 0
                || getNum().matches("\\d+") && Integer.parseInt(getNum()) > 0) {
            setDistance(Double.parseDouble(getNum()));
        } else {
            getInfo().error();
            setDistance(0);
        }
    }

    protected void getIntegerTraffic(String StringNumTraffic){
        setNum(StringNumTraffic);
        if (getNum().matches("\\d") && Integer.parseInt(getNum()) > 0 && Integer.parseInt(getNum()) < 11) {
            setTraffic(Integer.parseInt(getNum()));
        } else {
            getInfo().error();
            setTraffic(0);
        }
    }

    protected void resetMenu(){
        setMenu("");
    }

    protected void addResult(String needSave) {
        getResult().add(needSave);
    }
    protected void outDispleyResult(){
        for (String s : getResult()) {
            System.out.println(s);
        }
    }

    protected void cleanResult() {
        getResult().clear();
    }

    protected void removeResult(int num){
        getResult().remove(num);
    }

    protected void todayDate(String date)  {
        isDateValid(date);

        if (isDateValid(date)){
            setDate(date);
        } else {
            getInfo().error();
            setDate("");
        }
    }

    protected static boolean isDateValid(String date)
    {
        try {
            DateFormat df = new SimpleDateFormat("d.M.yyyy");
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    protected void reportCity() {
        sb.append("=============================================\n");
        sb.append(getDate()).append("\n");
        sb.append("За пройденный путь в населенном пункте вы потратили:\n");
        sb.append(String.format("Бензин : %.2f литров\n", getGas()));
        sb.append(String.format("Денег: %.2f рублей\n", getResultGas()));
        sb.append("=============================================\n");
        addResult(sb.toString());
        System.out.println(sb.toString());
        sb.setLength(0);
    }
    protected void reportHighway() {
        sb.append("=============================================\n");
        sb.append(getDate()).append("\n");
        sb.append("За пройденный путь по трассе вы потратили:\n");
        sb.append(String.format("Бензин : %.2f литров\n", getGas()));
        sb.append(String.format("Денег: %.2f рублей\n", getResultGas()));
        sb.append("=============================================\n");
        addResult(sb.toString());
        System.out.println(sb.toString());
        sb.setLength(0);
    }


    @Override
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

    protected static List<String> getResult() {
        return result;
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
}
