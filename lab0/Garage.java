package lab0;//Constructor

public class Garage {
    public static void main(String[] args) {
        Car car1 = new Car("Black");
        int s = car1.speed;
        Car car2 = new Car("Blue");
        String c = car1.color;
        String c2 = car2.color;
        double w = car2.weight;
        System.out.println(c);
    }
}