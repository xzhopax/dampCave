package oracle.quest2;

public class LoopShape {
   private String sim = "#";
   private String prob = " ";

    public String getSim() {
        return sim;
    }

    public String getProb() {
        return prob;
    }

    public void createRectangle(int width, int height) {
        if (width > 0 && height > 0) { // если ширина и высота больше 0
            for (int i = 0; i < width; i++) {

                if (i == 0 | i == width - 1) { // первую и последнюю строчку заполнить #
                    for (int b = 0; b < height; b++) {
                        System.out.print(getSim());
                    }
                } else for (int b = 0; b < height; b++) {
                    if (b == 0 | b == height - 1) { // первый и последний символ #
                        System.out.print(getSim());
                    } else System.out.print(getProb()); // остальные заполнить пробелами
                }
                System.out.print("\n"); // после каждого цикла перенос строки
            }
        } else  System.out.println("Numbers must be only positive !!!");
    }
   public void createTriangle(int length) {
       if (length > 0) { // если длина больше 0
           for (int i = 0; i < length; i++) {
               if (i == 0 | i == length - 1){ // в первой строчке и последней, заполняем все #
                   for (int b = 0; b <= i; b++) {
                       System.out.print(getSim());
                   }
               } else for (int b = 0; b <= i; b++) {
                   if (b == 0 | b == i) { // первый и последний символ #
                       System.out.print(getSim());
                   } else System.out.print(getProb()); // остальные заполнить пробелами
               }
               System.out.print("\n"); // после каждого цикла перенос строки
               }
           } else  System.out.println("Numbers must be only positive !!!");
       }
   }


