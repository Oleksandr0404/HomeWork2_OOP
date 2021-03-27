package curs.curs;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public double areaCircle() {
        return Math.PI * Math.pow(radius, 2);
    }
}


