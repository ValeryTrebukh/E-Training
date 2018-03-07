package lesson02.task02.view;

import lesson02.task02.entity.Shape;

public class ShapeView {

    public void print(Shape[] shapes) {
        for(Shape sh : shapes) {
            System.out.println(sh.toString());
        }
        System.out.println();
    }


    public void print(int area) {
        System.out.println("Area = " + area);
        System.out.println();
    }
}
