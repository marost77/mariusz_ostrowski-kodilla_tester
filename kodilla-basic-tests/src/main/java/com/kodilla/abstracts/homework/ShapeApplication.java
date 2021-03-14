package com.kodilla.abstracts.homework;

public class ShapeApplication {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2,4);
        rectangle.perimeter();
        rectangle.area();

        Shape square = new Square(3);
        square.perimeter();
        square.area();

        Shape triangle = new Triangle(3,5);
        triangle.perimeter();
        triangle.area();

    }


}
