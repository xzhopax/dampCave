package myProjekt.stopwatch;

public class Timer extends Thread {

    private static int second = 0;
    private static int minute = 0;
    private static int hour = 0;
    private static int day = 0;
    private static boolean flag = false;

    protected Timer(){}

    protected Timer(int hour, int minute, int second){

        Timer.hour = hour;
        Timer.minute = minute;
        Timer.second = second;
    }

    public void run() {
        while (!flag) { // бесконечный цикл (пока флаг = ложь)
            try {
                Thread.sleep(1000); // ждать 1 сек.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            second++;

            if (second == 60) {
                minute++;
                second = 0;
            } // если 60 секунды, то минута +1 а секунды сбрасываются на 0

            if (minute == 60) {
                hour++;
                minute = 0;
            } // если 60 минут, то час +1 а минуты сбрасываются на 0

            if (hour == 24) {
                day++;
                hour = 0;
            } // если 24 часа, то день +1 а часы сбрасываются на 0
            System.out.printf("Day: %d Hour: %d Minute: %d, Second: %d\n",day, hour, minute, second);// вывод времени

            if (flag){ // когда флаг = истине (кнопка стоп)
                System.out.println("\n**************************************************************");
                System.out.printf(" -> Elapsed time: Day: %d and %d Hour, %d Minute, %d Second <-\n",day,hour,minute,second);
                System.out.println("**************************************************************");
            }
        } // end while

    } // end runTime

    protected static void setStop() {
        Timer.flag = true;
    } // установить флаг в истину (кнопка стоп)
} // end class Timer
