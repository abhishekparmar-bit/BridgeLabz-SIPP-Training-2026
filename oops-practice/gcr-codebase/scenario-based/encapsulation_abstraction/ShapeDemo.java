abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private final double radius; // immutable
    Circle(double radius) { 
        this.radius = radius;
    }
    public double getRadius() {
         return radius; 
    }
    double area() { 
        return Math.PI * radius * radius; 
    }
    double perimeter() { 
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;
    Rectangle(double l, double w) { length = l; width = w; }
    double area() { return length * width; }
    double perimeter() { return 2 * (length + width); }
}

class Triangle extends Shape {
    private double a, b, c;
    Triangle(double a, double b, double c) { this.a=a; this.b=b; this.c=c; }
    double area() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    double perimeter() { return a+b+c; }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4,6),
            new Triangle(3,4,5)
        };
        for(Shape s: shapes)
            System.out.printf("%s -> Area: %.2f, Perimeter: %.2f%n",
                s.getClass().getSimpleName(), s.area(), s.perimeter());
    }
}
