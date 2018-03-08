package project01.model;

import project01.entity.Loan;
import project01.utils.Helper;

import java.util.Arrays;
import java.util.Comparator;

public class CreditModel {

    private Loan[] loans = Helper.getFromPredefinedList(10);

    public Loan[] getLoans() {
        return loans;
    }

    public Loan[] getByMinRate(int value) {
        if (value < 0) return new Loan[]{};

        int count = 0;
        for(Loan l : loans) {
            if(l.getMinRate()<=value) {
                count++;
            }
        }

        Loan[] result = new Loan[count];
        int i = 0;
        for(Loan l : loans) {
            if(l.getMinRate()<=value) {
                result[i++] = l;
            }
        }
        return result;
    }

    public Loan[] getByMaxAmount(int value) {
        if (value < 0) return new Loan[]{};

        int count = 0;
        for(Loan l : loans) {
            if(l.getMaxAmount()>=value) {
                count++;
            }
        }

        Loan[] result = new Loan[count];
        int i = 0;
        for(Loan l : loans) {
            if(l.getMaxAmount()>=value) {
                result[i++] = l;
            }
        }
        return result;
    }

    public Loan[] getByMaxTerm(int value) {
        if (value < 0) return new Loan[]{};

        int count = 0;
        for(Loan l : loans) {
            if(l.getMaxTerm()>=value) {
                count++;
            }
        }

        Loan[] result = new Loan[count];
        int i = 0;
        for(Loan l : loans) {
            if(l.getMaxTerm()>=value) {
                result[i++] = l;
            }
        }
        return result;
    }

    public int calcMonthlyPayment(int term, int amount, int rate) {

        return (int)((term/12.0*rate/100 + 1)*amount/term);
    }

    public void sortByMinRate() {
        Arrays.sort(loans, Comparator.comparing(Loan::getMinRate));
    }

    public void sortByMaxAmount() {
        Arrays.sort(loans, Comparator.comparing(Loan::getMaxAmount));
    }

    public void sortByMaxTerm() {
        Arrays.sort(loans, Comparator.comparing(Loan::getMaxTerm));
    }
}
