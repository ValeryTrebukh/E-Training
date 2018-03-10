package project01.model;

import project01.entity.Credit;
import project01.utils.Helper;

import java.util.Arrays;
import java.util.Comparator;

public class CreditModel {

    private Credit[] credits = Helper.getFromPredefinedList(10);

    public Credit[] getCredits() {
        return credits;
    }

    public Credit[] getByMinRate(int value) {

        if (value < 0) return new Credit[]{};

        int count = 0;

        for(Credit l : credits) {
            if(l.getMinRate()<=value) {
                count++;
            }
        }

        Credit[] result = new Credit[count];

        int i = 0;

        for(Credit l : credits) {
            if(l.getMinRate()<=value) {
                result[i++] = l;
            }
        }

        return result;
    }

    public Credit[] getByMaxAmount(int value) {

        if (value < 0) return new Credit[]{};

        int count = 0;

        for(Credit l : credits) {
            if(l.getMaxAmount()>=value) {
                count++;
            }
        }

        Credit[] result = new Credit[count];

        int i = 0;

        for(Credit l : credits) {
            if(l.getMaxAmount()>=value) {
                result[i++] = l;
            }
        }

        return result;
    }

    public Credit[] getByMaxTerm(int value) {

        if (value < 0) return new Credit[]{};

        int count = 0;

        for(Credit l : credits) {
            if(l.getMaxTerm()>=value) {
                count++;
            }
        }

        Credit[] result = new Credit[count];

        int i = 0;

        for(Credit l : credits) {
            if(l.getMaxTerm()>=value) {
                result[i++] = l;
            }
        }

        return result;
    }

    public Credit[] getWithEarlyRepayment() {

        int count = 0;

        for(Credit l : credits) {
            if(l.isEarlyRepayment()) {
                count++;
            }
        }

        Credit[] result = new Credit[count];

        int i = 0;

        for(Credit l : credits) {
            if(l.isEarlyRepayment()) {
                result[i++] = l;
            }
        }

        return result;
    }

    public void sortByMinRate() {
        Arrays.sort(credits, Comparator.comparing(Credit::getMinRate));
    }

    public void sortByMaxAmount() {
        Arrays.sort(credits, Comparator.comparing(Credit::getMaxAmount));
    }

    public void sortByMaxTerm() {
        Arrays.sort(credits, Comparator.comparing(Credit::getMaxTerm));
    }

    public Credit getById(int id) {
        for(Credit l : credits) {
            if (l.getId() == id)
                return l;
        }
        return null;
    }


    public int calcMonthlyPayment(int bankId, int term, int amount, int rate) {

        Credit credit = getById(bankId);

        amount = amount < credit.getMinAmount() ? credit.getMinAmount() : amount > credit.getMaxAmount() ? credit.getMaxAmount() : amount;

        return (int)(((term / 12.0 * rate / 100) + 1) * amount / term);
    }


    public int calcRate(int bankId, int term) {
        Credit credit = getById(bankId);

        term = term < credit.getMinTerm() ? credit.getMinTerm() : term > credit.getMaxTerm() ? credit.getMaxTerm() : term;

        double delta = 1.0 * (credit.getMaxRate() - credit.getMinRate()) / (credit.getMaxTerm() - credit.getMinTerm());

        return (int)(delta * (credit.getMaxTerm() - term) + credit.getMinRate());
    }


    public boolean checkId(int id) {
        return getById(id) != null;
    }


}
