package project02.model;

import java.util.regex.Pattern;

public class Sentence {

    private static String regex = "[A-Z][\\w\\s\\-,:;)(\\]\\[]+[.!?]+";

    private static Pattern pattern = Pattern.compile(regex);

    public static Pattern getPattern() {
        return pattern;
    }

    private Sentence() {

    }


}
