package classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayPractice {
    public static void main(String[] args) {

        //Parastais masivs. dubulto, triskarso neskatisimies pagaidam

//      int[] dayOffTheWeek;  //izveidots/deklarets jauns masivs BEZ OBJEKTA
        int[] dayOffTheWeek = {1, 2, 3, 4, 5, 6, 7};   //masiva deklaresana AR OBJEKTA INICIALIZACIJU
        System.out.println(dayOffTheWeek.length);   //atgriez masiva izmeru. Length = 7
        System.out.println(dayOffTheWeek[6]);   // [0] = 1, [1] = 2, ....[6] = 7
        System.out.println(dayOffTheWeek[7-1]);

        String[] nameOfTheWeek = {"Monday", "Tuesday", " Wednesday", " Thrusday", "Friday", "Saturday", "Sunday"};
        System.out.println("Today is: " + nameOfTheWeek[0]);
        System.out.println(nameOfTheWeek.length);

        String[] fruits = new String[6];  //tiks glabatas 6 vertibas ---> masiva deklareesana AR OBJEKTA IZVEIDI
        fruits[0] = "apple";
        fruits[1] = "kiwi";
        fruits[2] = "banana";
        fruits[3] = "strawbery";
        fruits[4] = "cherry";
        fruits[5] = "pineapple";

        fruits[0] = "pear";
        System.out.println("Test");


        char[] myNameCharacters = {'M', 'A', 'D', 'A', 'R'};
        System.out.printf("%s %s %s\n", myNameCharacters[0], myNameCharacters[2], myNameCharacters[3]);


        Random random = new Random();
        System.out.println(random.nextInt(100));
        int[] randomNumbers = {random.nextInt(100), random.nextInt(100), random.nextInt(100)};
        System.out.println(Arrays.toString(randomNumbers));  //izprinte saraksta ciparus caur ciklu
        System.out.println();


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Madara");
        stringBuilder.append(" Fedosejeva");
        System.out.println(stringBuilder);

// Check velak
        List<String> listOfFruit = new ArrayList<>();  //List - pienem tikai String vertibas
//        listOfFruit.add(String.valueOf(1));  //"1"
        System.out.println("123");
        listOfFruit.add("apple");
        listOfFruit.add("kiwi");
        listOfFruit.add("cherry");

    }
}
