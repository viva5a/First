package Lesson5;

public class Player {
    String nickname;
    int points;
    int level;
    int money;

    public Player(String nickname, int points, int level, int money) {
        this.nickname = nickname;
        this.points = points;
        this.level = level;
        this.money = money;
    }

    public Player(String nickname) {
        this(nickname, 0, 1,100);
    }

    public Player(){
        this("");
    }

    void printInfo() {
        System.out.println(String.format("Игрок %s(lvl: %s) имеет %s и %s монет",
                this.nickname, this.points, this.level, this.money));
    }
}

