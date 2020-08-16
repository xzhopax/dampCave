package myProjekt.gasolineConsumption;

import java.io.IOException;

public class Info {
    StringBuilder sbInfo = new StringBuilder();


    public Info() throws IOException {
    }

    protected void menu() {
        sbInfo.append("<<<===<<<===<<<========МЕНЮ========>>>===>>>===>>>\n");
        sbInfo.append("<<<====<<<=====Volkswagen polo sedan====>>>====>>>\n");
        sbInfo.append("Нажми цыфру 1 для: Расчета затрат бензина в городе.\n");
        sbInfo.append("Нажми цыфру 2 для: Расчета затрат бензина на трассе.\n");
        sbInfo.append("Нажми цыфру 3 для: Вывода истории на экран.\n");
        sbInfo.append("Нажми цыфру 4 для: очистки истории.\n");
        sbInfo.append("Нажми цыфру 5 для: Выхода из программы.\n");
        sbInfo.append("Введите значение : ");
        System.out.println(sbInfo.toString());

    }

    protected void error() {
        System.out.println("Вы ввели неправильное значение.\n");
    }

    protected void goodBay() {
        System.out.println("\n================Good Bay================");
    }

    protected void dynamicDrive() {
        System.out.print("Динамичная езда -> да или нет? (ввести yes или no) :");
    }

    protected void returnMenu() {
        System.out.print("Вернуться в главное меню? (yes или no) :");
    }

    protected void conditionerPosition() {
        System.out.print("Кондиционер включен или выключен? (ввести on или off) :");
    }

    protected void inPriceGas() {
        System.out.print("Введите стоимость бенизана за 1 литр : ");
    }

    protected void inDistanceTraveled() {
        System.out.print("Введите пройденный путь в км : ");
    }

    protected void inSpeed() {
        System.out.print("Введите скорость в км/ч : ");
    }

    protected void inTrafficRoad() {
        System.out.print("Введите загруженность дороги от 1 до 10: ");
    }

    protected void spendingInTheCity(){
        System.out.println("\nДля расчета затрат бензина в городе :");
    }

    protected void spendingOnTheHighway() {
        System.out.println("\nДля расчета затрат бензина на трассе :");
    }

    protected void enteredDate(){
        System.out.print("Введите дату (пример: 25.11.2011) :");
    }

//    protected void reportCity() {
//        sb.append("=============================================");
//        sb.append(car.getDate()).append("\n");
//        sb.append("За пройденный путь в населенном пункте вы потратили:");
//        sb.append(String.format("Бензин : %.2f литров\n", car.getDate()));
//
//
//    }
}
