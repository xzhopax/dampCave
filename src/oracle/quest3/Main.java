package oracle.quest3;

public class Main {

    public static void main(String[] args) {
      Card c1 = new Card();

       Card c2 = new Card();

       Terminal t1 = new Terminal(100,c1);
       Game g0 = new Game(c1);

        Terminal t4 = new Terminal(100, c2);
        Game g1 = new Game(c2);
        Game g2 = new Game(c2);


        t4.getBalanceCard(c2);

        t4.getListPrize();
        t4.getPrize(c2,1);

        t4.transferMap(c1,c2);
        t4.getBalanceCard(c1);
        t4.getBalanceCard(c2);




    }
}
