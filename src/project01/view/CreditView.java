package project01.view;

import project01.entity.Loan;

public class CreditView {

    public void print(Loan[] loans) {
        if(loans == null || loans.length == 0) {
            System.out.println("No data matching request. Returning to main menu.");
            System.out.println();
            return;
        }

        for(Loan l : loans) {
            System.out.println(l.toString());
        }
        System.out.println();
    }


    public void print(String message) {
        System.out.println(message);
    }


    public void printMainMenu() {
        System.out.println("SELECT: 1 - SHOW ALL\t2 - SORT\t3 - SEARCH\t4 - GET CREDIT\t0 - EXIT");
    }


    public void printSortMenu() {
        System.out.println("Show sorted by: 1 - min rates\t2 - max term\t3 - max amount");
    }


    public void printSearchMenu() {
        System.out.println("Search by: 1 - min rates\t2 - max term\t3 - max amount");
    }

    public void confirmationRequest() {
        System.out.println("Press 1 to confirm your order.");
    }
}
