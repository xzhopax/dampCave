package myProjekt.gasolineConsumption;

public class Info {

    protected void menu() {
        System.out.println("<<<===<<<===<<<========МЕНЮ========>>>===>>>===>>>");
        System.out.println("<<<====<<<=====Volkswagen polo sedan====>>>====>>>");
        System.out.println("Нажми цыфру 1 для: Расчета затрат бензина в городе.");
        System.out.println("Нажми цыфру 2 для: Расчета затрат бензина на трассе.");
        System.out.println("Нажми цыфру 3 для: Выхода из программы.");
        System.out.print("Введите значение : ");
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
}
