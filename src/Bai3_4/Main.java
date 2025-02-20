package Bai3_4;

public class Main {
	public static void main(String[] args) {
		MyTime time = new MyTime(14, 1, 59);
		System.out.println(time);
		System.out.println(time.nextSecond());
		time.setHour(9);
		System.out.println(time.nextMinute());
	}
}
