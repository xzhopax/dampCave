package oracle.quest1;

public class ComputeBMI {
    public static void main(String[] args) {
        BMI bmi = new BMI();
        bmi.getWeight();
        bmi.getHeight();
        System.out.println(bmi.weight);
        System.out.println(bmi.height);

    }
}
