package Move;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Moveable point = new MovablePoint(1,1,3,2);
        Moveable circle = new MovableCircle(1,1,6,8,2);
        Moveable rectangle = new MovableRectangle(1,1,-1,-1,2,3);
        point.moveUp();
        point.moveLeft();
        System.out.println(point.toString());
        circle.moveRight();
        circle.moveDown();
        System.out.println(circle.toString());
        rectangle.moveDown();
        rectangle.moveLeft();
        System.out.println(rectangle.toString());

    }
}
