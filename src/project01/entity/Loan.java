package project01.entity;

public class Loan {

    private int minAmount;
    private int maxAmount;

    private int minTerm;
    private int maxTerm;

    private int minRate;
    private int maxRate;

    private String bankName;

    private int id;

    private static int nextId = 1000;

    private boolean earlyRepayment;

    public Loan(String bankName, int minTerm, int maxTerm, int minAmount, int maxAmount, int minRate, int maxRate, boolean earlyRepayment) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.minTerm = minTerm;
        this.maxTerm = maxTerm;
        this.minRate = minRate;
        this.maxRate = maxRate;
        this.bankName = bankName;
        this.earlyRepayment = earlyRepayment;
        id = ++nextId;
    }

    @Override
    public String toString() {
        return id + "\t" + bankName + "\t" +
                "Loan term: " + minTerm + " Mo - " + maxTerm + " Mo\t" +
                "Available credit: $" + minAmount + " - $" + maxAmount + "\t" +
                "Loan rates: " + minRate + "% - " + maxRate + "%\t" +
                "E-Rep: " + (earlyRepayment ? "YES" : "NO");
    }

    public int getMinAmount() {
        return minAmount;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public int getMinTerm() {
        return minTerm;
    }

    public int getMaxTerm() {
        return maxTerm;
    }

    public int getMinRate() {
        return minRate;
    }

    public int getMaxRate() {
        return maxRate;
    }

    public String getBankName() {
        return bankName;
    }

    public int getId() {
        return id;
    }

    public boolean isEarlyRepayment() {
        return earlyRepayment;
    }
}
