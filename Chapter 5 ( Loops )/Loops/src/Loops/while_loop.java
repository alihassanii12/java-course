package Loops;
import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int totalDays = input.nextInt();

        int day = 1;

        // Generate sales report
        while (day <= totalDays) {
            System.out.println("Day " + day + ": Sales report generated successfully.");
            day++;
        }

        System.out.println("All sales reports have been generated.");

        input.close();
    }
}