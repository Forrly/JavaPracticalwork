package com.company;
import java.lang.*;
import java.math.*;

public class Square extends Rectangle{
    protected double side;
    public Square(){
        this.filled = false;
        this.color = "blue";
        length = 1;
    }
    public Square(double side){
        this.width = width;
    }
    public Square(double side, String color, boolean filled){
        this.width = width;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public String toString() {
        return "Shape: Square, side: "+this.side+", width"+this.width+", length: "+this.length+" , color"+this.color;
    }
}

