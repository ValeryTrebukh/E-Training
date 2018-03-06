package lesson02.task01;

import lesson02.task01.controller.ClinicController;
import lesson02.task01.model.Clinic;
import lesson02.task01.model.ClinicImpl;
import lesson02.task01.view.ClinicView;


public class Main {
    public static void main(String[] args) {

        Clinic clinic = new ClinicImpl();
        ClinicView view = new ClinicView();

        ClinicController controller = new ClinicController(clinic, view);
        controller.run();
    }
}
