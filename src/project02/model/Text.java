package project02.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

    private List<Sentence> sentences;

    public Text(String text) {
        sentences = parseText(text);
    }

    private List<Sentence> parseText(String text) {
        Pattern p =Sentence.getPattern();
        Matcher m = p.matcher(text);
        List<Sentence> sentences = new ArrayList<>();

        while(m.find()) {
            Sentence sentence = new Sentence(
                    m.group().replaceAll("\\t", " ").replaceAll("  +", " "));

            sentences.add(sentence);
        }
        return sentences;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void sortSentencesByWordsCount() {
        sentences.sort(Comparator.comparingInt(a -> a.getWords().size()));
    }
}
