package classroom;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        System.out.println("Enter please your username"); // izdruka lietotajam instrukciju, kas jadara
        username = scanner.nextLine(); // ļauj ievadit lietotajam vardu "scanner.nextLine()", ko glabas mainigaja "username"
        System.out.println("Username is:" + username);
    }
}
