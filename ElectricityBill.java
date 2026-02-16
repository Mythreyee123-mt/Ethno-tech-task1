package p10;
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter units: ");
        int unit = input.nextInt();
        double amount=
        /**if (unit <= 100) {
        amount = unit * 5;
        } 
        else if (unit > 100 && unit <= 200) {
        amount = 100 * 5 + (unit - 100) * 7;
        } 
        else {
        amount = 100 * 5 + 100 * 7 + (unit - 200) * 10;
        }**/
                        (unit <= 100) ? 
                        unit * 5 :
                        (unit <= 200) ? 
                        100 * 5 + (unit - 100) * 7 :
                        100 * 5 + 100 * 7 + (unit - 200) * 10;

        System.out.println("Electricity Bill Amount = Rs. " + amount);
        input.close();
    }
}
