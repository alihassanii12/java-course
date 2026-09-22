import java.util.Scanner;

public class methods {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter customer name: ");
        String customerName = input.nextLine();

        System.out.println("Enter itemName: ");
        String itemName = input.nextLine();

        System.out.println("Enter price: ");
        double price = input.nextDouble();

        System.out.println("Enter memberShip: ");
        boolean memberShip = input.nextBoolean();

        System.out.println("customerName: " + customerName);
        System.out.println("itemName: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("memberShip: " + memberShip);
    }
}
