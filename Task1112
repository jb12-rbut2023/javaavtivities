// Step 1: Define the interface Shape
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Step 2: Create an abstract class AbstractShape implementing the Shape interface
abstract class AbstractShape implements Shape {
    // Common attributes
    String color;
    double length;
    double width;

    // Constructor
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // Implementations for calculateArea and calculatePerimeter methods
    public double calculateArea() {
        return 0.0; // To be overridden by subclasses
    }

    public double calculatePerimeter() {
        return 0.0; // To be overridden by subclasses
    }
}

// Step 3: Implement two concrete classes Circle and Rectangle
class Circle extends AbstractShape {
    double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color, 0, 0); // 0 for length and width as they are not relevant for a circle
        this.radius = radius;
    }

    // Implementations for calculateArea and calculatePerimeter methods
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape {
    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    // Implementations for calculateArea and calculatePerimeter methods
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Step 4: In the Main class, create instances of Circle and Rectangle and display their areas and perimeters
public class Task1112 {
    public static void main(String[] args) {
        // Create instances
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Display their areas and perimeters
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
