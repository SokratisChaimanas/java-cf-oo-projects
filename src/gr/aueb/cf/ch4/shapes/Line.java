package gr.aueb.cf.ch4.shapes;

public class Line extends AbstractShape {
    private double length;

    public Line() {}

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
