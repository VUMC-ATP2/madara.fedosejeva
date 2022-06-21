package homework;

public class FirstClass {
    public static void main(String[] args) {
        String countryName = "Singapore";
        int population = 5638000;
        double areaInSquareKm = 722.5d;
        String capital = "Singapore";
        String officialLanguage = "English, Malay, Chinese (Mandarin) and Tamil";
        boolean isInEu = false;
        char currency = '$';

        System.out.println(countryName);
        System.out.println(population);
        System.out.println(areaInSquareKm);
        System.out.println(capital);
        System.out.println(officialLanguage);
        System.out.println(isInEu);
        System.out.println(currency);

        //println sentences
        System.out.println("The capital of "+countryName+" is "+capital);
        System.out.println("There are four official languages -"+" "+officialLanguage+" "+"in"+ " "+countryName);

        //printf sentences
        String mySentence = "This is short story.";
        String mySecondSentence = "Story about beautiful island:";
        System.out.printf("%s %s\n", mySentence + " " + mySecondSentence, countryName);
        System.out.printf("%s has area of %.2f square kilometres.\n", countryName, areaInSquareKm);
        System.out.printf("There are living %d people.\n", population);

        //aritmetic operators: + - * / %
        int a = 5;
        int b = 10;
        int c = 7;
        int d = a + b;

        System.out.println(a+c);
        System.out.println(b+c);
        System.out.printf("The sum of numbers %d and %d is: %d\n", a, b, d);

        System.out.println(d - a - b);
        System.out.println("b-c-a is: " + (b-c-a));
        System.out.println(c + " minus " + a + " is "+(c - a));

        System.out.println(a * b * c);
        System.out.printf("%d multiplied with %d is %d\n", a, b, (a*b));
        System.out.println("Number "+ b + " multiplied with " + d + " is a big number: " + (b * d));

        System.out.println(b / a);
        System.out.println(c / a);
        System.out.println(d / b);

        System.out.println(b % a);
        System.out.println(a % b);
        System.out.printf("When you divide %d with %d, then it is %d and residue is %d.\n", c, a, (c / a), (c % a));

    }
}
