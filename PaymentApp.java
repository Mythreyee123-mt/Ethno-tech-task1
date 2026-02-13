package p8;
import java.util.Scanner;
interface Payment {
    void pay(double amount);
}
class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done using UPI.");
    }
}
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done using Credit Card.");
    }
}
class DebitCard implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done using Debit Card.");
    }
}
class Cash implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " paid by Cash.");
    }
}
public class PaymentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount:");
        double amount = sc.nextDouble();
        System.out.println("Choose Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");
        System.out.println("4. Cash");

        int choice = sc.nextInt();

        Payment payment = null;

        switch (choice) {
            case 1:
                payment = new UPI();
                break;
            case 2:
                payment = new CreditCard();
                break;
            case 3:
                payment = new DebitCard();
                break;
            case 4:
                payment = new Cash();
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        payment.pay(amount);

        sc.close();
    }
}
