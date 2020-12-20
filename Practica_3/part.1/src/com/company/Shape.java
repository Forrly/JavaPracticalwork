package com.company;
import java.lang.*;

public abstract  class Shape {
    protected String color; //цвет
    protected boolean filled; //заполненный
    public Shape(){
        this.filled = false;
        this.color = "blue";
    }
    public Shape(String Color, boolean Filled){
        color = Color;
        filled = Filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String Color){
        color = Color;
    }
    public boolean IsFilled(){
        return filled;
    }
    public void setFilled(boolean Filled){
        filled = Filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();

}
