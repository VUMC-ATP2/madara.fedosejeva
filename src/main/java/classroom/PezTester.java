package classroom;

public class PezTester {
    public static void main(String[] args) {

        PezDispenser captainAmerika = new PezDispenser("Captain American");
        captainAmerika.eat();
        System.out.println(captainAmerika.currentCandyCount);
        captainAmerika.eat(7);
        captainAmerika.eat(13);
        captainAmerika.load();
        captainAmerika.eat(13);
    }
}
