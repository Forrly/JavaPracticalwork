package Move;
import java.lang.*;

public class MovableCircle extends MovablePoint implements Moveable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "center = ( " + this.center.x + ", " + this.center.y + " )" + ", top point = (" + this.center.x + ", " + (this.center.y + this.radius) + "), bottom point = (" + this.center.x + ", " + (this.center.y - this.radius) + "), right point = (" + (this.center.x + this.radius) + ", " + this.center.y + "), left point = (" + (this.center.x - this.radius) + ", " + this.center.y + ")";
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}