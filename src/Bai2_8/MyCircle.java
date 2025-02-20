package Bai2_8;

public class MyCircle {
    private MyPoint center;
    private int radius;

    // Constructor mặc định: (0,0) với bán kính 1
    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    // Constructor với tọa độ x, y và bán kính
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    // Constructor với MyPoint làm tâm và bán kính
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // Getter & Setter cho bán kính
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Getter & Setter cho tâm hình tròn
    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    // Getter & Setter cho tọa độ X của tâm
    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    // Getter & Setter cho tọa độ Y của tâm
    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    // Getter & Setter cho mảng tọa độ tâm
    public int[] getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    // Phương thức tính diện tích hình tròn
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức tính chu vi hình tròn
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Tính khoảng cách giữa tâm hình tròn hiện tại và một hình tròn khác
    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }

    // toString() sử dụng MyPoint's toString()
    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ", center=" + center + "]";
    }
}


