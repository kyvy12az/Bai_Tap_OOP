package Bai2_7;

public class MyPoint {

    private int x = 0;
    private int y = 0;


    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }


    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }


    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }


    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }


    public double distance(Bai2_6.MyPoint another) {
        return distance(another.getX(), another.getY());
    }


    public double distance(MyPoint end) {
        return distance(0, 0);
    }
}



