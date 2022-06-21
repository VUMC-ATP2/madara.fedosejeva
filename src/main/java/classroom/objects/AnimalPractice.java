package classroom.objects;

public class AnimalPractice {
    public static void main(String[] args) {

        Animal justRegularAnimal = new Animal();
        justRegularAnimal.name = "Unkonw animal";
        justRegularAnimal.voice();

        Dog rex = new Dog();
        rex.canProtectHouse = true;
        rex.voice();  // izpirnte "hello", man japraksta. kad parraksta, tad wuf-wuf


        Cat minka = new Cat();
        minka.voice();
        minka.eat();

// kad veido jaunu OBJEKTU, var obligati neizmantot visus fieldus


    }
}
