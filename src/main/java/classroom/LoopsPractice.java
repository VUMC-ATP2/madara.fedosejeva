package classroom;

import java.util.Arrays;

public class LoopsPractice {
    public static void main(String[] args) {
        // izrpitent ciparus 0-4

//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);  //aizies muzigaja cikla
//        }

//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i = i + 1;  //(tas pats, kas i++)  // 0+1
////            i++;  // 0 + 1
//        }


//        i = 10;
//        while (i >= 1) {
//            System.out.println(i);
//            i = i - 1; //i--
//        }


//        // Print out array values using while:
//        int[] arr = {2, 11, 45, 9};
//        int number = 0;
//        while (number < arr.length) {      // (number < 4)
//            System.out.println(arr[number]);   //pirmo reizi arr[0] = 2, arr[1] = 11
//            number = number + 1;  // 0+1, 1+1
//        }


        // Print out even numbers from 0 to 10. Check i %2 ==0; with WHILE:
//        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};   //while (i % 2 ==0 %% i<=10)
//        int number = 0;
//        while (number < arr.length) {
//            System.out.println(arr[number]);
//            number = number + 2;
//        }

//        int number = 0;
//        System.out.println("While START");
//        while (number <= 10) {
//            if (number % 2 == 0) {
//                System.out.println(number);
//            }
//            number++;
//        }
//        System.out.println("While END");


        // DO WHILE - kad nepieciesams izpildit ciklu vismaz 1x un ciklu izpildes skaits NAV zinams
        // 18 to 65
//        int age = 18;
//        do {
//            System.out.print(age + ", ");
//            age++;
//        } while (age <= 65);


        //Print out even numbers from 0 -10 with DO WHILE
//        System.out.println("Do while beginning");
//        int number = 0;
//        do {
//            if (number % 2 == 0) {
//                System.out.println(number);
//            }
//            number++;
//        } while (number <= 10);
//        System.out.println("Do while end");


        // Cikls FOR:
        for (int x = 1; x <= 10; x++) {  //x=1 - skaititajs, sakas no 1=sakuma skaitlis; x<=10 nosacijums, x++ - ka palielina
            System.out.print(x + ", ");
        }
        System.out.println("");


// Print in one line numbers from 22 to 0 ar FOR. Tad, ja para skaitlis
        for (int y = 20; y >= 0; y--) {
            if (y % 2 == 0) {
                System.out.print(y + ", ");
            }
        }
        System.out.println("");


        // for - Print visas vertibas no masiva String
//        String[] countries = new String[] {"Latvia", "Canada", "USA", "Estonia"};
//        for (int j = 0; j < countries.length; j++) {  //n tiek izveidots JAUNS SKAITITAJS "j=0" j INICIALIZACIJA
//            System.out.println(countries[j]);
//        }

//        String[] countries = new String[] {"Latvia", "Canada", "USA", "Estonia"};
////        for (int counter = 0; counter < countries.length; counter++) {
////        System.out.println(countries[counter]);
////        }
//
//
//        for (int counter = countries.length-1; counter >=0; counter--) {
//            System.out.print(countries[counter] + ", ");
//        }


        // FOR EACH - JA ZINAM, ka gribam VISUS ELEMENTUS
//        String[] countries = new String[]{"Latvia", "Canada", "USA", "Estonia"};
//        for (String country : countries) {    //nem masivu "countries", pirmo elmentu, saglaba mainigaja " country" un sagalba
//            //un izdruka. un iet cauri VISIEM LEMENTIEM, katru saglabajot mainigaja
//            System.out.println(country);
//        }


        // create int[] array with numbers from 0 to 100. Print numbers, that are > 50
        int[] numArray = new int[101];  //tiek izveidots tuks masivs, kuram ieksa var ielikt 100 vietas cipariem
        for (int y = 0; y < numArray.length; y++) {  //cikls, lai tuksas ailites aizpilditu
            numArray[y] = y;
        }

//        System.out.println(Arrays.toString(numArray)); //lai parbauditu, ka masivs ir piepildits

//        for (int j = 0; j < numArray.length; j++) {
//            int j = numArray[j];
//            if (j >= 50) {
//                System.out.print(i + ", ");
//            }
//        }


        // BREAK, CONTINUE. Vai ir USA. Kad to atrod, pabeidz ciklu
        System.out.println("---------------------------");
        String[] countries = new String[]{"Latvia", "Canada", "USA", "Estonia"};
        for (int j = 0; j < countries.length; j++) {
            System.out.println(countries[j]);
            if (countries[j].equals("USA")) {
                System.out.println("I found USA. breaking the loop");
                break;
            }
        }
        System.out.println("---------------------------");


        // ConTINUE - praktiskais pielietojums sim vel nav redzets
        // For loop 1 - 10; If value of i is between 4 and 9, continue
        for (int i = 1; i <= 10; i++) {
            if (i > 4 && i < 9) {
                continue;
            }
            System.out.println(i);
        }


    }
}
