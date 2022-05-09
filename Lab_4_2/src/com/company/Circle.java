package com.company;

public class Circle extends Shape{

    double radius = 1.0f;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(getRadius(),2);
    }

    public double getParimeter(){
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() +
                "radius=" + radius +
                '}';
    }
}
