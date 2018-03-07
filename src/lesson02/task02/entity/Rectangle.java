package lesson02.task02.entity;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(String shapeColor, int height, int width) {
        super(shapeColor);
        this.height = height;
        this.width = width;
    }

    @Override
    public int calcArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle: color = " + getShapeColor() + "; area = " + calcArea();
    }
}
