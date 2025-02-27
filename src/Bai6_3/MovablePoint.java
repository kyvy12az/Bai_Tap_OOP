package Bai6_3;

public class MovablePoint  implements Movable{
    private int x;
    private  int y;
    private int xspeed;
    private int yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public String toString() {
        return "movablepoint{" +
                "x=" + x +
                ", y=" + y +
                ", xspeed=" + xspeed +
                ", yspeed=" + yspeed +
                '}';
    }

    @Override
    public void moveUp() {
        y-=yspeed;

    }

    @Override
    public void movedown() {
        y+=yspeed;

    }

    @Override
    public void moveleft() {
        x-=xspeed;

    }

    @Override
    public void moveright() {
        x+=xspeed;

    }
}
