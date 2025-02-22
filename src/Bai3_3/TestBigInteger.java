package Bai3_3;
import java.math.BigInteger;

public class TestBigInteger {
	public static void main(String[] args) {
		BigInteger i1 = new BigInteger(12345);
		BigInteger i2 = new BigInteger(1233333);
		System.out.println(i1.add(i2));
		
	}
    public static void main(String[] args) {
        // Khai báo hai số BigInteger
        BigInteger i1 = new BigInteger("111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("222222222222222222222222222222222222222222222222222222223");

        System.out.println("Sum: " + i1.add(i2));

        System.out.println("Product: " + i1.multiply(i2));
        
        System.out.println(i2.subtract(i1));
        
        System.out.println(i2.divide(i1));
    }
}
