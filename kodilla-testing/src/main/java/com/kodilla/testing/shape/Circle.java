package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private double circleRadius;

    public Circle(String shapeName, double circleRadius) {
        this.shapeName = shapeName;
        this.circleRadius = circleRadius;
    }
    public String getShapeName(){
        return shapeName;
    }
    public double getCircleRadius() {
        return circleRadius;
    }
    public Double getArea(){
        double result = (circleRadius x circleRadius) x 3.14;//nie wiem jak inaczej wstawić liczbę pi
        return result;
    }
}
