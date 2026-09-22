public class method_parameter {

    static double calculateFinalBill(double bill, double discountRate) {
        double discount = bill * discountRate;
        return bill - discount;
    }

    static void main() {

        double customer_1 = calculateFinalBill(1200.0, 0.2);
        IO.println("Final Bill: " + customer_1);

        double customer_2 = calculateFinalBill(3000.0, 0.15);
        IO.println("Final Bill: " + customer_2);

        double customer_3 = calculateFinalBill(500.0, 0.5);
        IO.println("Final Bill: " + customer_3);
    }
}