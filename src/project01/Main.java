package project01;

import project01.controller.CreditController;
import project01.model.CreditModel;
import project01.view.CreditView;

public class Main {
    public static void main(String[] args) {

        CreditModel model = new CreditModel();
        CreditView view = new CreditView();
        CreditController controller = new CreditController(model, view);

        controller.run();
    }
}
