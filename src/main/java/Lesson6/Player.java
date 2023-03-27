package Lesson6;

public abstract class Player {
    protected String nickname;
    private int points;
    private final String russianProfession;

    public Player(String nickname, int points, String russianProfession) {
        this.nickname = nickname;
        this.points = points;
        this.russianProfession = russianProfession;
    }

    

    /*public Player(){

    }*/

    String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void printInfo() {
    System.out.printf("%s  %s имеет %s очков%n", russianProfession, nickname, points);
    }

  public abstract void doAction();


}



