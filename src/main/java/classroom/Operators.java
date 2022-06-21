package classroom;

public class Operators {
    public static void main(String[] args) {
        // Equal to ==
        int a = 10;
        int b = 5;
        System.out.println(a == b); // false

        // Not equal to !=
        int c = 5;
        int d = 4;
        System.out.println(c != d); // true

        a = 10;  // parakstis a un parakstis b, jo zemak koda linija
        b = 20;

        a = 10;
        double e = 10.00;
        System.out.println(a == e);

        double k = 10.00d; //var gan rakstit, gan nerakstit d. bet obligati 2 nulles jarakasta

        // Less than
        a = 30;
        b = 20;
        System.out.println(a < b); // false

        // Greater than
        c = 40;
        d = 50;
        System.out.println(c > d);  // false

        boolean result = 40 < 20;
        System.out.println(result);  // false

        // Less than or equal to <=
        a = 100;
        b = 100;
        System.out.println(a <= b); // true

        // Greater than or equal to
        a = 200;
        b = 100;
        System.out.println(b >= a);  //false

        // String comparison
        String name = "Madara";
        String name2 = "Madara";
        System.out.println( name == name2); //true
        System.out.println(name.equals(name2));  //true
//        name.//redzamas kadas metodes nak kopa
//        System.out.println(name.equals(name2)); //sadi labak salidzinat ar so metodi
//        System.out.println(name == new String(original: "Madara"));  //false, jo tika izveidots objekts

        // Logical operators
        // && - UN --. lai ABI nosacijumi zipildas pareizi
        int x = 10;
        result = x < 5 && x < 10;
        // 10 < 5 (false)
        //10 < 10 (false)
        System.out.println(result);  //false

        result = 3 < 5 && 4 < 5;
        System.out.println(result);  // true

        result = 6 < 5 && 4 < 5;
        System.out.println(result);  // false

        // VAI ||  --> lai vismaz 1 nosacijums izpildas pareizi
        result = 3 < 5 || 4 > 5;
        System.out.println(result);  //true

        // NE !
        a = 10;
        b = 20;
        result = ! (a > b);
        System.out.println(result);  // true
        result = !(a < b);
        System.out.println(result); // false

        // IF - THEN







    }
}
