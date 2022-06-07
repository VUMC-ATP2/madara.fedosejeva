package classroom;

public class Car {

    String mark;
    int year;
    int motorSize;
    int horsePower;
    double marketValue;
    double consumption;
    int tank = 50;

    public void printCarInfo() {
        System.out.println(mark);
        System.out.println(motorSize);
    }

    public int fullPrice(int fuelCount) {
        return fuelCount * 2;  // 2 euro litra
    }

}
