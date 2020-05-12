package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private String shapeName;
    private double base;
    private double height;

    public Triangle(String shapeName, double base, double height) {
        this.shapeName = shapeName;
        this.base = base;
        this.height = height;
    }
    @Override
    public String getShapeName(){
        return shapeName;
    }
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public double getArea(){
        double area = (base * height)/2;
        return area;
    }
}