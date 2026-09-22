import java.util.Scanner;

public class restaurant_management {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Constants
        final double GST_RATE = 0.18;
        final double DISCOUNT_RATE = 0.10;
        final int MAX_TABLES = 20;

        // Restaurant information
        String restaurantName = "Restaurant";
        String city = "Lahore";

        // Customer information
        System.out.print("Enter your name: ");
        String customerName = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Table information
        System.out.print("Enter table number: ");
        int tableNumber = input.nextInt();

        // Food information
        System.out.print("Enter food name: ");
        input.nextLine();
        String foodName = input.nextLine();

        System.out.print("Enter food price: ");
        double foodPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Boolean
        System.out.print("Are you a member? (true/false): ");
        boolean isMember = input.nextBoolean();

        // Arithmetic Operator (*)
        double subtotal = foodPrice * quantity;

        // Assignment Operator (+=)
        double bill = subtotal;

        // Assignment Operator (+=)
        double serviceCharges = 100.00;
        bill += serviceCharges;

        // Comparison Operator (>=)
        boolean isAdult = age >= 18;

        // Comparison Operator (<=)
        boolean validTable = tableNumber <= MAX_TABLES;

        // Logical Operator (&&)
        boolean canOrder = isAdult && validTable;

        // Discount
        double discount = 0;

        // Logical Operator (&&)
        if (isMember && subtotal >= 1000) {
            discount = subtotal * DISCOUNT_RATE;
        }

        // Assignment Operator (-=)
        bill -= discount;

        // GST calculation
        double gst = bill * GST_RATE;

        // Assignment Operator (+=)
        bill += gst;

        // Type Casting
        int finalBill = (int) bill;

        // Modulus Operator (%)
        double remaining = bill % 100;

        // Increment Operator (++)
        quantity++;

        // Decrement Operator (--)
        quantity--;

        // Restaurant information
        System.out.println("\n=================================");
        System.out.println("      " + restaurantName);
        System.out.println("            " + city);
        System.out.println("=================================");

        // Customer information
        System.out.println("Customer Name : " + customerName);
        System.out.println("Age           : " + age);
        System.out.println("Member        : " + isMember);

        // Order information
        System.out.println("---------------------------------");
        System.out.println("Table Number  : " + tableNumber);
        System.out.println("Food          : " + foodName);
        System.out.println("Food Price    : Rs. " + foodPrice);
        System.out.println("Quantity      : " + quantity);

        // Bill information
        System.out.println("---------------------------------");
        System.out.println("Subtotal      : Rs. " + subtotal);
        System.out.println("Service       : Rs. " + serviceCharges);
        System.out.println("Discount      : Rs. " + discount);
        System.out.println("GST           : Rs. " + gst);
        System.out.println("Final Bill    : Rs. " + bill);

        // Type casting result
        System.out.println("Rounded Bill  : Rs. " + finalBill);

        // Modulus result
        System.out.println("Remaining     : Rs. " + remaining);

        // Comparison + Logical result
        System.out.println("---------------------------------");
        System.out.println("Adult Customer: " + isAdult);
        System.out.println("Valid Table   : " + validTable);
        System.out.println("Can Order     : " + canOrder);

        System.out.println("=================================");

        // Close Scanner
        input.close();
    }
}