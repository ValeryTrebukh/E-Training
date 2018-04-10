package project02.model;


import java.util.regex.Pattern;

public class Word {

    private String word;

    Word(String word) {
        this.word = word;
    }

    static Pattern getPattern() {
        return Pattern.compile("[\\w\\-']+");
    }


    @Override
    public String toString() {
        return word;
    }
}
