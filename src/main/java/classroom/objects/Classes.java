package classroom.objects;

public class Classes {
    public static void main(String[] args) {

        // veidosu jaunu objektu "myHouse"
        House myHouse = new House(); // myHouse - jauns objekts, kas izveidots uz House klases bazes.
        myHouse.printInformation();

        System.out.println(myHouse.stories);
        myHouse.stories = 7;
        System.out.println(myHouse.stories);

        myHouse.houseNumber = 2;
        myHouse.propertyType = "yess";
        myHouse.printInformation();

        System.out.println("================");

        House summerHouse = new House();   // jauns objekts uz vecas klases pamata
        summerHouse.propertyType = "summerHouse";
        myHouse.stories = 1;
        summerHouse.printInformation();

        // Car
        // Car bmw = new Car();

        System.out.println("=======MY EXAMPLE=========");

// Jauns objekts - myEmployee:
        Employee myEmployee = new Employee();
        myEmployee.printEmployeeCard();

// Atseviski, bet sadi parasti nee:
        System.out.println(myEmployee.phoneNumber);

// Parrakstu:
        myEmployee.name = "Anna Kalnina";
        myEmployee.age = 55;
        myEmployee.printEmployeeCard();


        Car myCar = new Car();
        System.out.println(myCar); // izprinte numuru?
        myCar.horsePower = 99;
        myCar.motorSize = 2;
        myCar.year = 2010;
        myCar.printCarInfo();  // dabuju metodi caur "myCar" objektu
        System.out.println(myCar.fullPrice(20));  // cik maksas baka 20 l degvielas

        myHouse.isHouseOld();
        myHouse.year = 2022;
        myHouse.isHouseOld();


        Circle aplis = new Circle();
        aplis.circleArea(50);
        System.out.println(aplis.circleArea(60));


    }
}
