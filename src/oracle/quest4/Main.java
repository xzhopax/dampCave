package oracle.quest4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Scheduler seson1 = new Scheduler();

        seson1.registredTeam(new Team("Зенит"));
        seson1.registredTeam(new Team("Спартак"));
        seson1.registredTeam(new Team("Динамо"));
        seson1.registredTeam(new Team("ЦСКА"));


        seson1.season();









    }
}
