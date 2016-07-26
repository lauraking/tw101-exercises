package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float averageArea = 0;
        int totalArea = 0;

        for (Rectangle rectangle: rectangles) {
            totalArea += rectangle.area();
        }
        if (rectangles.length > 0) {
            averageArea = totalArea/rectangles.length;
        }
        return averageArea;
    }
}
