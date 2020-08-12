package myProjekt.gasolineConsumption;



class Car {

    // double[] trafficCongestion - расход бензина в зависимости от загруженности дорог
    private final double[] trafficCongestion = new double[]{7.0,8.0,9.0,10.0,12.0,14.0,15.0,16.0,18.0,20.0};
    private static final double[] speedCongestion = new double[]{9.5,6.0,4.8,4.0,3.5,4.0,5.0,6.0,8.0,10.5};



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


}
