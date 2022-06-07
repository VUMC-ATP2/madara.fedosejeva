package classroom;

public class Employee { // KLASE

    String name = "Janis Berzins";
    int age = 33;
    String education = "higher";
    int phoneNumber = 25642356;
    String address = "Brivibas 200-5";

    public void printEmployeeCard() { // Klases metode
        System.out.println("Employee name is " + name);
        System.out.println("Employee age is " + age);
        System.out.println("Education level: " + education);
    }

}
