package project01.controller;

import project01.utils.Helper;
import project01.model.CreditModel;
import project01.view.CreditView;

public class CreditController {

    private CreditModel model;
    private CreditView view;

    public CreditController(CreditModel model, CreditView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        boolean exit = false;

        while(!exit) {

            view.printMainMenu();
            int input = Helper.requestInt();

            switch (input) {
                case 1:
                    view.print(model.getLoans());
                    break;
                case 2:
                    sort();
                    break;
                case 3:
                    search();
                    break;
                case 0:
                    exit = true;
                    view.print("Bye!");
                    break;
                default:
                    view.print("No such option in menu.");
                    break;
            }
        }
    }

    private void sort() {
        view.printSortMenu();
        int input = Helper.requestInt();

        switch (input) {
            case 1:
                model.sortByMinRate();
                view.print(model.getLoans());
                break;
            case 2:
                model.sortByMaxTerm();
                view.print(model.getLoans());
                break;
            case 3:
                model.sortByMaxAmount();
                view.print(model.getLoans());
                break;
            default:
                view.print("No such option available. Returning to main menu.");
                break;
        }
    }

    private void search() {
        view.printSearchMenu();
        int input = Helper.requestInt();

        switch (input) {
            case 1:
                view.print("Enter max rate.");
                view.print(model.getByMinRate(Helper.requestInt()));
                break;
            case 2:
                view.print("Enter min term.");
                view.print(model.getByMaxTerm(Helper.requestInt()));
                break;
            case 3:
                view.print("Enter min amount.");
                view.print(model.getByMaxAmount(Helper.requestInt()));
                break;
            default:
                view.print("No such option available. Returning to main menu.");
                break;
        }
    }
}
