package classroom.polymorphism;

public class Car extends Vehicle {

    @Override                                                                           // anotacija. Ja to nonem nost, tapat parrakstis, bet ANOTACIJA - dod acimeredzamu skatu, ka parrakstis
    public void move() {
        System.out.println("You call move() method from: " + this.getClass().getName());
        System.out.println("Specific car sound: Vrum-vrum!");
    }

    @Override
    public void stop() {
        System.out.println("You call stop() method from: " + this.getClass().getName());
        System.out.println("Specific car sound: Stooooop!");
    }
}
