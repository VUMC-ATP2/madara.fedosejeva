package classroom;

public class MyFirstJavaCode {
    public static void main(String[] args) {

        //One line comment

        /*
        Multi-line comment
        Is good - parasti izmanto so, lai parsktitu, kaa sytrada metode
         */

        //byte data type
        byte floorCount = 7;
        //System.out.println(floorCount);
        System.out.println("My house has " + floorCount + " floors");
        //     System.out.printf("My house has %d floors", floorCount); --bez atstarpes
        System.out.printf("My house has %d floors\n", floorCount);
        //%d - numbers
        //%s - text/string
        //%b - boolean

        short salaryInEuro = 1000;
        System.out.println(salaryInEuro);
        System.out.println(1200);

        System.out.printf("Average sallary for Junior QA Engineer is: %d\n", salaryInEuro);

        int chinaPopulation = 144899;
        long currentWorldPopulation = 190223333;
        System.out.printf("Current world population: %d. In meanwhile China population: %d people\n", currentWorldPopulation, chinaPopulation);

        //Floating numbers
        float myCurrentWight = 70.6f;
        System.out.println(myCurrentWight);

        double gasPriceEuro = 1.83333d;
        System.out.println(gasPriceEuro);

        //Primitive text (char)
        char firstLettersOfMyName = 'N';

        //Non-primitive String
        String myName = "Madara";
        System.out.println(myName);

        String mySentence = "Hello. My name is....";
        String mySecondSentence = " I live in Riga";
        System.out.println(mySentence);
        System.out.println(mySentence + mySecondSentence);
        System.out.printf("%s %s\n", mySentence, mySecondSentence);
        System.out.println(mySentence + " " + mySecondSentence);

        //konkatinacija - rindkopu savienosana

        double residentCount = 13d;
        System.out.printf("There are %.1f people in my house.\n", residentCount);

        // boolean - noteikumi, pec kuriem rakstit
        // is / has
        //isSummer, hasItems
        boolean isSummer = false;
        boolean isSpring = true;
        System.out.println(isSpring);
        System.out.println(isSummer);

//        if(isSummer) {
//            System.out.println("Yes, it is summer");
//        } else {
//            System.out.println("No, it is not sumer");
//        }

        //Aritmetic oeprator
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        int x = b + 15;
        System.out.println(x);

        System.out.println(7 + 7); //14
        System.out.println("7" + 7);  //77
        System.out.println("7" + "7"); //77

        boolean isAGreaterThanB = a > b; //10 > 20 --> izdrukas FALSE
        boolean isASmallerThanB = a < b;

        boolean isTrue = a !=b;
        System.out.println(isTrue);






    }
}
