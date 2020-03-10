package oracle.quest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class Scheduler extends Game {


    private static int hotTemp = 0;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String line;

    public Scheduler() throws IOException {
    }

    protected void season() throws IOException {
        while (Game.count != 3 || line.isEmpty()) {
            Game.nameMatch++;

            try{
                System.out.printf("Введите температуру игры #%d:\n", Game.nameMatch);
                line = reader.readLine();

                if (line.matches("[-]\\d")) { // если температура ниже 0
                    Game.count++;
                    Game.nameMatch--;

                } else if (line.matches("\\d++")) { // если целое положительное число
                     match.add(Integer.parseInt(line));
                    Game.count = 0;

                } else   if (line.matches("\\D") || line.matches("(([-+])?\\d+(\\.\\d+)?)+")){ // все остальное
                    System.out.println("Некорректный ввод, повторите попытку (вводите только цифры) :");
                    Game.nameMatch--;
                }

            } catch (IOException e){
                System.out.println("Нееее, так дело не пойдет....");

            }
        }
        if (count == 3) { // если 3 раза подряд холодно (температура ниже 0)
            System.out.println("Too cold to play.\nToo cold to play.\nToo cold to play.\n\n\n*********РЕЗУЛЬТАТЫ*********\n\n\n");


            for (Team t : getRegistred()){
                t.printTeam();
            }

            for (Game g : liga){
                g.printGame();
            }
            System.out.printf("Hottest Temp: %d\n", Collections.max(match));
            System.out.printf("Average Temp: %.1f\n", (double)Collections.max(match)/2);

        }

    }
}
