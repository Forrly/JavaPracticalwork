package com.company;
import java.lang.*;
import java.math.*;
public class Rectangle extends Shape{
    protected double length;//длина
    protected double width;//ширина
    public Rectangle(){
        this.filled = false;
        this.color = "blue";
        length = 1;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }
    @Override
    public String toString() {
        return "Shape: Rectangle, width: "+this.width+", length: "+this.length+" , color"+this.color;
    }
}
