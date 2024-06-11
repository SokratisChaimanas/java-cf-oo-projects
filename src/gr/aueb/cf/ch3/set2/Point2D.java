package gr.aueb.cf.ch3.set2;

public class Point2D extends Point {
    private double y;

    Point2D() {

    }

    public Point2D(int x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + getX() +
                ", " + y +
                ')';
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt((getX() * getX()) + (y * y));
    }
}
