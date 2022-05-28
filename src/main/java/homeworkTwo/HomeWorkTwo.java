package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
//1.uzdevums:
        int x = 6;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x > 5 && x <= 10);
        System.out.println(!(x <= 5) && x < 10);
        System.out.println(x == 0 || x == 10);
        System.out.println(x * x > 10);


// 2.uzdevums:
        Scanner monthNumber = new Scanner(System.in);
        System.out.println("Please enter number from 1-12: ");
        int month = monthNumber.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febrary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Wrong number. Please enter number from 1 till 12.");
        }


// 3.uzdevums:
        Scanner biggestNumber = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = biggestNumber.nextInt();
        System.out.println("Enter the second number: ");
        int b = biggestNumber.nextInt();
        System.out.println("Enter the third number: ");
        int c = biggestNumber.nextInt();

        if (a >= b && a >= c) {
            System.out.printf("The biggest number is %d\n", a);
        } else if (b >= a && b >= c) {
            System.out.printf("The biggest number is %d\n", b);
        } else {
            System.out.printf("The biggest number is %d\n", c);
        }


// 4.uzdevums:
        Scanner TrafficLightColor = new Scanner(System.in);
        String enteredColor;
        System.out.println("Enter traffic light color:");
        enteredColor = TrafficLightColor.nextLine();

        if (enteredColor.equals("Red") || enteredColor.equals("red")) {
            System.out.println("Please wait.");
        } else if (enteredColor.equals("Orange") || enteredColor.equals("orange")) {
            System.out.println("Wait and be ready to cross the street.");
        } else if (enteredColor.equals("Green") || enteredColor.equals("green")) {
            System.out.println("You can cross the street.");
        } else {
            System.out.println("If Traffic light is switched off, go to other place where cross the street.");
        }


//5.uzdevums:
        String name = "Peteris";
        String surname = "Klava";
        String phoneNumber = "+371 25449999";
        int dateOfBirth = 1981;
        printBusinessCard(name, surname, phoneNumber, dateOfBirth);

        String name2 = "Dace";
        String surname2 = "Pekse";
        String phoneNumber2 = "+371 25449799";
        int dateOfBirth2 = 1988;
        printBusinessCard(name2, surname2, phoneNumber2, dateOfBirth2);

        String name3 = "Vallija";
        String surname3 = "Pupola";
        String phoneNumber3 = "+371 211119799";
        int dateOfBirth3 = 1970;
        printBusinessCard(name3, surname3, phoneNumber3, dateOfBirth3);


// 6.uzdevums:
        printBusinessCardTwo("Janis", "Berzins", "+317 6098664", 1970);
        printBusinessCardTwo("Anna", "Priede", "+371 22222334", 1950);


// 7.uzdevums:
        int summa = sum(5, 10);
        System.out.println(summa);


//8.uzdevums:
        System.out.println(average(11, 3.3, 4.5559));

    }

    public static void printBusinessCard(String name, String surname, String phoneNumber, int dateOfBirth) {
        System.out.printf("Business Card\n#############\nName: %s\nSurname: %s\nPhone Number: %s\nDate of Birth: %d\n#############\n", name, surname, phoneNumber, dateOfBirth);
    }

    public static void printBusinessCardTwo(String name, String surname, String phoneNumber, int dateOfBirth) {
        System.out.printf("Business Card\n#############\nName: %s\nSurname: %s\nPhone Number: %s\nDate of Birth: %d\n#############\n", name, surname, phoneNumber, dateOfBirth);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

}
