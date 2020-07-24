package org.stepik.javaBasic.numberIntegration;

import java.util.function.DoubleUnaryOperator;

class NumberIntegral {
    //метод левых прямоугольников

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {

        int n = 1000000;
        double result = 0, h;

        h = (b - a) / n; //Шаг сетки

        for(int i = 0; i < n; i++) {
            result += f.applyAsDouble(a + h * (i + 0.5)); //Вычисляем в средней точке и добавляем в сумму
        }

        result *= h;

        return result;
    }
}
