package classroom;

public class PezDispenser {

    String name;
    int capacity;
    int currentCandyCount;


// konstruktors - var izveidot jaunu objektu tikai iedodo name, kas tiek inicilizets klases limeni (this.name = name):
    public PezDispenser(String name) {  // klases konstruktors, kura tiek inicializeti fields: name, capacity, currentCandyCount
        this.name = name;
        capacity = 20;  // sis vertibas tiek inicializetas klases limeni
        currentCandyCount = 20;  // sis vertibas tiek inicializetas klases limeni
    }


// metode, kad aped 1 konfekti:
    public void eat() {
        if (currentCandyCount <= 0) {
            System.out.println("I can't ar, please load me!");
        } else {
            currentCandyCount--;
            System.out.println("I ate 1 pez");
        }
    }


// metode, kad ed daudzumu, kas tiek ievadits:
    public void eat(int candyCount) {
        if (currentCandyCount <= 0) {
            System.out.println("Please load me");
        } else if (currentCandyCount <= candyCount) {
            System.out.println("Not enough candies to eat as I wish. There are only left " + currentCandyCount);
        } else {
            currentCandyCount = currentCandyCount - candyCount;
            System.out.printf("I ate %d pezs. And there are only left: %d\n", candyCount, currentCandyCount);
        }
    }


// metode, lai uzpilditu tukso trauku:
    public void load() {
        currentCandyCount = capacity;
        System.out.println("I am loaded");
    }


}
