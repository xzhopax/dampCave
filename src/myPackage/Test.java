package myPackage;

public class Test {
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        System.out.println(MyClass.check(new Object[] {66, 101}, 66));
        System.out.println(MyClass.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));
        System.out.println(MyClass.check(new Object[] {"what", "a", "great", "kata"}, "kat"));
    }
}
