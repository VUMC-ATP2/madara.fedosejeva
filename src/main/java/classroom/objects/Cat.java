package classroom.objects;

import classroom.objects.Animal;

public class Cat extends Animal {
    @Override
    void voice() {
        System.out.println("Mjauuu");;
    }

    void eat() {
        System.out.println("Thank you for feeding");
    }
}
