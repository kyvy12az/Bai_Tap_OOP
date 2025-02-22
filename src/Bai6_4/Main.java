package Bai6_4;

public class Main {
	public static void main(String[] args) {
        MovablePoint point = new MovablePoint(5, 5, 2, 2);
        System.out.println(point);
        point.moveUp();
        point.moveRight();
        System.out.println("After moving: " + point);

        MovableCircle circle = new MovableCircle(3, 3, 1, 1, 10);
        System.out.println(circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("After moving: " + circle);
    }
}
