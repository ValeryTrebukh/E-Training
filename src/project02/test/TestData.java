package project02.test;

import project02.model.Sentence;
import project02.model.Word;


public class TestData {

    static Word w1 = new Word("Considering");
    static Word w2 = new Word("events");
    static Word w3 = new Word("as");
    static Word w4 = new Word("functions");

    static Sentence sen1 = new Sentence("Considering events as functions.");
    static Sentence sen2 = new Sentence("The use of events in software is nothing new.");
    static Sentence sen3 = new Sentence("Several sectors of the industry (banking," +
            "insurance, and finance) have used events to track the whole history of their activity.");
    static Sentence sen4 = new Sentence("From events, you can build nearly any projection of data you like.");


    static String text = "Considering  \tevents\t\tas\tfunctions." +
            "The\tuse\tof\tevents\tin\tsoftware\tis\tnothing\tnew.\tSeveral\tsectors\tof\tthe\tindustry\t(banking," +
            "insurance,\tand\tfinance)\thave\tused\tevents\tto\ttrack\tthe\twhole\thistory\tof\ttheir\tactivity. " +
            "From\tevents,\tyou\tcan\tbuild\tnearly\tany\tprojection\tof\tdata\tyou\tlike.";

}
