package Lesson6;

public class Main {
    public static void main(String[] args) {

        //  Player player = new Player();
        Wizard wizard = new Wizard("Александра", 1000);
        Knight knight = new Knight("Анатолий",777, "Экскалибур");

        wizard.printInfo();
        knight.printInfo();

        wizard.doAction();
        knight.doAction();
    }
}
