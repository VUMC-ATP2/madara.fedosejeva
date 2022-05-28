package classroom;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

// metodes palidz uztaisit to pasu kodu, tikai ISAKU!!!!

public class Methods2 {
    public static void main(String[] args) { //NEVAR veidot jaunas metodes ieksa "main" metode. Jataisa PEC "main" metodes
// PIRMAIS veids, kaa izsaukt metodi ISAKS: izsauc metodi + IEDOD ARGUMENTUS:
        printMyNameAndAge("Madara", 36); //"main" metodee tiek IZSAUKTA mana METODE "printMyNameAndAge" 3x, "Madara", 36 - ARGUMENTS
        printMyNameAndAge("Madara2", 37); //InteliJea raksta "surname", "age" pats, kad >=2 argumenti)

// OTRAIS veids, ka izsaukt metodi garaks:
        String name = "Peteris";
        int age = 50;
        printMyNameAndAge(name, age); //tiek izsaukta metode!!!

        String name2 = "Uldis";
        int age2 = 17;
        printMyNameAndAge(name2, age2); //tiek izsaukta metode!!!


// Pirma metode "printMyNameAndAge" tas pats, kas, tikai jataisa daudzi mainigie "name", "name2", "name3":
//        String name = "Madara";
//        System.out.printf("Your name is %s\n", name);
//        String name2 = "Madara2";
//        System.out.printf("Your name is %s\n", name);
//        String name3 = "Madara3";
//        System.out.printf("Your name is %s\n", name);


// Summas aprekini bez metodes - garaki, neka ar metodi:
//        int a = 10;
//        int b = 20;
//        System.out.println(a + b);
//        a = 30;
//        b = 40;
//        System.out.println(a + b);
// Summas aprekini ar metodi:
        sumOfTwoNumbers(10, 20);
        sumOfTwoNumbers(30, 40);


// sumOfTwoNumbers(10, 20); // nekas netiek izdrukats, tiek izsaukta tikai metode

// (1) veids kaa izsaukt metodi:
        System.out.println(sumOfTwoNumbers(20, 30)); //tiek izsaukts metode "println" vel viena metode "sumOfTwoNumbers"

// (2) veids kaa izsaukt metodi ar jaunu mainigo "c", kas tiek aprekinats pec metodes "sumOfTwoNumbers":
        int c = sumOfTwoNumbers(50, 100);
        System.out.println(c);

//        String text = printMyNameAndAge("Daina", 39);
//        System.out.println(text); //nevar izdrukat,jo VOID NEKO NEATGRIEZ

        checkAge(25);
        checkAge(17);

        System.out.println(isAdult(16));
        System.out.println(isAdult2(15));;
    }



// Seit JAUNU metodi!!!!!!!!!!!!!!!!
    public static void printMyNameAndAge(String name, int age) {
        System.out.printf("Your name is %s. Your age is %d\n", name, age);
//metode "printMyName", kura NEKO neatgriez (void), static-lai varetu izsaukt metodi, name, int - PARAMETRS
    }

// metode, kas saskaitis kaut ko (kalkulators), ATGRIEZ skaitli (int) -rezultats tiks atgriezts int datu tipa formata
    public static int sumOfTwoNumbers(int x, int y) {
        return x + y;          //vienmer metodes pedeja rinda bus ar RETURN
    }

//    public static int sumOfTwoNumbers(int x, int y) {
////        int summa = x + y;
////        return summa;
//    }

// void - neko neatgriez, vienkarsi izprinte rezultatu!!!!!!!!
// Metode, kas parbauda, ja gadi < 18 nevar nopirkt alko
    public static void checkAge(int age) {
        if(age < 0) {
            System.out.println("Vai esi piedzimis?");
        } else if (age >=14 && age <= 16) {
            System.out.println("Driz varesi alko nopirkt");
        } else if (age == 17) {
            System.out.println("Barda laikam aug");
        } else if (age >= 18) {
            System.out.println("Skrien uz veikalu");
        }
    }

    public static boolean isAdult(int age) {  //seit ir metode, kas kaut ko parbauda & ATGRIEZ!!! jo datu tips BOOLEAN
        boolean isAdult = true;
        if (age > 18 && age < 40) {
            isAdult = true;
        } else if (age < 18) {
            isAdult = false;
        }
        return isAdult;
    }

    public static boolean isAdult2(int age) {
        boolean isGrown = false;
        if (age > 18) {
            isGrown = true;
        }
            return isGrown;
        }

}



