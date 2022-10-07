package chapter17;

import java.util.Vector;

abstract class Shape{
    String color;
    String length;
    public Shape(){

    }
}

class Line extends Shape{
    public Line() {
        super();
    }
}

class Rect extends Shape{
    public Rect() {
        super();
    }
}

class Circle extends Shape{
    public Circle() {
        super();
    }
}

public class Exercises4 {
    public static void main(String[] args) {
        Vector<Shape> vector = new Vector<>();
        System.out.println();
    }
}
