package com.epam.classes.modul2;

public class Segment {
    private final Point start;
    private final Point end;

    public Segment(Point start, Point end){
        if (start == null || end == null) {
            throw new RuntimeException();
        }

        if (start.equals(end)) {
            throw new RuntimeException();
        }
        this.start = start;
        this.end = end;
    }

    double length() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    Point middle() {
        double midX = (start.getX() + end.getX()) / 2.0;
        double midY = (start.getY() + end.getY()) / 2.0;
        return new Point(midX, midY);
    }

    Point intersection(Segment another) {
        double x1 = start.getX();
        double y1 = start.getY();
        double x2 = end.getX();
        double y2 = end.getY();

        double x3 = another.start.getX();
        double y3 = another.start.getY();
        double x4 = another.end.getX();
        double y4 = another.end.getY();
        double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);

        if (denominator == 0) {
            return null;
        }

        double px = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / denominator;
        double py = ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / denominator;

        if (isBetween(x1, x2, px) && isBetween(y1, y2, py) &&
                isBetween(x3, x4, px) && isBetween(y3, y4, py)) {
            return new Point(px, py);
        }

        return null;
    }
    private boolean isBetween(double a, double b, double value) {
        return Math.min(a, b) <= value && value <= Math.max(a, b);
    }
}
