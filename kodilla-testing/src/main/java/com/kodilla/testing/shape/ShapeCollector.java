package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector implements Shape {
    private List<Shape> shapes = new ArrayList<>();
    public void addFigure(Shape shape) {
        shapes.add(shape);
    }
    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }
    public Shape getFigure(int n){
        shapes.get(n);
    }
    public Shape showFigures() {
        shapes.toArray();
    }
    public int getSize() {
        return shapes.size();
    }
    public String getShapeName(){
        //.....? nie wiem jak to rozwiązać
    }
    public double getArea(){
        //.....? nie wiem jak to rozwiązać
    }
}