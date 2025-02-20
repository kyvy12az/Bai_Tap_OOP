package Bai3_2;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    // Constructor
    public MyPolynomial(double... coeffs) {
        this.coeffs = Arrays.copyOf(coeffs, coeffs.length);
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * luyThua(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double c1 = (i <= this.getDegree()) ? this.coeffs[i] : 0;
            double c2 = (i <= right.getDegree()) ? right.coeffs[i] : 0;
            newCoeffs[i] = c1 + c2;
        }
        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int newDegree = this.getDegree() + right.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (sb.length() > 0) sb.append(" + ");
                sb.append(coeffs[i]);
                if (i > 0) sb.append("x^").append(i);
            }
        }
        return sb.toString();
    }
    public double luyThua(double x, long i) {
    	if (i == 0) return 1;
    	else if (i % 2 == 0) return luyThua(x, i/2) * luyThua(x, i/2);
    	else return x * luyThua(x, i-1);
    }
}


