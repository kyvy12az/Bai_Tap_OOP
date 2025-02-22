package Bai6_3;

public class Main {
	public static void main(String[] args) {
		MovablePoint mp = new MovablePoint(10, 5, 10, 4);
		System.out.println(mp);
		mp.moveUp();
		System.out.println(mp);
		mp.moveleft();
		System.out.println(mp);
		mp.moveright();
		System.out.println(mp);
		mp.movedown();
		System.out.println(mp);
	}
}
