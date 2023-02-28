package Lesson2;

/*Тема: "Цикл While"
Непредсказуемый цикл*/

import java.util.concurrent.ThreadLocalRandom;

public class WhileTest {
    public static void main(String[] args) {

        int countApples = 20;
   while (countApples > 0) {
       countApples = getContApplesAfterEat(countApples);

       System.out.println("Яблок стало меньше. Осталось " + countApples + " штук.");
             }

        do {
            System.out.println("DO_WHILE");
        } while (countApples > 0);

      }

    private static int getContApplesAfterEat(int countApples) {
        return countApples - (ThreadLocalRandom.current().nextInt(5) + 1);
     }
}
