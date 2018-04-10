package project02.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {

    private String sentence;
    private List<Word> words;

    Sentence(String sentence) {
        this.sentence = sentence;
        words = initWords(sentence);
    }

    private List<Word> initWords(String sentence) {
        Pattern p = Pattern.compile(Word.getRegex());
        Matcher m = p.matcher(sentence);

        List<Word> words = new ArrayList<>();

        while(m.find()) {
            Word word = new Word(m.group().replaceAll("\\t", " ").replaceAll("  +", " "));
            words.add(word);
        }
        return words;
    }

    static String getRegex() {
        return "[A-Z][\\w\\s\\-,:;)(\\]\\[]+[.!?]+";
    }

    List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        return  sentence;
    }
}
