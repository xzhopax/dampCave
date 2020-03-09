package oracle.quest4;

import java.util.Random;

public class Team {
    private String name;
    private int winner, lose, tie, pointGoal, allGoal;
    private Random random = new Random();

    public int random(){
        return random.nextInt(5);
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getWinner() {
        return winner;
    }

    protected void setWinner(int winner) {
        this.winner = winner;
    }

    protected int getPointGoal() {
        return pointGoal;
    }

    protected void setPointGoal(int pointGoal) {
        this.pointGoal = pointGoal;
    }

    protected int getAllGoal() {
        return allGoal;
    }

    protected void setAllGoal(int allGoal) {
        this.allGoal = allGoal;
    }

    protected int getLose() {
        return lose;
    }

    protected void setLose(int lose) {
        this.lose = lose;
    }

    protected int getTie() {
        return tie;
    }

    protected void setTie(int tie) {
        this.tie = tie;
    }

    protected Team(String nameTeam){
        this.name = nameTeam;
    }

    public void printTeam(){
        System.out.printf("Team %s\nWins: %d, Losses: %d, Ties: %d\nPoints Scored: %d, Points Allowed: %d\n\n",
                     getName(), getWinner(), getLose(), getTie(), getPointGoal(), getAllGoal());
    }

}
