package com.kodilla.kodillacourse;

public class FirstClass {
    private String x;
    private int y;

    public FirstClass(String x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void test() {

    }

    @Override
    public String toString() {
        return "FirstClass{" +
                "x='" + x + '\'' +
                ", y=" + y +
                '}';
    }
}
