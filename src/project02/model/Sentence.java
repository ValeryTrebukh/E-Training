package project02.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {

    private String sentence;
    private List<Word> words;

    public Sentence(String sentence) {
        this.sentence = sentence;
        words = parseSentence(sentence);
    }

    private List<Word> parseSentence(String sentence) {
        Pattern p = Word.getPattern();
        Matcher m = p.matcher(sentence);

        List<Word> words = new ArrayList<>();

        while(m.find()) {
            Word word = new Word(m.group().replaceAll("\\t", " ").replaceAll("  +", " "));
            words.add(word);
        }
        return words;
    }

    static Pattern getPattern() {
        return Pattern.compile("[A-Z0-9][\\w\\s\\-,:;)(\\]\\[]+[.!?]+");
    }

    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        return  sentence;
    }
}
