package homework;

import java.util.Random;
import java.util.Scanner;

public class ExtraLoopHomeWork {
    public static void main(String[] args) {
        // Extra: Uzrakstīt JAVA programmu, kas uzģenerē random skaitli no 0-50. Likt lietotājam minēt šo skaitli ievadot savu variantu kamēr skaitlis netiks uzminēts vai netiks sasniegtas 10 minējumu reizes.
//Ja lietotāja skaitlis nav pareizs, izvadīt informāciju vai ievadītais skaitlis bija zemāks / augstāks par uzģenerēto skaitli.
//Ja lietotājs atmin skaitli, izvadīt uz ekrāna, ka cilvēks atminēja skaitli, izvadīt pašu skaitli un minējumu skaitu.
//Ja skaitlis netiek uzminēts 10 reizēs, izvadīt uz ekrāna, ka lietotājs ir zaudējis.

        Random random = new Random();
// Generates random integers 0 to 49
        int x = random.nextInt(50);
        System.out.println("Secret number: " + x);  // for testing

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
                System.out.println("Correct! Secret number is " + x + " Guess times: " + (n + 1));
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
