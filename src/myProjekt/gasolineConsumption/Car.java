package myProjekt.gasolineConsumption;


import java.util.HashMap;
import java.util.Map;

class Car {

    // double[] trafficCongestion - расход бензина в зависимости от загруженности дорог
    private final double[] trafficCongestion = new double[]{7.0,8.0,9.0,10.0,12.0,14.0,15.0,16.0,18.0,20.0};
    private static final double[] speedCongestion = new double[]{9.5,6.0,4.8,4.0,3.5,4.0,5.0,6.0,8.0,10.5};
    private Info info = new Info();
    private  double speed = 0;
    private  String line = "";
    private  String con = "";
    private  String dyn = "";
    private  String menu = "";
    private  String num;
    private  double dist = 0, price = 0, distance = 0, price2 = 0;
    private  int traffic = 0;
    private  boolean conditioner = true, dynamicDriving = true, conditioner2 = true, dynamicDriving2 = true;



    //priceGAS - высчитываем кол-во литров бензина и потраченных денег на пройденный путь (VW polo)
    protected void priceGAS
           (double dist, int traffic, double gasolinePrice, boolean conditioner, boolean dynamicDriving) {
        double trafCon = trafficCongestion[traffic - 1];
        double gas = 0, result;

        if (conditioner) {
            gas += trafCon + 0.5 ;
        } else gas += trafCon ;

        if (dynamicDriving) {
            gas += 2.0;
        }
        gas = (gas / 100) * dist;
        result = gas * gasolinePrice;

        System.out.println("=============================================");
        System.out.println("За пройденный путь в населенном пункте вы потратили:");
        System.out.printf("Бензин : %.2f литров\n", gas);
        System.out.printf("Денег: %.2f рублей\n", result);
        System.out.println("=============================================\n");
    }

    // double sc - высчитывает расход бензина в зависимости от скорости (VW polo)
    private static double sc(double speed) {
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
       double gas = 0, result;

       if (conditioner) {
           gas += Car.sc(speed) + 0.5;
       } else gas += Car.sc(speed) ;

        if (dynamicDriving) {
            gas +=  + 2.0;
        }
        gas = (gas / 100) * distance;
        result = gas * price;

        System.out.println("=============================================");
        System.out.println("За пройденный путь по трассе вы потратили:");
        System.out.printf("Бензин : %.2f литров\n", gas);
        System.out.printf("Денег: %.2f рублей\n", result);
        System.out.println("=============================================\n");
    }


//    protected boolean ifFlag(String incomingStream) {
//
//        switch (incomingStream){
//            case "on" :
//            case "yes" :
//                return true;
//            case "off" :
//            case "no" :
//                return false;
//        }
//            return false;
//        }

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
                setMenu("");
                setDyn("");
                setCon("");
                setLine("");

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






    protected void resetValues(){

    }


    protected Info getInfo() {
        return info;
    }

    protected void setInfo(Info info) {
        this.info = info;
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

    protected double getDist() {
        return dist;
    }

    protected void setDist(double dist) {
        this.dist = dist;
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

    protected double getPrice2() {
        return price2;
    }

    protected void setPrice2(double price2) {
        this.price2 = price2;
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

    protected boolean isConditioner2() {
        return conditioner2;
    }

    protected void setConditioner2(boolean conditioner2) {
        this.conditioner2 = conditioner2;
    }

    protected boolean isDynamicDriving2() {
        return dynamicDriving2;
    }

    protected void setDynamicDriving2(boolean dynamicDriving2) {
        this.dynamicDriving2 = dynamicDriving2;
    }
}
