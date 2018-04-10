package project02.controller;

import project02.model.Sentence;
import project02.model.Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Controller {

    public void run() throws IOException {
        String text = readText();
        Text t = new Text(text);

        printSentences(t);
        t.sortSentencesByWordsCount();
        printSentences(t);

    }

    private void printSentences(Text t) {
        for(Sentence stc : t.getSentences()) {
            System.out.println(stc.toString());
        }
    }


    private String readText() throws IOException {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();

        String line;
        while((line = br.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }

}