package classroom.polymorphism;

public class Example {

    public static void main(String[] args) {

// statiskais polimorfisms - objektam var veidot metodi ar vienu un to pasu nosaukumu, bet parametri var but citi:
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 5));
        System.out.println(calculator.add(4, 7, 10));


        Vehicle vehicle = new Vehicle();
        vehicle.move();
        vehicle.stop();

// seit ari strada polimorfisms:
        Car car = new Car();
        car.move();
        car.stop();

// dinamiskais polimorfisms, kad izveidot jaunu objektu ar dazadiem (vehicle, car) nosaukumiem - "Vehicle polymorfismCar = new Car()":
        Vehicle polymorphCar = new Car();                   // Tiek panemta "Vehicle" klase, pasaka, ka objekts "polymorphCar" un izveido JAUNU CAR OBJEKTU (new Car())
        polymorphCar.move();                                // metode "move" aizved uz Vehicle klasi. Bet taa kaa masinai ir daudz formas, tad reali "move" TIEK IZSAUKTS no CAR klases.
        }
    }
