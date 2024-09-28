package com.epam.classes.modul1;

public class Line {
    private int k;
    private int b;
    public Line(int k, int b) {
        this.k=k;
        this.b=b;
    }
    public Point intersection(Line other) {
        if (k == other.k){
            if (b == other.b){
                return null;
            }
            else {
                return null;
            }
        }
        int x = (other.b - this.b)/(this.k - other.k);
        int y = other.k * x + other.b;

        return new Point(x,y);
    }
}
