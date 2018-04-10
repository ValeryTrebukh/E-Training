package project02.model;


public class Word {

    private String word;

    Word(String word) {
        this.word = word;
    }

    static String getRegex() {
        return "[\\w\\-']+";
    }


    @Override
    public String toString() {
        return word;
    }
}
