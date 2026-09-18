public class Car {
    public int speed;
    public String color;
    private double weight;

    public Car(String c) {
        color = c;
        speed = 0;
        weight = 1000.0d;
    }

    public Car(String c, int s) {
        color = c;
        speed = s;
        weight = 1000.0d;
    }
}