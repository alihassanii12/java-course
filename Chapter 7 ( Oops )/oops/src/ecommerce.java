import java.util.Scanner;

class Store {
    String name;
    String email;
    String phoneNumber;
    String product;
    String country;
    String city;
}

public class ecommerce {

    static void main() {

        Scanner sc = new Scanner(System.in);
        Store customer1 = new Store();

        System.out.print("Enter name: ");
        customer1.name = sc.nextLine();

        System.out.print("Enter email: ");
        customer1.email = sc.nextLine();

        System.out.print("Enter phone number: ");
        customer1.phoneNumber = sc.nextLine();

        System.out.print("Enter product: ");
        customer1.product = sc.nextLine();

        System.out.print("Enter country: ");
        customer1.country = sc.nextLine();

        System.out.print("Enter city: ");
        customer1.city = sc.nextLine();

        System.out.println();
        System.out.println("Customer Details");
        System.out.println("Name: " + customer1.name);
        System.out.println("Email: " + customer1.email);
        System.out.println("Phone: " + customer1.phoneNumber);
        System.out.println("Product: " + customer1.product);
        System.out.println("Country: " + customer1.country);
        System.out.println("City: " + customer1.city);

        sc.close();
    }
}