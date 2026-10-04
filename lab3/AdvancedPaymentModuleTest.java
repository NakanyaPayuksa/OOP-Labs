package lab3;

public class AdvancedPaymentModuleTest {
    public static void main(String[] args) {
        AdvancedPaymentModule apm = new AdvancedPaymentModule(0);

        Employee[] list = {
            new Fulltimer("Somchai", 30000),
            new Hourly("Somsri", 200, 40),
            new Manager("Manee", 50000, 5),
            new Manager("Mana", 50000, 12)
        };

        apm.payment(list);                                 
        System.out.println("After array payment : " + apm.getTotalPay());

        apm.payment(new Hourly("Somying", 200, 10));      
        System.out.println("After single payment: " + apm.getTotalPay());
    }
}
