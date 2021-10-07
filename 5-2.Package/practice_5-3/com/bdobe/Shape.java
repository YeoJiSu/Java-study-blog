package com.bdobe;

public abstract class Shape {
    private int lineColor;

    public int getLineColor() {
        return this.lineColor;
    }

    public abstract double getLength();

    public abstract float getArea();

    public abstract void draw();
}
