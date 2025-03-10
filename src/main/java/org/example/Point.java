package org.example;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((this.x)*(this.x) + (this.y)*(this.y));
    }

    public double distance(Point P) {
        return Math.sqrt((this.x-P.x)*(this.x-P.x) + (this.y-P.y)*(this.y-P.y));
    }

    public double distance(int a, int b) {
        return Math.sqrt((this.x-a)*(this.x-a) + (this.y-b)*(this.y-b));
    }

}
