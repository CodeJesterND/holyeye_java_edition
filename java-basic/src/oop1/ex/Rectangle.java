package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    int calculateArea() {
        return width * height;
    }

    boolean isSquare() {
        return width == height;
    }
}