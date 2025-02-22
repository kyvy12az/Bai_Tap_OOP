package Bai4_5;

public class Square extends Rectangle {
    // Constructors
    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getters and Setters
    public double getSide() { return getWidth(); }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override toString()
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

