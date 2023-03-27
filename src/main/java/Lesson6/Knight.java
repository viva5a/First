package Lesson6;

import java.io.PrintStream;

public class Knight extends Player {

    private String swordTitle;
   // private String nickname;

    public Knight(String nickname, int points, String swordTitle) {
        super(nickname, points, "Рыцарь");
        this.swordTitle = swordTitle;

    }

    public Knight(String nickname, int points) {
        this(nickname, points, "Меч-кладенец");
    }

        public void saddleHorse () {
            System.out.println("Вперед, Плотва!");
        }


        public String getSwordTitle () {
            return swordTitle;
        }

        public void setSwordTitle (String swordTitle){
            this.swordTitle = swordTitle;
        }

    /*public void printInfo () {
        super.printInfo();
        super.nickname ="";
        System.out.printf("его меч:%s%n", swordTitle);

        }*/

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Его меч: %s%n", swordTitle);
    }

    @Override
    public void doAction() {
        System.out.printf("%s машет мечем %s%n", getNickname(), getSwordTitle());
    }
}