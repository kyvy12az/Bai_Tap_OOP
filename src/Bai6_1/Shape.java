package Bai6_1;

public abstract class Shape {
    protected String color;
   protected boolean filled;
    public Shape(String color ,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public Shape(){

    }
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
