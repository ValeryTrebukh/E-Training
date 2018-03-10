package project01.view;

import project01.entity.Credit;

public class CreditView {

    public void print(Credit[] credits) {
        if(credits == null || credits.length == 0) {
            System.out.println("No data matching request. Returning to main menu.");
            System.out.println();
            return;
        }

        for(Credit l : credits) {
            System.out.println(l.toString());
        }
        System.out.println();
    }


    public void print(String message) {
        System.out.println(message);
    }


    public void printMainMenu() {
        System.out.println("SELECT: 1 - SHOW ALL\t2 - SORT\t3 - SEARCH\t4 - ORDER CREDIT\t0 - EXIT");
    }


    public void printSortMenu() {
        System.out.println("SORT BY: 1 - MIN RATES\t2 - MAX TERM\t3 - MAX AMOUNT");
    }


    public void printSearchMenu() {
        System.out.println("SEARCH BY: 1 - MIN RATES\t2 - MAX TERM\t3 - MAX AMOUNT\t4 - EARLY REPAYMENT");
    }
}
