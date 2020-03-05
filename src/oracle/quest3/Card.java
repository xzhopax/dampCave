package oracle.quest3;

public class Card {

    private double credits;
    private int tickets;
    private int numberCard;
    private static int counter;

    public double getCredits() {
        return credits;
    }

    protected void setCredits(double credits) {
        if (credits >= 0) {
            this.credits = credits;
        } else System.out.println("Вы пытаетесь нарваться на коллекторов, лучше пополните свой баланс");
    }

    protected int getTickets() {
        return tickets;
    }

    protected void setTickets(int tickets) {
        if (tickets >= 0) {
            this.tickets = tickets;
        } else System.out.println("билетов не может быть меньше 0");
    }

    protected int getNumberCard() {
        return numberCard;
    }

    protected void getBalanceCard(){
        System.out.printf("Номер карты : %d\n", getNumberCard());
        System.out.println("Баланс Вашей карты :");
        System.out.printf("1. Кредиты : %.1f\n", getCredits());
        System.out.printf("2. Билетов : %d\n", getTickets());
        System.out.println("------------");
    }

    public Card(){
        this.numberCard = counter ++;
    }

}
