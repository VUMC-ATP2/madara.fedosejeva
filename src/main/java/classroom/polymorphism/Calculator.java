package classroom.polymorphism;

public class Calculator {

    // method overloading -
    // statiskais polimorfisms - objektam var veidot metodi ar vienu un to pasu nosaukumu, bet parametri var but citi
    public int add(int x, int y) { //add metode, kur liek ieska 2 skaitlus, kas pec tam tiek sasumeti
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }
}
