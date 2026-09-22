import java.util.Scanner;

public class if_else_statement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Age: ");
        int age = input.nextInt();

        if (age > 18){
            System.out.println("Your are eligible to voting!:");

        }
        else {
            System.out.println("Your are not eligible to voting yet!:");
        }
    }
}
