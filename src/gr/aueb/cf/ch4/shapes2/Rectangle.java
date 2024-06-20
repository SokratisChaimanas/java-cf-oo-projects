package gr.aueb.cf.ch4.shapes2;

import java.io.Serializable;

public class Rectangle extends AbstractShape implements IRectangle, Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(long id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
    }

    // Clone constructor
    public Rectangle(gr.aueb.cf.ch4.shapes.Rectangle rectangle) {
        super(rectangle.getId());
        this.width = rectangle.getWidth();
        this.height = rectangle.getHeight();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public long getCircumference() {
        return (long)(width * 2 + height * 2) ;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "id=" + getId() +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        gr.aueb.cf.ch4.shapes.Rectangle rectangle = (gr.aueb.cf.ch4.shapes.Rectangle) o;

        if (getId() != rectangle.getId()) return false;
        if (Double.compare(getWidth(), rectangle.getWidth()) != 0) return false;
        return Double.compare(getHeight(), rectangle.getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getWidth());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int)(getId() ^ (getId() >>> 32));
        return result;
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
