package Bai1_2;

public class Circle {
	private double radius;

	public Circle() {
		radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getCircumference() {
		return 2 * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle[radius=" + radius + "]";
	}
	public static void main(String[] args) {
		Circle c1 = new Circle(1.1);
		System.out.println(c1);
		Circle c2 = new Circle();
		System.out.println(c2);
		
		c1.setRadius(2.2);
		System.out.println(c1);
		System.out.println("radius is: " + c1.getRadius());
		System.out.println("area is: " + String.format("%.2f", c1.getArea()));
		System.out.println("circumference is: " + String.format("%.2f", c1.getCircumference()));
	}
}
