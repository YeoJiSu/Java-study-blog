package com.bdobe;

public class Triangle extends Shape {
    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a =a; this.b=b; this.c=c;
    }
    public double getLength(){
        double length =  a + b + c;
        return length;
    }
    public void draw(){
        System.out.println(this.toString());
    }
    public float getArea(){
        float s=(a+b+c)/(float)2;
        float area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    @Override
    public String toString(){
        String format = String.format("Triangle, Area: %.2f, Length: %.2f",this.getArea(), this.getLength());
        return format;
    }
}
