public class comparison_operator {
    public static void main(String[] args) {

        // Delivery information
        int deliveryTime = 35;
        int expectedTime = 40;

        // Order information
        int orderCount = 150;
        int maxOrders = 200;

        // Payment information
        double orderAmount = 2500.00;
        double minimumOrder = 1000.00;

        // Order status
        boolean isDelivered = true;
        boolean isPaid = false;

        // Greater than (>)
        System.out.println("Delivery is late: "
                + (deliveryTime > expectedTime));

        // Less than (<)
        System.out.println("Delivery is faster: "
                + (deliveryTime < expectedTime));

        // Greater than or equal to (>=)
        System.out.println("Orders limit reached: "
                + (orderCount >= maxOrders));

        // Less than or equal to (<=)
        System.out.println("Orders are within limit: "
                + (orderCount <= maxOrders));

        // Equal to (==)
        System.out.println("Order amount is minimum: "
                + (orderAmount == minimumOrder));

        // Not equal to (!=)
        System.out.println("Payment is pending: "
                + (isPaid != true));

        // Boolean comparison
        System.out.println("Order delivered: "
                + (isDelivered == true));

        // Discount eligibility
        System.out.println("Eligible for discount: "
                + (orderAmount >= minimumOrder));

        // Final result
        System.out.println("-----------------------------");
        System.out.println("      COMPARISON RESULT");
        System.out.println("-----------------------------");
        System.out.println("Delivery Time : " + deliveryTime + " minutes");
        System.out.println("Expected Time : " + expectedTime + " minutes");
        System.out.println("Order Count   : " + orderCount);
        System.out.println("Max Orders    : " + maxOrders);
        System.out.println("Order Amount  : Rs. " + orderAmount);
        System.out.println("Delivered     : " + isDelivered);
        System.out.println("Paid          : " + isPaid);
        System.out.println("-----------------------------");
    }
}