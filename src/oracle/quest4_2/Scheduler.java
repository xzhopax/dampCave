package oracle.quest4_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Scheduler {

    private static int hotTemp = 0;
    private static int numb = 0;
    public List<Team> listTeam = new ArrayList<>();
    protected List<Game> season = new ArrayList<>();

    public List<Team> getListTeam() {
        return listTeam;
    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String line;


    public void regisrTeam(String team){
        if(listTeam.size() != 4) {
            listTeam.add(new Team(team));
        } else System.out.println("Извините, регистрация завершена.");
    }

    protected void season() throws IOException {
        while (numb != 3 || line.isEmpty()) {

            try{
                System.out.printf("Введите температуру игры #%d:\n", Game.getNameMatch());

                line = reader.readLine();

                if(Integer.parseInt(line) < -50 || Integer.parseInt(line) > 50) {
                    System.out.println("Вы ввели некорректную температуру\n");

                } else if (line.matches("[-]\\d") ) { // если температура ниже 0
                    numb++;

                } else if (line.matches("\\d++")) { // если целое положительное число
                     season.add(new Game(Integer.parseInt(line)));
                    numb = 0;

                } else   if (line.matches("\\D") || line.matches("(([-+])?\\d+(\\.\\d+)?)+")){ // все остальное
                    System.out.println("Некорректный ввод, повторите попытку (вводите только цифры) :");
                }
            } catch (IOException e){
                System.out.println("Нееее, так дело не пойдет....");
            }
        }
        if (numb == 3) { // если 3 раза подряд холодно (температура ниже 0)
            System.out.println("Too cold to play.\nToo cold to play.\nToo cold to play.\n\n\n*********РЕЗУЛЬТАТЫ*********\n\n\n");





//            System.out.printf("Hottest Temp: %d\n", Collections.max(match));
//            System.out.printf("Average Temp: %.1f\n", (double)Collections.max(match)/2);

        }

    }
}
