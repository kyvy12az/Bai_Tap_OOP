package Bai4_4;

public class TestMovablePoint {
    public static void main(String[] args) {
        Point p1 = new Point(3.5f, 4.5f);
        System.out.println(p1); // (3.5, 4.5)

        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println(mp1); // (1.0, 2.0), speed=(0.5, 0.5)

        mp1.move();
        System.out.println(mp1); // (1.5, 2.5), speed=(0.5, 0.5)

        mp1.setSpeed(1.0f, 1.0f);
        mp1.move();
        System.out.println(mp1); // (2.5, 3.5), speed=(1.0, 1.0)
    }
}

