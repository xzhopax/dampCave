package oracle.quest3;

public class Cards {

    private double credits = 0d;
    private int tickets = 0;
    private int numberCard = 0;
    static int counter;

    public double getCredits() {
        System.out.print("Коллочество ваших кредитов : ");
        return credits;
    }

    protected void setCredits(double credits) {
        if (credits >= 0) {
            this.credits = credits;
        } else System.out.println("Вы пытаетесь нарваться на коллекторов, лучше пополните свой баланс");
    }

    public int getTickets() {
        System.out.print("Колличество ваших билетов составляет : ");
        return tickets;
    }

    protected void setTickets(int tickets) {
        if (tickets >= 0) {
            this.tickets = tickets;
        } else System.out.println("билетов не может быть меньше 0");
    }

    public int getNumberCard() {
        System.out.print("Номер вашей карты : ");
        return numberCard;
    }

    public Cards (){
        this.numberCard = counter = counter + 1;
        this.tickets = 0;
        this.credits = 0;
    }

}
