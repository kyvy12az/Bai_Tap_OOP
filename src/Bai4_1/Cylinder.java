package Bai4_1;

public class Cylinder extends Circle {
    private double height = 1.0;

    // Constructors
    public Cylinder() {
        super();
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getter and Setter
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    // Calculate volume
    public double getVolume() {
        return getArea() * height; // Uses getArea() from Circle
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height=" + height + "]";
    }
}

