import java.util.Scanner;

public class else_if_statement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Student information
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter marks: ");
        int marks = input.nextInt();

        // Grade calculation
        if (marks >= 90) {
            System.out.println("Grade: A+");
            System.out.println("Remarks: Excellent!");

        } else if (marks >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Very Good!");

        } else if (marks >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Good!");

        } else if (marks >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Satisfactory");

        } else if (marks >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Needs Improvement");

        } else {
            System.out.println("Grade: F");
            System.out.println("Remarks: Failed");
        }

        // Final result
        System.out.println();
        System.out.println("================================");
        System.out.println("       STUDENT REPORT");
        System.out.println("================================");
        System.out.println("Student Name : " + name);
        System.out.println("Marks        : " + marks);

        // Pass / Fail
        if (marks >= 50) {
            System.out.println("Status       : PASS");
        } else {
            System.out.println("Status       : FAIL");
        }

        System.out.println("================================");

        input.close();
    }
}
