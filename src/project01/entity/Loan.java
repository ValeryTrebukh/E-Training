package project01.entity;

public class Loan {

    private int minValue;
    private int maxValue;

    private int minTerm;
    private int maxTerm;

    private int minRate;
    private int maxRate;

    private String bankName;

    public Loan(String bankName, int minTerm, int maxTerm, int minValue, int maxValue, int minRate, int maxRate) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.minTerm = minTerm;
        this.maxTerm = maxTerm;
        this.minRate = minRate;
        this.maxRate = maxRate;
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return bankName + "\t" +
                "Loan term: " + minTerm + " Mo - " + maxTerm + " Mo\t" +
                "Available credit: $" + minValue + " - $" + maxValue + "\t" +
                "Loan rates: " + minRate + "% - " + maxRate + "%";
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
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
}
