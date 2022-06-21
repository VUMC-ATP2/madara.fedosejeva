package homework.classHomework;

public class Triangle {
    int a;
    int b;
    int c;
    double s;

    // no-arg.konstruktors:
    public Triangle() {
        System.out.println("New triangle has been created!");
    }

    // arg.konstruktors:
    public Triangle(int a, int b, int c) {
        double p;
        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        this.s = s;
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Area of this triangle is " + s);
    }

    // metode: vienādmalu trīsstūris
    public boolean isEquilateralTriangle() {
        boolean isEquilateral;
        if (a == b && b == c) {
            isEquilateral = true;
            System.out.println("This is Equilateral Triangle");
        } else {
            isEquilateral = false;
            System.out.println("This is NOT Equilateral Triangle");
        }
        return isEquilateral;
    }

    // vienādsānu trīsstūris
    public boolean isIsoscelesTriangle() {
        boolean isIsosceles;
        if (a == b || b == c || c == a) {
            isIsosceles = true;
            System.out.println("This is Isosceles Triangle");
        } else {
            isIsosceles = false;
            System.out.println("This is NOT Isosceles Triangle");
        }
        return isIsosceles;
    }
}
