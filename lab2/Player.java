package lab2;

public class Player {
    // ใช้ protected เพื่อให้คลาสลูก (FootballPlayer, BasketballPlayer) เข้าถึงตัวแปรได้โดยตรง
    protected String name;
    protected int jerseyNumber;
    protected int minutesPlayed;

    // Constructor คลาสแม่
    public Player(String n, int j) {
        name = n;
        jerseyNumber = j;
        minutesPlayed = 0;
    }

    public void print() {
        System.out.println(name + ": " + jerseyNumber);
    }

    public void playGame() {
        // เมธอดพื้นฐานของคลาสแม่
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }
}