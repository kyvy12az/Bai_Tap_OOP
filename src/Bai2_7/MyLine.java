package Bai2_7;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Constructor với tọa độ (x1, y1) và (x2, y2)
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Constructor với hai đối tượng MyPoint
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getter và Setter cho begin
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // Getter và Setter cho end
    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Getter và Setter cho tọa độ x của begin
    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    // Getter và Setter cho tọa độ y của begin
    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    // Getter và Setter cho tọa độ x của end
    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    // Getter và Setter cho tọa độ y của end
    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    // Getter và Setter cho mảng tọa độ của begin
    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    // Getter và Setter cho mảng tọa độ của end
    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Tính độ dài đoạn thẳng
    public double getLength() {
        return begin.distance(end);
    }

    // Tính độ dốc của đoạn thẳng (gradient) theo radians
    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    // toString()
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }

}
