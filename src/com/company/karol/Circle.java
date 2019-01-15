package com.company.karol;

public class Circle {

     private Point s;
     private double r;

    public Point getS() {
        return s;
    }

    public void setS(Point s) {
        this.s = s;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(Point s, double r) {
        this.s = s;
        this.r = r;
    }
}
