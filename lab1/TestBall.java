package laba1;
import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("blue", 2);
        Ball b2 = new Ball("red", 7);
        System.out.println(b1);
        b2.getArea();
    }
}
