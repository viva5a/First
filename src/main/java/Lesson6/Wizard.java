package Lesson6;

public class Wizard extends Player {
    public Wizard(String nickname, int points) {
        super(nickname, points, "Волшебник");
    }


    @Override
    public void doAction() {
        System.out.printf("%s произносит заклинание%n", getNickname());

    }
}

