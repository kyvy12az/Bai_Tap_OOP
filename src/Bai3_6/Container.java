package Bai3_6;

public class Container {
	private int x1, y1, x2, y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    public int getX() { return x1; }
    public int getY() { return y1; }
    public int getWidth() { return x2 - x1; }
    public int getHeight() { return y2 - y1; }

    public boolean collides(Ball ball) {
        float ballX = ball.getX();
        float ballY = ball.getY();
        int radius = ball.getRadius();

        if (ballX - radius <= x1 || ballX + radius >= x2) {
            ball.reflectHorizontal();
            return true;
        }
        if (ballY - radius <= y1 || ballY + radius >= y2) {
            ball.reflectVertical();
            return true;
        }
        return false;
    }
    
    public boolean collidesWith(Ball ball) {
        boolean collided = false;
        
        // Kiểm tra va chạm với tường bên trái hoặc phải
        if (ball.getX() - ball.getRadius() <= this.x1 || 
            ball.getX() + ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            collided = true;
        }

        // Kiểm tra va chạm với tường trên hoặc dưới
        if (ball.getY() - ball.getRadius() <= this.y1 || 
            ball.getY() + ball.getRadius() >= this.y2) {
            ball.reflectVertical();
            collided = true;
        }

        return collided;
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
}
