package com.company.karol;

public class CalculateShape {

    public static double lineLength(Point start, Point end){
        double xPow = Math.pow(end.getX()-start.getX(),2);
        double yPow = Math.pow(end.getY()-start.getY(),2);

        double xyPow = xPow + yPow;
        return Math.sqrt(xyPow);
    }

    public static double rectangleArea(Rectangle rectangle){
        Point p1 = rectangle.getP1();
        Point p2 = rectangle.getP2();
        Point p3 = rectangle.getP3();
        Point p4 = rectangle.getP4();

        double sideA = lineLength(p1,p2);
        double sideB = lineLength(p1,p4);

        return sideA * sideB;
    }


    public static boolean isPointInsideCircle(Circle circle, Point point) {
        double x = circle.getS().getX();
        double y = circle.getS().getY();
        double a = point.getX();
        double b = point.getY();
        double result = Math.pow((x-a), 2) + Math.pow((y-b), 2);
        double radiusPow = Math.pow(circle.getR(), 2);
        return result <= radiusPow;
    }

}

