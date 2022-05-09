package com.company;

public class Rectangle extends Shape{
    double width = 1.0f;
    double length = 1.0f;

    public Rectangle(){}
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return width*length;
    }
    public double getParimeter(){
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString() +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
