package lab3;

public class PaymentModule {
    private double totalPay;

    public PaymentModule(double totalPay) {
        this.totalPay = totalPay;
    }

    public void payment(Employee e) {
        double pay = e.computePay();

        if (e instanceof Manager) {              
            Manager m = (Manager) e;
            if (m.getWorkYear() > 10) {
                pay = pay * 2;
            }
        }
        totalPay += pay;
    }

    public double getTotalPay() {
        return totalPay;
    }
}