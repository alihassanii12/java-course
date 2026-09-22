class Employee {
    String name;
    String email;
    String phoneNumber;
    String course;
    String city;
}

public class objects {
    static void main() {

        Employee employee1 = new Employee();

        employee1.name = "Ali";
        employee1.email = "ali@gmail.com";
        employee1.phoneNumber = "03001234567";
        employee1.course = "Java";
        employee1.city = "Lahore";

        IO.println("Name: " + employee1.name);
        IO.println("Email: " + employee1.email);
        IO.println("Phone: " + employee1.phoneNumber);
        IO.println("Course: " + employee1.course);
        IO.println("City: " + employee1.city);
    }
}