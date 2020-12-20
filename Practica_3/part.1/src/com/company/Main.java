package com.company;

public class Main {

    public static void main(String[] args) {


        Circle s1 = new Circle(5.5, "RED", false); // Невозможно создать экземпляр абстрактного класса замена Shape на Circle
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.IsFilled());
        System.out.println(s1.getRadius());

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.IsFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); //Невозможно создать экземпляр абстрактного класса

        Rectangle s3 = new Rectangle(1.0, 2.0, "RED", false); // Невозможно создать экземпляр абстрактного класса замена Shape на Rectangle
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Square s4 = new Square(6.6);  //Невозможно создать экземпляр абстрактного класса  замена Shape на Square
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());//нет метода в Rectangle
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }
}
