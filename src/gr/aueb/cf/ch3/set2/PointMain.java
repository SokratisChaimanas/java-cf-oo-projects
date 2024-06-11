package gr.aueb.cf.ch3.set2;

import java.sql.SQLOutput;

public class PointMain {

    public static void main(String[] args) {
        Point p1D = new Point(5);
        Point p2D = new Point2D(1, 4);
        Point p3D = new Point3D(3, 5, 7);

        // Printing points using override toString()
        System.out.println(p1D);
        System.out.println(p2D);
        System.out.println(p3D);

        // Demonstration that the polymorphic method in JavaUtils works on the override methods
        System.out.println(PointUtil.distanceFromPoint(p1D) + " | " + p1D.getDistanceFromOrigin());
        System.out.println(PointUtil.distanceFromPoint(p2D) + " | " + p2D.getDistanceFromOrigin());
        System.out.println(PointUtil.distanceFromPoint(p3D) + " | " + p3D.getDistanceFromOrigin());
    }
}
