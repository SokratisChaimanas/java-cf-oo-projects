package gr.aueb.cf.ch3.set2;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {

    }

    public Point3D(int x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + getX() +
                ", " + getY() +
                ", " + z +
                ')';
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt((getX() * getX()) + (getY() * getY()) + (z * z));
    }
}
