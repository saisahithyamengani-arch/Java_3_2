public class Shape {
    void displayArea() {
        System.out.println("Area:");
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void displayArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
class Rectangle extends Shape {
    double length, breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void displayArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}
class Main {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        c.displayArea();
        r.displayArea();
    }
}

