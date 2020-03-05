package oracle.quest3;

public class Game {
    private static int max = 100;
    int number;

    public Game(Card numberCard){
        if (numberCard.getCredits() >= 50) {
            numberCard.setCredits(numberCard.getCredits() - 50);
            number = random();
            if (number >= 0 && number <= 25) {
                numberCard.setTickets(numberCard.getTickets() + 25);
            } else if (number >= 26 && number <= 50) {
                numberCard.setTickets(numberCard.getTickets() + 50);
            } else if (number >= 51 && number <= 75) {
                numberCard.setTickets(numberCard.getTickets() + 75);
            } else numberCard.setTickets(numberCard.getTickets() + 100);
        } else System.out.println("У Вас недостаточно кредитов, пополните баланс");

    }

    public static int random(){
        return (int) (Math.random() * ++max);
    }
}
