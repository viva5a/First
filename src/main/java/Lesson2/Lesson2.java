package Lesson2;

public class Lesson2 {

    public static void main(String[] args) {

        // test();
        //test2();

          boolean isPremium = rewardEmployee("Max", 200);
            System.out.println(isPremium);
            System.out.println(rewardEmployee("Kristina", 700));
            System.out.println(rewardEmployee("Timofei", -1500));


        /*checkAppraisalWithArg();
        checkAppraisalWithArg(5);
        checkAppraisalWithArg(4);
        checkAppraisalWithArg(3);
        checkAppraisalWithArg(2);
        checkAppraisalWithArg(1);
        checkAppraisalWithArg(-1);
        checkAppraisalWithArg(6);*/
    }


    private static void test() {

        int c = 1;
        System.out.println(c);
        System.out.println(c + 1);
        System.out.println(c++);
        System.out.println(++c);
    }

    private static void test2() {
        int a = 5;
        int b = 5;

        int resultOne = 2 * ++a;
        int resultTwo = 2 * b++;
        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(a + " " + b);
    }

    private static boolean rewardEmployee(String name, int premium) {

             /*string name = "Max";
             int premium = 500;*/

        if (premium < 0) {
            System.out.println("Неверное значение премии");
            return false;
        }

        System.out.println("Готовим бумаги для премирования " + name);
        System.out.println("Выделяем бюджет для премирования " + name + " на сумму " + premium);
        System.out.println("Зачисляем на карточку средства" + name + " на сумму " + premium);
        System.out.println("Процесс завершен");
        System.out.println();

        return true;

    }

}





