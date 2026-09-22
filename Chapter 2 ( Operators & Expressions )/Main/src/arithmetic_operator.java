public class arithmetic_operator {
    public static void main(String[] args) {

        // Medicine prices
        double medicine1 = 120.00;
        double medicine2 = 88.80;
        double medicine3 = 356.54;

        // Quantity of medicines
        int quantity1 = 2;
        int quantity2 = 3;
        int quantity3 = 1;

        // Multiplication (*) - price × quantity
        double medicine1Total = medicine1 * quantity1;
        double medicine2Total = medicine2 * quantity2;
        double medicine3Total = medicine3 * quantity3;

        // Addition (+) - calculate total bill
        double total = medicine1Total + medicine2Total + medicine3Total;

        System.out.println("Medicine 1 Total: " + medicine1Total);
        System.out.println("Medicine 2 Total: " + medicine2Total);
        System.out.println("Medicine 3 Total: " + medicine3Total);
        System.out.println("Total Bill: " + total);

        // Subtraction (-) - apply discount
        double discount = 50.00;
        double afterDiscount = total - discount;

        System.out.println("Discount: " + discount);
        System.out.println("After Discount: " + afterDiscount);

        // Division (/) - split bill between 2 people
        double perPerson = afterDiscount / 2;

        System.out.println("Bill Per Person: " + perPerson);

        // Modulus (%) - check remaining amount
        double remaining = afterDiscount % 100;

        System.out.println("Remaining After 100 Division: " + remaining);

        // Increment (++) - increase medicine quantity
        quantity1++;

        System.out.println("Medicine 1 Quantity After Increment: " + quantity1);

        // Decrement (--) - decrease medicine quantity
        quantity2--;

        System.out.println("Medicine 2 Quantity After Decrement: " + quantity2);

        // Final Bill
        System.out.println("-----------------------------");
        System.out.println("         FINAL BILL");
        System.out.println("-----------------------------");
        System.out.println("Original Bill : " + total);
        System.out.println("Discount      : " + discount);
        System.out.println("Final Bill    : " + afterDiscount);
        System.out.println("-----------------------------");
    }
}