package com.company;

public class Square extends Rectangle{

    public Square(){}
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return this.length;
    }
    public void setSide(double side){
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Squere{"  + super.toString();
    }
}
