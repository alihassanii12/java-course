public class assignment_operator {
    public static void main(String[] args) {

        // Starting shopping cart amount
        double bill = 1000.00;

        // Assignment operator (=)
        double discount = 100.00;

        // Add delivery charges using +=
        bill += 150.00;

        // Apply discount using -=
        bill -= discount;

        // Apply 10% tax using *=
        bill *= 1.10;

        // Split bill using /=
        bill /= 2;

        // Get remaining amount using %=
        bill %= 100;

        // Final result
        System.out.println("-----------------------------");
        System.out.println("       SHOPPING BILL");
        System.out.println("-----------------------------");
        System.out.println("Final Remaining Amount: " + bill);
        System.out.println("-----------------------------");
    }
}