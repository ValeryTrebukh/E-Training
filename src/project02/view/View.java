package project02.view;

import project02.model.Sentence;
import project02.model.Text;

public class View {
    public void printSentences(Text t) {
        for(Sentence stc : t.getSentences()) {
            System.out.println(stc.toString());
        }
    }
}
