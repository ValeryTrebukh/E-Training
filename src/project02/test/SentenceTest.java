package project02.test;

import org.junit.BeforeClass;
import org.junit.Test;
import project02.model.Sentence;
import project02.model.Word;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SentenceTest {

    static List<Word> expWords;

    @BeforeClass
    public static void setUp() throws Exception {
        expWords = new ArrayList<>();
        expWords.add(TestData.w1);
        expWords.add(TestData.w2);
        expWords.add(TestData.w3);
        expWords.add(TestData.w4);
    }

    @Test
    public void testParseSentence() {
        Sentence s = new Sentence(TestData.sen1.toString());
        assertEquals(expWords.toString(), s.getWords().toString());
    }
}
