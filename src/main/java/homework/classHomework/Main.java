package homework.classHomework;

public class Main {
    public static void main(String[] args) {

// Jauns objekts "triangle" ar no-arg konstruktoru:
        Triangle triangle = new Triangle();
        triangle.a = 5;
        triangle.b = 6;
        triangle.c = 7;
        triangle.isEquilateralTriangle();
        triangle.isIsoscelesTriangle();

// Jauns objekts "triangle1" ar arg.konstruktoru:
        Triangle triangle1 = new Triangle(5, 4, 5);
        triangle1.isEquilateralTriangle();
        triangle1.isIsoscelesTriangle();
    }
}
