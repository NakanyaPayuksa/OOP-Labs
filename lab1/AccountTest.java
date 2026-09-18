package lab1;

public class AccountTest {
    public static void main(String[] args) {
        System.out.println("=== 1. Test Valid Account Creation ===");
        Account acc1 = new Account("Fluke", 500.0);
        System.out.println("Name: " + acc1.getName());
        System.out.println("Balance: " + acc1.getBalance());

        System.out.println("\n=== 2. Test Invalid Account Creation (Non-positive balance) ===");
        Account acc2 = new Account("Marin", -100.0);
        System.out.println("Name: " + acc2.getName());
        System.out.println("Balance: " + acc2.getBalance());

        System.out.println("\n=== 3. Test Changing Name ===");
        acc1.setName("Fluke Dekde");
        System.out.println("Updated Name: " + acc1.getName());

        System.out.println("\n=== 4. Test Valid Deposit ===");
        acc1.deposit(200.0);
        System.out.println("Balance after deposit 200: " + acc1.getBalance());

        System.out.println("\n=== 5. Test Invalid Deposit (Negative or Zero) ===");
        acc1.deposit(-50.0);
        System.out.println("Balance after invalid deposit -50: " + acc1.getBalance());
    }
}
