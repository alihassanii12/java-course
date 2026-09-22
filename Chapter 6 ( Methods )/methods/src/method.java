public class method {

    static double calculateFinalBill(double bill) {
        double discount = bill * 0.10;
        return bill - discount;
    }

     static void main() {

        double customer_1 = calculateFinalBill(1200.0);
        IO.println("Final Bill: " + customer_1);

        double customer_2 = calculateFinalBill(3000.0);
        IO.println("Final Bill: " + customer_2);

        double customer_3 = calculateFinalBill(500.0);
        IO.println("Final Bill: " + customer_3);
    }
}