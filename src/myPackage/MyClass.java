package myPackage;





public class MyClass {
    public static boolean check(Object[] a, Object x) {
        for (Object val : a) {
           if (val.equals(x))
               return true;
        }
        return false;
    }
}
