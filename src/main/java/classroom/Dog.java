package classroom;

public class Dog extends Animal {  //Dog  - subclass, Animal - parent class

    boolean canProtectHouse = true; // ipasiba, kas piemit tikai sunim

    @Override
    void voice() {
        System.out.println("Wuf wuf");  // suns savadak runa, neka citi. voice metode tiek parrakstia "Generate --> Override
    }
}
