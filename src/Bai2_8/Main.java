package Bai2_8;

public class Main {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(3, 4, 5);
        MyCircle c2 = new MyCircle(new MyPoint(7, 1), 3);

        System.out.println("Circle 1: " + c1);
        System.out.println("Circle 2: " + c2);

        System.out.println("Circle 1 Radius: " + c1.getRadius());
        System.out.println("Circle 1 Center: " + c1.getCenter());

        System.out.println("Circle 1 Area: " + c1.getArea());
        System.out.println("Circle 1 Circumference: " + c1.getCircumference());

        System.out.println("Distance between Circle 1 and Circle 2: " + c1.distance(c2));

        c1.setCenterXY(10, 10);
        c1.setRadius(7);
        System.out.println("Updated Circle 1: " + c1);
    }
}
