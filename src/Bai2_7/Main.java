package Bai2_7;

public class Main {
    public static void main(String[] args) {

            MyLine line1 = new MyLine(1, 2, 4, 6);
            System.out.println(line1);

            System.out.println("Begin: " + line1.getBegin());
            System.out.println("End: " + line1.getEnd());

            System.out.println("Length: " + line1.getLength());
            System.out.println("Gradient (radians): " + line1.getGradient());

            line1.setBeginXY(0, 0);
            line1.setEndXY(3, 4);
            System.out.println("Updated Line: " + line1);
            System.out.println("Updated Length: " + line1.getLength());
            System.out.println("Updated Gradient: " + line1.getGradient());
        }
    }


