package oracle.quest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scheduler {

    private static int allTemp = 0;
    private static int numb = 0;
    private static List<Team> listTeam = new ArrayList<>();
    private List<Game> season = new ArrayList<>();
    private List<Integer> resultTemp = new ArrayList<>();


    public List<Team> getListTeam() {
        return listTeam;
    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String line;


    public void regisrTeam(String team){
        if(listTeam.size() != 4) {
            listTeam.add(new Team(team));
        } else System.out.println("Извините, регистрация завершена, учавствует уже 4 команды.\n");
    }

    protected void season()  {
        while (numb != 3 || line.isEmpty()) {

            try{
                System.out.printf("Введите температуру игры #%d:\n", Game.getNameMatch());

                line = reader.readLine();

                if (line.matches("[-]\\d") ) { // если температура ниже 0
                    if(Integer.parseInt(line) < -50 || Integer.parseInt(line) > 50){
                        System.out.println("Вы ввели некорректную температуру\n");
                    } else numb++;

                } else if (line.matches("\\d++") || line.matches("[+]\\d")) { // если целое положительное число
                     season.add(new Game(Integer.parseInt(line)));
                     resultTemp.add(Integer.parseInt(line));
                    numb = 0;

                } else   if (line.matches("\\D") || line.matches("(([-+])?\\d+(\\.\\d+)?)+")) { // все остальное
                    System.out.println("Некорректный ввод, повторите попытку (вводите только цифры) :");
                }
            } catch (IOException e){
                System.out.println("Нееее, так дело не пойдет....");
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (numb == 3) { // если 3 раза подряд холодно (температура ниже 0)
            System.out.println("Too cold to play.\nToo cold to play.\nToo cold to play.\nSeason is over.\n\n");
            System.out.println("*********РЕЗУЛЬТАТЫ*********\n\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (Team t : listTeam) {
                t.printTeam();
            }

            for (Game g : season){
                g.printGame();
            }
            for (int i : resultTemp){
                allTemp += i;
            }

            System.out.printf("Hottest Temp: %d\n", Collections.max(resultTemp));
            System.out.printf("Average Temp: %.1f\n", (double)allTemp/resultTemp.size());

        }

    }
}
