public class Main {
    public static void main(String[] args) {

        // Integer dataType - 32 bits
        int DeliveryTime = 35;
        int orderCount = 1500;
        int riderFees = 150;

        // Decimal dataType - 64 bits
        double itemPrice = 999.9;
        double distance = 7.8;

        // Boolean dataType - true/false
        boolean isDelivered = true;
        boolean isLoggedIn = false;

        // Char dataType - 16 bits, always use single quotation
        char grade = 'A';
        char symbol = '@';

        // String
        String name = "Ali Hassan";
        String city = "Lahore";
        String language = "I'm learning java";

        // Float
        float price = 9.9F;

        // Const
        final double GST_RATE = 0.18;
        final int MAX_ORDER = 100;
        final String COMPANY_NAME = "CODING WISE";

        // Type Casting

        // Implicit / Widening Casting
        int itemCount = 45;
        double total = itemCount;

        // Explicit / Narrowing Casting
        double productPrice = 999.9;
        int convertedPrice = (int) productPrice;

        // Print Integer values
        System.out.println("Delivery = " + DeliveryTime);
        System.out.println("Order Count = " + orderCount);
        System.out.println("Rider Fees = " + riderFees);

        // Print Decimal values
        System.out.println("Item Price = " + itemPrice);
        System.out.println("Distance = " + distance);

        // Print Boolean values
        System.out.println("Delivered = " + isDelivered);
        System.out.println("Logged In = " + isLoggedIn);

        // Print Char values
        System.out.println("Grade = " + grade);
        System.out.println("Symbol = " + symbol);

        // Print String values
        System.out.println("Name = " + name);
        System.out.println("City = " + city);
        System.out.println("Language = " + language);

        // Print Float
        System.out.println("Price = " + price);

        // Print Constants
        System.out.println("GST Rate = " + GST_RATE);
        System.out.println("Max Order = " + MAX_ORDER);
        System.out.println("Company Name = " + COMPANY_NAME);

        // Print Type Casting
        System.out.println("Item Count = " + itemCount);
        System.out.println("Total = " + total);
        System.out.println("Original Product Price = " + productPrice);
        System.out.println("Converted Price = " + convertedPrice);
    }
}