package gr.aueb.cf.ch2.model;

public class Point {
    private int x;
    private int y;
    private int z;

    // Constructors
    public Point() {

    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    // Public APIs
    public String convertToString () {
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }

    public double getXYDistance() {
        return Math.sqrt(x * x + y * y);
    }

    public double getYZDistance() {
        return Math.sqrt(y * y + z * z);
    }

    public double getXZDistance() {
        return Math.sqrt(x * x + z * z);
    }

    public double getXYZDistance() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}
