package project02.model;

import java.util.regex.Pattern;

public class Word {

    private static String regex = "[\\w\\-']+";

    private static Pattern pattern = Pattern.compile(regex);

    public static Pattern getPattern() {
        return pattern;
    }
}
