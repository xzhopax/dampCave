package oracle.quest4_2;


import java.util.Collections;

public class Game extends Scheduler {
    private int temperature;
    private int nameGame;
    private Team team1, team2, team3, team4;
    private int goal1, goal2, goal3, goal4;
    private static int nameMatch = 1;


    public Game(int temperature){
        this.setNameGame(nameMatch);
        this.setTemperature(temperature);
        nameMatch++;
        Collections.shuffle(getListTeam()); // перемешивает команды учавствующие в матче
        awayTeam(super.getListTeam().get(0), super.getListTeam().get(1)); // раставляем перемешанные команды из листа команд
        homeTeam(super.getListTeam().get(2), super.getListTeam().get(3)); // раставляем перемешанные команды из листа команд
    }

    public static int getNameMatch() {
        return nameMatch;
    }

    public int getNameGame() {
        return nameGame;
    }

    private void setNameGame(int nameGame) {
        this.nameGame = nameGame;
    }

    private Team getTeam1() {
        return team1;
    }

    private void setTeam1(Team team1) {
        this.team1 = team1;
    }

    private Team getTeam2() {
        return team2;
    }

    private void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Team getTeam3() {
        return team3;
    }

    private void setTeam3(Team team3) {
        this.team3 = team3;
    }

    public Team getTeam4() {
        return team4;
    }

    public void setTeam4(Team team4) {
        this.team4 = team4;
    }

    protected int getTemperature() {
        return temperature;
    }

    protected void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getGoal1() {
        return goal1;
    }

    public void setGoal1(int goal1) {
        this.goal1 = goal1;
    }

    public int getGoal2() {
        return goal2;
    }

    public void setGoal2(int goal2) {
        this.goal2 = goal2;
    }

    public int getGoal3() {
        return goal3;
    }

    public void setGoal3(int goal3) {
        this.goal3 = goal3;
    }

    public int getGoal4() {
        return goal4;
    }

    public void setGoal4(int goal4) {
        this.goal4 = goal4;
    }

    protected void homeTeam(Team team1, Team team2){

        setTeam1(team1); // присваиваем команду полю Game team1
        setGoal1(team1.random()); // случайное число
        team1.setAllGoal(team1.getAllGoal() + getGoal1()); // случайное число присваиваем в голы

        setTeam2(team2);  // присваиваем команду полю Game team2
        setGoal2(team2.random()); // случайное число
        team2.setAllGoal(team2.getAllGoal() + getGoal2()); // случайное число присваиваем в голы

        if (getGoal1() > getGoal2()){ // если победила первая команда
            team1.setWinner(team1.getWinner() + 1);
            team2.setLose(team2.getLose() + 1);

        } else if (getGoal2() > getGoal1()) { // если победила вторя команда
            team2.setWinner(team2.getWinner() + 1);
            team1.setLose(team1.getLose() + 1);

        } else {                              // если ничья
            team1.setTie(team1.getTie() + 1);
            team2.setTie(team2.getTie() + 1);
        }
     }
     protected void awayTeam(Team team3, Team team4){

         setTeam3(team3); // присваиваем команду полю Game team1
         setGoal3(team3.random()); // случайное число
         team3.setAllGoal(team3.getAllGoal() + getGoal3()); // случайное число присваиваем в голы

         setTeam4(team4); // присваиваем команду полю Game team1
         setGoal4(team4.random()); // случайное число
         team4.setAllGoal(team4.getAllGoal() + getGoal4()); // случайное число присваиваем в голы

         if (getGoal3() > getGoal4()){ // если победила первая команда
             team3.setWinner(team3.getWinner() + 1);
             team4.setLose(team4.getLose() + 1);

         } else if (getGoal4() > getGoal3()) { // если победила вторя команда
             team4.setWinner(team4.getWinner() + 1);
             team3.setLose(team3.getLose() + 1);

         } else {                              // если ничья
             team3.setTie(team3.getTie() + 1);
             team4.setTie(team4.getTie() + 1);
         }
    }

    public void printGame(){
        System.out.printf("Game # %d\nTemperature: %d\nAway Team: Team %d, %d\nHome Team: Team %d, %d\n\n",
                getNameGame(), getTemperature(), 2, 2, 2, 2);
    }
}
