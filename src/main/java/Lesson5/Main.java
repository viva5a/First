package Lesson5;

import java.util.Locale;

public class Main {

        public static void main(String[] args) {
                Player player1 = new Player("Александр",1000, 80, 777 );
                Player player2 = new Player("Вадим", 1200, 80,777);
                Player player3 = new Player("Артем");

                        /*     player1.nickname = "Test";
                player2.level = 70;
                player1.money = 777;
                System.out.println(player1.nickname.toUpperCase());
                System.out.println(player1.nickname);*/

                player1.printInfo();
                player2.printInfo();
                player3.printInfo();
        }
}