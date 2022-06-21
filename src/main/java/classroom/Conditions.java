package classroom;

public class Conditions {
    public static void main(String[] args) {

        System.out.println("Before check");

        // Will execute 10 line if condition is true
        if (20 > 18) {
            System.out.println("Yes 20 is bigger as 18");
        }

        System.out.println("After check");

        // Piemers ar IF
        int age = 18;

        if (age >= 18) {
            System.out.println(" You can wote");
        }
        System.out.println("You can go home!");


        //IF-ELSE
        int currentHours = 19;
        if (currentHours < 18) {
            System.out.println(" Good day");
        } else {
            System.out.println("Good evening"); //ja=19, bus Good evening, ja x=10, tad Good day
        }


        int i = 20;
        if (i < 15) { //20 < 15 --> false --> "is is greater than 15
            System.out.println("i is smaller than 15");
        } else {
            System.out.println("is is greater than 15");
        }
        System.out.println("Outside if-else block");

        String vumc = "LU";
        if (vumc == "LU") {  //true --> izdrukas "VUMC is the same as LU
            System.out.println("VUMC is the same as LU");
        } else {
            System.out.println("VUMC ios not the same as LU");
        }


//         int - primitive type
//         Integer - non-primitive (klase)
//        char - Char
//        double - Double
//         float - Float
//        System.out.println("Integer MAX:" + Integer.MAX_VALUE);
//        System.out.println("Integer MIN:" + Integer.MIN_VALUE);

        //IF-ELSE-IF
        int number = 2;
        if (number > 0) {
            System.out.println("Number isa greater than 0");
        } else if (number == 0) {
            System.out.println("Numbver is equal to 0");
        } else {
            System.out.println("Number is less than 2 and not equal to 0");
        }


        //SWITCH -lai izveletos 1 no gadijumiem (case), ko izpildit
        String animal = "Cat";

        switch (animal) {  //ieliekam vertibu, kuru gribam apstradat
            case "Dog":
                System.out.println("You have a dog");
                break; //lai izietu no cikla, ja sakrit, un turpinatu CITU programmu.
            case "Cat":
                System.out.println("You have a cat");
                break;
            default:
                System.out.println("I do not know about animal you have"); //ja nav ne viens ne otrs
        }


        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println(" Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satuyrday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not correct day");
        }


        String month = "June";

        // var - data type - (cipars, teksts), to nenosakam mes
        //kops 8 Java funkcionala programmesana

        var result = switch (month) {
            case "December", "January", "February" -> "winter";
            case "June", "July", "August" -> "summer";
            default -> "Do not know";
        };
        System.out.printf("%s is %s", month, result);


    }
}
