package myProjekt.gasolineConsumption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestCar {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Car day1 = new Car();
        System.out.print("Введите растояние: ");
        double dist = scanner.nextDouble();

        System.out.print("Введите загруженность дороги: ");
        int traffic = scanner.nextInt();

        System.out.print("Введите цену бензина за  1 литр: ");
        double price = scanner.nextDouble();

        day1.priceGAS(dist, traffic, price);

        System.out.print("Введите скорость: ");
        double speed = scanner.nextDouble();

        System.out.print("Введите пройденный путь: ");
        double distance = scanner.nextDouble();

        System.out.print("Введите стоимость бенизана за 1 литр: ");
        double price2 = scanner.nextDouble();

        day1.highwayConsumption(speed, distance, price2);

        scanner.close();
    }

}
