package oracle.quest4;

import java.util.Random;

public class Team {
    private String name;
    private int winner, lose, tie;
    private int allGoal;
    private Random random = new Random();

    protected Team(String nameTeam){
        setName(nameTeam);
    }

    protected int random(){
        return random.nextInt(5);
    }

    protected void printTeam(){
        System.out.printf("Team %s\nWins: %d, Losses: %d, Ties: %d\nPoints Allowed: %d\n\n",
                getName(), getWinner(), getLose(), getTie(), getAllGoal());
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

}
