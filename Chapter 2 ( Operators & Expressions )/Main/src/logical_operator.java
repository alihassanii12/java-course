public class logical_operator {
    public static void main(String[] args) {

        // User information
        boolean isLoggedIn = true;
        boolean isVerified = true;
        boolean isAdmin = false;

        // Order information
        double orderAmount = 2500.00;
        double minimumOrder = 1000.00;

        boolean isDelivered = false;
        boolean isPaid = true;

        // AND (&&)
        // Both conditions must be true
        System.out.println("User can access account: "
                + (isLoggedIn && isVerified));

        // OR (||)
        // At least one condition must be true
        System.out.println("User has special access: "
                + (isAdmin || isVerified));

        // NOT (!)
        // Converts true to false and false to true
        System.out.println("User is not logged in: "
                + (!isLoggedIn));

        // AND (&&)
        // Order is eligible when amount is enough AND payment is done
        System.out.println("Order is eligible: "
                + (orderAmount >= minimumOrder && isPaid));

        // OR (||)
        // Order is complete if it is delivered OR paid
        System.out.println("Order is in progress: "
                + (isDelivered || isPaid));

        // NOT (!)
        // Check if order is not delivered
        System.out.println("Order is not delivered: "
                + (!isDelivered));

        // Multiple logical operators
        boolean canGetDiscount =
                isLoggedIn && isVerified && orderAmount >= minimumOrder;

        System.out.println("Eligible for discount: "
                + canGetDiscount);

        // Final Result
        System.out.println("-----------------------------");
        System.out.println("       LOGICAL RESULT");
        System.out.println("-----------------------------");
        System.out.println("Logged In      : " + isLoggedIn);
        System.out.println("Verified       : " + isVerified);
        System.out.println("Admin          : " + isAdmin);
        System.out.println("Order Amount   : Rs. " + orderAmount);
        System.out.println("Minimum Order  : Rs. " + minimumOrder);
        System.out.println("Delivered      : " + isDelivered);
        System.out.println("Paid           : " + isPaid);
        System.out.println("Discount       : " + canGetDiscount);
        System.out.println("-----------------------------");
    }
}