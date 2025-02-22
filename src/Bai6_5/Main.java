package Bai6_5;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(6.5);
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());
		ResizableCircle rc = new ResizableCircle(100);
		rc.resize(40);
		System.out.println(rc);
	}
}
