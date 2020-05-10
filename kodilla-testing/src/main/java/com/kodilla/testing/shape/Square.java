package com.kodilla.testing.shape;

public class Square implements Shape{
    private String shapeName;
    private double side;

    public Square(String shapeName, double side) {
        this.shapeName = shapeName;
        this.side = side;
    }
    @Override
    public String getShapeName() {
        return shapeName;
    }
    public String getSide() {
        return side;
    }
    public double getArea(){
        double result = side x side; //nie wiem jak się robi potęgę
        return result;
    }
}
