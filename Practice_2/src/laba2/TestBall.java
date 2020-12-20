package laba2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(20, 25);
        System.out.println(b1);
        b1.move(5, 10);
        System.out.println(b1);
    }
}
