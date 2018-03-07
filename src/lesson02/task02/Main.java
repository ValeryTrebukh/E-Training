package lesson02.task02;

import lesson02.task02.controller.ShapeController;
import lesson02.task02.model.ShapeModel;
import lesson02.task02.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        ShapeModel model = new ShapeModel();
        ShapeView view = new ShapeView();
        ShapeController controller = new ShapeController(model, view);

        controller.run();
    }
}
