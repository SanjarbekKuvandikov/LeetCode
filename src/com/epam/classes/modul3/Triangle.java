package com.epam.classes.modul3;

public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        if (a == null || b == null || c == null){
            throw new RuntimeException();
        }
        if (isCollinear(a,b,c)){
            throw new RuntimeException();
        }
        this.a = a;
        this.b = b;
        this.c = c;

    }
    private boolean isCollinear(Point p1, Point p2, Point p3) {
        return (p1.getX() * (p2.getY() - p3.getY()) +
                p2.getX() * (p3.getY() - p1.getY()) +
                p3.getX() * (p1.getY() - p2.getY())) == 0;
    }

    public double area() {
        return Math.abs(
                a.getX() * (b.getY() - c.getY()) +
                        b.getX() * (c.getY() - a.getY()) +
                        c.getX() * (a.getY() - b.getY())
        ) / 2.0;
    }

    public Point centroid(){
        double centroidX = (a.getX() + b.getX() + c.getX()) / 3;
        double centroidY = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(centroidX, centroidY);
    }
}
