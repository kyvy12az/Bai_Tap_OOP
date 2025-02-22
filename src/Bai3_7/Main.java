package Bai3_7;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0, 0);
        Player player1 = new Player(10, 2, 3);
        Player player2 = new Player(7, 10, 10);

        System.out.println(ball); // (0, 0, 0)
        System.out.println(player1); // Player 10 at (2, 3, 0)
        System.out.println(player2); // Player 7 at (10, 10, 0)

        player1.kick(ball); // Player 10 kicked the ball
        System.out.println(ball); // Ball moved

        player2.move(-5, -5);
        System.out.println(player2); // Moved closer

        player2.kick(ball); // Try kicking
    }
}