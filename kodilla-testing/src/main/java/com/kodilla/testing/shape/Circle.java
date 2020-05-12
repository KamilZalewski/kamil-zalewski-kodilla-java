package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private double circleRadius;

    public Circle(String shapeName, double circleRadius) {
        this.shapeName = shapeName;
        this.circleRadius = circleRadius;
    }
    @Override
    public String getShapeName(){
        return shapeName;
    }
    public double getCircleRadius() {
        return circleRadius;
    }
    @Override
    public double getArea(){
        double result = (circleRadius * circleRadius) * Math.PI;
        return result;
    }
}