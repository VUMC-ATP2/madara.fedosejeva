package classroom;

public class Methods {
    public static void main(String[] args) {  //galvena metode, kas jaatsaj
        printMyNameAndAge("Madara", 27);  //tiek izsaukta metode,madara, age - ARGUMENTI

        System.out.println(sumOfTwoNumbers(10, 30));

        checkAge(17);
        checkAge(25);
    }

    //metode Nr.1
    public static void printMyNameAndAge(String name, int age) { //si metode neko neatriez, jo void; name, age - PARAMETRI
        System.out.printf("Your name is %s. And your age is:%d\n", name);
    }



    public static int sumOfTwoNumbers(int x, int y) {
        return x + y;  //metodes pedeja rinda vienmmer ar ŗeturn"
    }


    public static void checkAge(int age) {
        if (age < 0) {
            System.out.println("Vai Tu esi piedzimis");
        } else if (age >=14 && age <= 16) {
            System.out.println("Vel mazs esi");
        } else if (age ==17) {
            System.out.println("Jau barda");
        } else if (age >= 18) {
            System.out.println("Var iet uz veikalu");
        }

    }

}
