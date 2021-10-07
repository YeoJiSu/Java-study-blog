package com.bdobe;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width=width;
        this.height= height;
    }
    public double getLength(){
        double length = width+height;
        return length;
    }
    public void draw(){
        System.out.println(this.toString());
    }
    public float getArea(){
        float area = width*height;
        return area;
    }
    @Override
    public String toString(){
        String format = String.format("Rectangle, Area: %.2f, Length: %.2f",this.getArea(),this.getLength());
        return format;
    }

}
