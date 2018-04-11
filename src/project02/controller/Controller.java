package project02.controller;

import project02.model.Text;
import project02.utils.Helper;
import project02.view.View;

public class Controller {

    private View view = new View();

    public void run() {
        Text text = new Text(Helper.readText());

        view.printSentences(text);

        text.sortSentencesByWordsCount();

        view.printSentences(text);
    }
}