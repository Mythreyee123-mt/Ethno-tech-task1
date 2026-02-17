import java.util.Scanner;
public class LoginValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "admin";
        int correctPassword = 123;
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter Username: ");
            String username = sc.next();
            System.out.print("Enter Password: ");
            int password = sc.nextInt();
            if (username.equals(correctUsername) && password == correctPassword) {
                System.out.println("Login Successful");
                return;
            } else {
                attempts++;
                System.out.println("Incorrect Username or Password ");
                System.out.println("Attempts left: " + (3 - attempts));
            }
        }
        System.out.println("Account Blocked");
    }
}
