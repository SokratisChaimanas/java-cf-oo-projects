package gr.aueb.cf.ch4.shapes;

public class Rectangle extends AbstractShape implements ITwoDimensional {
    private double width;
    private double height;

    public Rectangle () {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
