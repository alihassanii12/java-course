package Loops;
import java.util.Scanner;

public class for_loop {
    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int totalDays = input.nextInt();

        // Generate daily sales reports
        for (int day = 1; day <= totalDays; day++) {
            System.out.println("Day " + day + ": Sales report generated successfully.");
        }

        System.out.println("All reports generated successfully.");

        input.close();
    }
}