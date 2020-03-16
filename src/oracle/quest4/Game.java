package oracle.quest4;


import java.util.Collections;

public class Game extends Scheduler {
    private int temperature;
    private int numGame;
    private int goalTeam1, goalTeam2, goalTeam3, goalTeam4;
    private static int nameMatch = 1;


    public Game(int temperature){
        this.setNumGame(nameMatch);
        this.setTemperature(temperature);
        nameMatch++;
        Collections.shuffle(getListTeam()); // перемешивает команды учавствующие в матче
        playGame(super.getListTeam().get(0), super.getListTeam().get(1)); // раставляем перемешанные команды из листа команд
        playGame(super.getListTeam().get(2), super.getListTeam().get(3)); // раставляем перемешанные команды из листа команд
    }

    private void playGame(Team team1, Team team2){

        setGoalTeam1(team1.random()); // случайное число
        team1.setAllGoal(team1.getAllGoal() + getGoalTeam1()); // случайное число присваиваем в голы

        setGoalTeam2(team2.random()); // случайное число
        team2.setAllGoal(team2.getAllGoal() + getGoalTeam2()); // случайное число присваиваем в голы

        if (getGoalTeam1() > getGoalTeam2()){ // если победила первая команда
            team1.setWinner(team1.getWinner() + 1);
            team2.setLose(team2.getLose() + 1);

        } else if (getGoalTeam2() > getGoalTeam1()) { // если победила вторя команда
            team2.setWinner(team2.getWinner() + 1);
            team1.setLose(team1.getLose() + 1);

        } else {                              // если ничья
            team1.setTie(team1.getTie() + 1);
            team2.setTie(team2.getTie() + 1);
        }
    }

    public void printGame(){
        System.out.printf("Game # %d\nTemperature: %d\nAway Team: Team %d, %d\nHome Team: Team %d, %d\n\n",
                getNumGame(), getTemperature(), getGoalTeam3(), getGoalTeam4(), getGoalTeam1(), getGoalTeam2());
    }

    private int getGoalTeam1() {
        return goalTeam1;
    }

    private void setGoalTeam1(int goalTeam1) {
        this.goalTeam1 = goalTeam1;
    }

    private int getGoalTeam2() {
        return goalTeam2;
    }

    private void setGoalTeam2(int goalTeam2) {
        this.goalTeam2 = goalTeam2;
    }

    private int getGoalTeam3() {
        return goalTeam3;
    }

    private void setGoalTeam3(int goalTeam3) {
        this.goalTeam3 = goalTeam3;
    }

    private int getGoalTeam4() {
        return goalTeam4;
    }

    private void setGoalTeam4(int goalTeam4) {
        this.goalTeam4 = goalTeam4;
    }

    protected static int getNameMatch() {
        return nameMatch;
    }

    private int getNumGame() {
        return numGame;
    }

    private void setNumGame(int nameGame) {
        this.numGame = nameGame;
    }

    private int getTemperature() {
        return temperature;
    }

    private void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
