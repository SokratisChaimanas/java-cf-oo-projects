package gr.aueb.cf.ch2;

import gr.aueb.cf.ch2.model.Point;

public class PointMain {

    public static void main(String[] args) {
        Point myPoint = new Point(3, 7, 5);

        System.out.println("My Point is: " + myPoint.convertToString());
        System.out.println("The distance between X and Y is: " + myPoint.getXYDistance());
        System.out.println("The distance between X and Z is: " + myPoint.getXZDistance());
        System.out.println("The distance between Y and Z is: " + myPoint.getYZDistance());
        System.out.println("The distance between X, Y and Z is: " + myPoint.getXYZDistance());
    }
}
