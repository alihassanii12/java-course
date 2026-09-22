import java.util.Scanner;

public class if_statement {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.println("Enter Your Bill Amount: " );
       int bill = input.nextInt();


       if (bill > 50000){
           System.out.println("Big spender! You got free HandBag" );
           System.out.println("Thank you for shopping" );

       }
   }
}