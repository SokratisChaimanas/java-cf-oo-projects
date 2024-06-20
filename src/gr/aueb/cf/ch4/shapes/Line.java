package gr.aueb.cf.ch4.shapes;

import com.sun.source.doctree.SerialDataTree;

import java.io.Serializable;

public class Line extends AbstractShape implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private double length;

    public Line() {}

    public Line(long id, double length) {
        super(id);
        this.length = length;
    }

    // Clone Constructor
    public Line(Line line) {
        super(line.getId());
        this.length = line.getLength();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "id=" + getId() +
                "length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (getId() != line.getId()) return false;
        return Double.compare(getLength(), line.getLength()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp = Double.doubleToLongBits(getLength());
        result =  (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getId() ^ (getId() >>> 32));
        return result;
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line)super.clone();
    }
}
