package oracle.quest3;

public class Main {

    public static void main(String[] args) {
        Cards c1 = new Cards();
        System.out.println(c1.getNumberCard());
        System.out.println(c1.getCredits());
        System.out.println(c1.getTickets());

        Cards c2 = new Cards();
        System.out.println(c2.getNumberCard());

        Cards c3 = new Cards();
        System.out.println(c3.getNumberCard());

        c1.setCredits(8);
        ;
       // System.out.println(c1.getCredits());

    }
}
