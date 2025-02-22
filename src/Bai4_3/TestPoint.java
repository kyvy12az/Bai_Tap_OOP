package Bai4_3;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(3.5f, 4.5f);
        System.out.println(p2); // (3.5, 4.5)

        Point3D p3 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println(p3); // (1.0, 2.0, 3.0)

        p3.setXYZ(7.0f, 8.0f, 9.0f);
        System.out.println(p3); // (7.0, 8.0, 9.0)

        float[] coords2D = p2.getXY();
        System.out.println("Point2D Coordinates: (" + coords2D[0] + ", " + coords2D[1] + ")");

        float[] coords3D = p3.getXYZ();
        System.out.println("Point3D Coordinates: (" + coords3D[0] + ", " + coords3D[1] + ", " + coords3D[2] + ")");
    }
}


