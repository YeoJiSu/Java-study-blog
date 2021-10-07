package com.bdobe;

public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public double getLength(){
        double length= (double) (2*radius*Math.PI);
        return length;
    }
    public void draw(){
        System.out.println(this.toString());
    }
    public float getArea(){
        float area = (float) (radius*radius*Math.PI);
        return area;
    }
    @Override
    public String toString(){
        String format = String.format("Circle, Area: %.2f, Length: %.2f",this.getArea(), this.getLength());
        return format;
    }
}
