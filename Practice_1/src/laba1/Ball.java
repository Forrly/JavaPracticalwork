package laba1;
import java.lang.*;

public class Ball {
    private int radius;
    private String color;

    public Ball(String color, int radius){
        this.color = color;
        this.radius = radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void getArea() {
        System.out.println("Area is "+3.14*radius*radius);
    }

    public String toString() {
        return "Radius is " + radius + ", color is " + color + ", area is " +3.14*radius*radius;
    }
}
