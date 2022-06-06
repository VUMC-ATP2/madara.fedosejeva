package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

// 1.uzd: programmu, kas no lietotāja nolasa veselus skaitļus un apstājas, izvadot uz ekrānu tekstu:  “Gatavs”,
// kad šo vērtību summa pārsniedz 100.
        int input = 0;   // user's number
        int sum = 0;     // sum of numbers
        while (sum <= 100) {
            System.out.println("Please enter integer: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            sum = sum + input;
        }
        ;
        System.out.println("Ready. Entered numbers' sum > 100");


// 2.uzd: programmu, kas nolasa veselu skaitli un izvada uz ekrāna, vai šis skaitlis ir pirmskaitlis vai nē.
        System.out.println("Please enter your number: ");
        Scanner primeNumber = new Scanner(System.in);
        int input2 = primeNumber.nextInt();
        int divider = 2;
        if (input2 <= 1) {
            System.out.println("NOT prime number");
        } else {
            for (divider = 2; divider <= input2; divider++) {
                if (input2 % divider == 0) {
                    break;
                }
            }
            if (divider == input2) {
                System.out.println("PRIME number");
            } else {
                System.out.println("NOT prime number");
            }
        }


// 3.uzd: Definēt 3 masīvus ar datu tipiem: int, String, char un jāizvada uz ekrāna visas vērtības izmantojot: (a) while; (b) do while; (c)	for loop; (d)for each.
// int masīvs:
        int[] numArray = {1, 2, 3, 4, 5, 6};
// while:
        int number = 0;
        while (number < numArray.length) {
            System.out.println(numArray[number]);
            number++;
        }

// do while:
        number = 0;
        do {
            System.out.println(numArray[number]);
            number++;
        } while (number < numArray.length);

// for:
        for (number = 0; number < numArray.length; number++) {
            System.out.println(numArray[number]);
        }

// for each:
        for (int numberArray : numArray
        ) {
            System.out.println(numberArray);
        }

// String masīvs:
        String[] names = {"Cat", "Dog", "Snake", "Tiger", "Mouse"};
        // while:
        number = 0;
        while (number < names.length) {
            System.out.println(names[number]);
            number++;
        }

// do while:
        number = 0;
        do {
            System.out.println(names[number]);
            number++;
        } while (number < names.length);

// for:
        for (number = 0; number < names.length; number++) {
            System.out.println(names[number]);
        }

// for each:
        for (String animalName : names
        ) {
            System.out.println(animalName);
        }

// char masīvs:
        char[] partOfAlphabet = {'A', 'B', 'C', 'D', 'E', 'F'};
// while:
        number = 0;
        while (number < partOfAlphabet.length) {
            System.out.println(partOfAlphabet[number]);
            number++;
        }

// do while:
        number = 0;
        do {
            System.out.println(partOfAlphabet[number]);
            number++;
        } while (number < partOfAlphabet.length);

// for:
        for (number = 0; number < partOfAlphabet.length; number++) {
            System.out.println(partOfAlphabet[number]);
        }

// for each:
        for (char letter : partOfAlphabet
        ) {
            System.out.println(letter);
        }


// 4.uzd: 1.Definēt veselu skaitļu masīvu ar izmēru 100, un ar ciklu aizpildīt šo masīvu ar pāra skaitļiem. Visas vērtības, kas ir iekšā masīva,
// ir nepieciešams izvest uz ekrāna vienā līnijā
        int[] numArrayEven = new int[100];  //tiek izveidots tukss masivs, kuram ieksa var ielikt 100 vietas cipariem

        int m = 0;
        for (m = 0; m < numArrayEven.length; m++) {
            numArrayEven[m] = 2 * (m + 1);
        }

        for (int num : numArrayEven
        ) {
            System.out.print(num + ", ");
        }


// OK. 5.uzd: Uzrakstiet Java programmu, lai aprēķinātu dotā skaitļa faktoriālo vērtību.
        int userNumberForFactorial;
        int factorial = 1;  // kur glabasu faktoriala rezultatu
        System.out.println("\nEnter your number: ");
        Scanner scannerFactorial = new Scanner(System.in);
        userNumberForFactorial = scannerFactorial.nextInt();
        for (int i = 1; i <= userNumberForFactorial; i++) {
            factorial = factorial * i;
        }
        System.out.println("Your number " + userNumberForFactorial + " factorial is " + factorial);


// OK. 6.uzd: Izstrāt kodu tā, lai lietotājam būtu tikai 3 mēģinājumi uzminēt pareizo konta PIN kodu. Jāizveido int konstanti,
// kur tiks saglabāts PIN (public final int  VARIABLE_NAME). Ja parole ir ievadīta pareizi, jāizvada uz ekrāna: “PIN ir pieņemts, laipni lūdzam atpakaļ”.
// Ja parole nav pareiza, jāizvada uz ekrāna:“Nepareizs PIN, mēģiniet vēlreiz.”. Kad mēģinājumi beigušies, uz ekrāna jāizvada:  “Atvainojiet, bet jūs esat bloķēts”.
        int i = 0; // meginajumu skaits
        int correctPinCode = 1234;
        int enteredPinCode;
        while (i < 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter PIN code: ");
            enteredPinCode = scanner.nextInt();
            i++;
            if (enteredPinCode == correctPinCode) {
                System.out.println("PIN code is correct, welcome back.");
                break;
            } else {
                if (i == 3) {
                    System.out.println("Incorrect PIN code. Unfortunately you are blocked.");
                } else {
                    System.out.println("Incorrect PIN code, try one more time.");
                }
            }
        }


// Extra: Uzrakstīt JAVA programmu, kas uzģenerē random skaitli no 0-50. Likt lietotājam minēt šo skaitli ievadot savu variantu kamēr skaitlis netiks uzminēts vai netiks sasniegtas 10 minējumu reizes.
//Ja lietotāja skaitlis nav pareizs, izvadīt informāciju vai ievadītais skaitlis bija zemāks / augstāks par uzģenerēto skaitli.
//Ja lietotājs atmin skaitli, izvadīt uz ekrāna, ka cilvēks atminēja skaitli, izvadīt pašu skaitli un minējumu skaitu.
//Ja skaitlis netiek uzminēts 10 reizēs, izvadīt uz ekrāna, ka lietotājs ir zaudējis.

        Random random = new Random();
// Generates random integers 0 to 49
        int x = random.nextInt(50);
//        System.out.println("Secret number: " + x);  // for testing

        int y = 0; // user entered number
        int n = 0; // guess times

        for (n = 0; n <= 10; n++) {
            if (n == 10) {
                System.out.println("You have lost");
                break;
            } else {
                System.out.println("Please enter number: ");
                Scanner secretNumber = new Scanner(System.in);
                y = secretNumber.nextInt();
            }
            if (y == x) {
                System.out.println("Correct! Secret number is " + x + " Guess times: " + (i + 1));
                break;
            } else {
                if (y > x) {
                    System.out.println("Your number is bigger as Secret number");
                } else {
                    System.out.println("Your number is smaller as Secret number");
                }
            }
        }

    }
}










