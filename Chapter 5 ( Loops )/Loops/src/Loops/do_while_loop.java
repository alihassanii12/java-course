package Loops;
import java.util.Scanner;

public class do_while_loop {
    static void main() {

        Scanner input = new Scanner(System.in);

        int attempts = 1;
        int password;

        do {
            System.out.print("Enter your password: ");
            password = input.nextInt();

            if (password == 1234) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Wrong password. Try again.");
            }

            attempts++;

        } while (attempts <= 3);

        System.out.println("Thank you for using the system.");

        input.close();
    }
}