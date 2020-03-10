package oracle.quest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private int Temperature;
    private List<Team> registred = new ArrayList<>();
    protected List<Integer> match = new ArrayList<>();
    protected static List<Game> liga = new ArrayList<>();
    private int nameGame;
    protected static int count = 0;
    protected static int nameMatch = 0;

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

    protected List<Team> getRegistred() {
        return registred;
    }

    protected void registredTeam(Team nameTeam){
        registred.add(nameTeam);
    }

    protected void vsRandom(){
        Collections.shuffle(registred);
    }

     protected void homeTeam(Team one, Team two){
        one.setPointGoal(one.random()); // случайное число
        two.setPointGoal(two.random()); // случайное число
        one.setAllGoal(one.getAllGoal() + one.getPointGoal()); // случайное число присваиваем в голы
        two.setAllGoal(two.getAllGoal() + two.getPointGoal()); // случайное число присваиваем в голы

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
         one.setPointGoal(one.random()); // случайное число
         two.setPointGoal(two.random()); // случайное число
         one.setAllGoal(one.getAllGoal() + one.getPointGoal()); // случайное число присваиваем в голы
         two.setAllGoal(two.getAllGoal() + two.getPointGoal()); // случайное число присваиваем в голы

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
        this.setNameGame(nameGame);
        this.setTemperature(temperature);

        if (temperature < -50 || temperature > 50) { // если температура ниже  ниже -50 и выше 50
            System.out.println("Вы ввели некорректную температуру\n");

        } else if (temperature < 0 )  { // если температура ниже 0
            System.out.println("Too cold to play.\n\n");

        } else { // перемешивает команды и играем игру
            vsRandom(); // перемешивает команды учавствующие в матче
            awayTeam(registred.get(0), registred.get(1)); // раставляем перемешанные команды из листа команд
            homeTeam(registred.get(2), registred.get(3)); // раставляем перемешанные команды из листа команд
            liga.add(this);

        }

    }

    public void printGame(){
        System.out.printf("Game # %d\nTemperature: %d\nAway Team: Team %d, %d\nHome Team: Team %d, %d\n\n",
                getNameGame(), getTemperature(), registred.get(0).getPointGoal(), registred.get(1).getPointGoal(),
                registred.get(2).getPointGoal(), registred.get(3).getPointGoal());
    }
}
