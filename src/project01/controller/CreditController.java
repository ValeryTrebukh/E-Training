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
                case 4:
                    chooseCredit();
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

    private void chooseCredit() {
        view.print("Enter Bank ID:");

        int bankId = Helper.requestInt();

        if(!model.checkId(bankId)) {
            view.print("No bank with such ID exists.");
            return;
        }

        view.print("Good choice!");

        view.print(model.getById(bankId).toString());

        view.print("Enter credit term (months):");

        int term = Helper.requestInt();

        int rate = model.calcRate(bankId, term);

        view.print("Your rate will be " + rate + "%");

        view.print("Enter required sum:");

        int amount = Helper.requestInt();

        int payment = model.calcMonthlyPayment(bankId, term, amount, rate);

        view.print("Your monthly payment will be $" + payment);

        view.print("Press 1 to confirm your order:");

        if(Helper.requestInt() == 1) {
            view.print("Your order was successfully submitted.");
        } else {
            view.print("Aborted. Returning to main menu.");
        }
    }
}
