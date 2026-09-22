import java.util.Scanner;

class onlineStore {
    String name;
    String email;
    String phoneNumber;
    String product;
    String country;
    String city;

    // Constructor
    onlineStore(String name, String email, String phoneNumber,
          String product, String country, String city) {

        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.product = product;
        this.country = country;
        this.city = city;
    }
}

public class constructor {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();

        System.out.print("Enter product: ");
        String product = sc.nextLine();

        System.out.print("Enter country: ");
        String country = sc.nextLine();

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        // Create object using constructor
        onlineStore customer1 = new onlineStore(
                name,
                email,
                phoneNumber,
                product,
                country,
                city
        );

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
