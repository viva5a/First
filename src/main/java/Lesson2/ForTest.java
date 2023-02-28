package Lesson2;

/*Тема Инкремент и  цикл for
Цикл for используется в ситуациях,
когда важно иметь локальную переменную для управления циклом.
Управляющаяся переменная. Все сводится к предсказуемости исполнения цикла
 */

public class ForTest {
    public static void main(String[] args) {
        /*for(int i = 0; i < 10; i ++) {
            System.out.println(i);
        }*/

         /*  Пример на зацикливание
         for(int i = 0; i > -1; i ++) {
            System.out.println(i);
        }*/
        //Пример на константу (final - константа)
        /* for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            System.out.println("ВНЕШНИЙ ЦИКЛ i;" + i);
            for (int j = 0; j < LIMIT_OF_CYCLE; j++) {
                System.out.println("---внутренний цикл j:" + j);
                }
            */
        final int LIMIT_OF_CYCLE = 10;

        String smileStr = "";
        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            if (i % 2 == 0) {
                smileStr += "☺";
            } else {
                smileStr += "☻";
            }
            System.out.print(smileStr);

            for (int j = 0; j < LIMIT_OF_CYCLE - 1 - i; j++) {
                System.out.print("○");
            }
            System.out.println();
        }


        int i = 0;
        for (int I = 0; i < 20; i++) {

            if (i == 16) {
                break;
            }

            if (i % 2 == 0) {
                continue;
            }

            System.out.println(" i:" + i);
        }

        System.out.println("\nEND");

    }
}


