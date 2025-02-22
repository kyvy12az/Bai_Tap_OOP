package Bai6_2;

public class Main {
	public static void main(String[] args) {
        Circle c1 = new Circle(6);
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        Rectangle r1 = new Rectangle(4,5);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.toString());
    }

}
