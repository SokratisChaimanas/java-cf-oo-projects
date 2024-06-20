package gr.aueb.cf.ch4.shapes2;

import java.io.Serializable;

public class Circle extends AbstractShape implements ICircle, Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private double radius;

    public Circle() {}

    public Circle(long id, double radius) {
        super(id);
        this.radius = radius;
    }

    // Clone Constructor
    public Circle(Circle circle) {
        super(circle.getId());
        this.radius = circle.getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public long getCircumference() {
        return (long) (Math.PI * getDiameter());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + getId() +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        gr.aueb.cf.ch4.shapes.Circle circle = (gr.aueb.cf.ch4.shapes.Circle) o;

        if (getId() != circle.getId()) return false;
        return Double.compare(getRadius(), circle.getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp = Double.doubleToLongBits(getRadius());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getId() ^ (getId() >>> 32));
        return result;
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
