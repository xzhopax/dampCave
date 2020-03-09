package oracle.quest4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private int Temperature;
    private List<Team> registred = new ArrayList<>();
    private Team[] teams = new Team[4];
    private List<Game> match = new ArrayList<>();
    private int nameGame;

    protected int getNameGame() {
        return nameGame;
    }

    protected void setNameGame(int nameGame) {
        this.nameGame = nameGame;
    }

    protected int getTemperature() {
        return Temperature;
    }

    protected void setTemperature(int temperature) {
        Temperature = temperature;
    }

    protected void registredTeam(Team nameTeam){
        registred.add(nameTeam);
    }

    protected void vsRandom(){
        Collections.shuffle(registred);
    }

     protected void homeTeam(Team one, Team two){
        one.setPointGoal(one.random());
        two.setPointGoal(two.random());
        one.setAllGoal(one.getAllGoal() + one.getPointGoal());
        two.setAllGoal(two.getAllGoal() + two.getPointGoal());

        if (one.getPointGoal() > two.getPointGoal()){ // если победила первая команда
            one.setWinner(one.getWinner() + 1);
            two.setLose(two.getLose() + 1);

        } else if (two.getPointGoal() > one.getPointGoal()) { // если победила вторя команда
            two.setWinner(two.getWinner() + 1);
            one.setLose(one.getLose() + 1);

        } else {                              // если ничья
            one.setTie(one.getTie() + 1);
            two.setTie(two.getTie() + 1);
        }
     }
     protected void awayTeam(Team one, Team two){
         one.setPointGoal(one.random());
         two.setPointGoal(two.random());
         one.setAllGoal(one.getAllGoal() + one.getPointGoal());
         two.setAllGoal(two.getAllGoal() + two.getPointGoal());

         if (one.getPointGoal() > two.getPointGoal()){ // если победила первая команда
             one.setWinner(one.getWinner() + 1);
             two.setLose(two.getLose() + 1);
         } else if (two.getPointGoal() > one.getPointGoal()) { // если победила вторя команда
             two.setWinner(two.getWinner() + 1);
             one.setLose(one.getLose() + 1);
         } else {                              // если ничья
             one.setTie(one.getTie() + 1);
             two.setTie(two.getTie() + 1);
         }
     }

    protected void startGame(int nameGame, int temperature){
        this.nameGame = nameGame;
        this.setTemperature(temperature);

        if (temperature < -50 || temperature > 50) {
            System.out.println("Вы ввели некорректную температуру\n\n");
        } else if (temperature < 0)  {
            System.out.println("Too cold to play.\n\n");
        } else {
            vsRandom();
            awayTeam(registred.get(0), registred.get(1));
            homeTeam(registred.get(2), registred.get(3));

            System.out.printf("Game # %d\nTemperature: %d\nAway Team: Team %d, %d\nHome Team: Team %d, %d\n\n",
                    getNameGame(), getTemperature(), registred.get(0).getPointGoal(), registred.get(1).getPointGoal(),
                      registred.get(2).getPointGoal(), registred.get(3).getPointGoal());
        }

    }



    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
}
