package oracle.quest4;

public class Main {
    public static void main(String[] args) {

        Game seson1 = new Game();

        seson1.registredTeam(new Team("Зенит"));
        seson1.registredTeam(new Team("Спартак"));
        seson1.registredTeam(new Team("Динамо"));
        seson1.registredTeam(new Team("ЦСКА"));

        seson1.startGame(1,-5);
        seson1.startGame(2,4);
        seson1.startGame(3,10);

    }
}
