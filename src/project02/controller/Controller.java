package project02.controller;

import project02.model.Sentence;
import project02.model.Word;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    public void run() throws IOException {
        String text = readText();

        List<String> sentences = getSentences(text);

        sentences.sort(Comparator.comparingInt(this::countWords));

        for(String s : sentences) {
            System.out.println(s);
        }
    }

    private List<String> getSentences(String text) {
        Pattern p = Sentence.getPattern();
        Matcher m = p.matcher(text);

        List<String> sentences = new ArrayList<>();

        while(m.find()) {
            sentences.add(m.group().replaceAll("\\t", " ").replaceAll("  +", " "));
        }
        return sentences;
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

    public int countWords(String sentence) {
        Pattern p = Word.getPattern();
        Matcher m = p.matcher(sentence);

        int count = 0;

        while(m.find()) {
            count++;
        }
        return count;
    }
}