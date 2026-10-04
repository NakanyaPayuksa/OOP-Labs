package lab3;

public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule pm = new PaymentModule(0);

        pm.payment(new Fulltimer("Somchai", 30000));
        System.out.println("After Fulltimer          : " + pm.getTotalPay());

        pm.payment(new Hourly("Somsri", 200, 40));
        System.out.println("After Hourly             : " + pm.getTotalPay());

        pm.payment(new Manager("Manee", 50000, 5));
        System.out.println("After Manager (5 years)  : " + pm.getTotalPay());

        pm.payment(new Manager("Mana", 50000, 12));
        System.out.println("After Manager (12 years) : " + pm.getTotalPay());
    }
}