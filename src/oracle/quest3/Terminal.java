package oracle.quest3;

public class Terminal {
    private int money;

    public Terminal(int money){
        this.money = money;
        System.out.printf("Вы внесли : %dр\n", money);
        System.out.println("Вставьте вашу карту для пополнения баланаса");
        System.out.println("---------------");
    }
    public Terminal(int money, Card numberCard){
        System.out.printf("Номер карты : %d\n", numberCard.getNumberCard());
        if (money >= 0) {
            System.out.printf("Вы внесли : %dр\n", money);
            numberCard.setCredits(numberCard.getCredits() + (money * 2));
            System.out.printf("Кредиты : %.2f\n", numberCard.getCredits());
            System.out.println("----------------");
        } else { System.out.println("Вы внесли не корректную сумму, заберите вашу карту");
          }
    }
    public Terminal(Card numberCard){
        numberCard.getBalanceCard();
    }

    public void getPrize(Card numberCard, int number){
        switch (number) {
            case 1 :
                if (numberCard.getTickets() >= 100) {
                    numberCard.setTickets(numberCard.getTickets() - 100);
                    System.out.printf("Карта : %d\n", numberCard.getNumberCard());
                    System.out.printf("Вы выбрали : %s\n", CategoryOfPrize.BIG);
                    System.out.printf("Билетов осталось : %d\n", numberCard.getTickets());
                    System.out.println("--------------");
                    break;
                } else System.out.println("У вас не достаточно кредитов");
                    break;
            case 2 :
                if (numberCard.getTickets() >= 50) {
                    numberCard.setTickets(numberCard.getTickets() - 50);
                    System.out.printf("Карта : %d\n", numberCard.getNumberCard());
                    System.out.printf("Вы выбрали : %s\n", CategoryOfPrize.MEDIUM);
                    System.out.printf("Билетов осталось : %d\n", numberCard.getTickets());
                    System.out.println("--------------");
                    break;
                } else System.out.println("У вас не достаточно кредитов");
                    break;
            case 3 :
                if (numberCard.getTickets() >= 25) {
                    numberCard.setTickets(numberCard.getTickets() - 25);
                    System.out.printf("Карта : %d\n", numberCard.getNumberCard());
                    System.out.printf("Вы выбрали : %s\n", CategoryOfPrize.SMALL);
                    System.out.printf("Билетов осталось : %d\n", numberCard.getTickets());
                    System.out.println("--------------");
                    break;
                } else System.out.println("У вас не достаточно кредитов");
                break;
            default :
                System.out.println("Вы ввели некорректную цифру, повторите попытку");
        }
    }

    public void getListPrize(){
        System.out.println("Вам доступны призы за билеты :");
        System.out.printf("1. %s - 100 билетов\n", CategoryOfPrize.BIG);
        System.out.printf("2. %s - 50 билетов\n", CategoryOfPrize.MEDIUM);
        System.out.printf("3. %s - 25 билетов\n", CategoryOfPrize.SMALL);
    }

    public void  getBalanceCard(Card userCard){
        userCard.getBalanceCard();
    }

    public  void transferMap(Card userCard1, Card userCard2){
         userCard2.setCredits(userCard1.getCredits());
         userCard1.setCredits(userCard1.getCredits() - userCard1.getCredits());
         userCard2.setTickets(userCard1.getTickets());
         userCard1.setTickets(userCard1.getTickets() - userCard1.getTickets());
    }


}
