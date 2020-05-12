package com.kodilla.testing.shape;

import org.junit.Test;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle shape = new Circle("Circle", 4);
        //When
        shapeCollector.addFigure(shape);
        //Then
        assertEquals(1, shapeCollector.getSize());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle shape = new Circle("Circle", 4);
        shapeCollector.addFigure(shape);
        System.out.println(shapeCollector.getSize());
        //When
        shapeCollector.removeFigure(shape);
        //Then
        assertEquals(0,shapeCollector.getSize());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //zmienne Triangle to shapeName, base, height.
        Triangle shape = new Triangle("Triangle",3,5);
        shapeCollector.addFigure(shape);
        System.out.println(shapeCollector.getSize());
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        assertEquals(shape,result);
    }
}