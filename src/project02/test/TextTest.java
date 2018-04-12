package project02.test;

import org.junit.BeforeClass;
import org.junit.Test;
import project02.model.Sentence;
import project02.model.Text;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class TextTest {

    static List<Sentence> expSen;
    static List<Sentence> sortedSen;

    @BeforeClass
    public static void setUp() throws Exception {
        expSen = new ArrayList<>();
        expSen.add(TestData.sen1);
        expSen.add(TestData.sen2);
        expSen.add(TestData.sen3);
        expSen.add(TestData.sen4);

        sortedSen = new ArrayList<>();
        sortedSen.add(TestData.sen1);
        sortedSen.add(TestData.sen2);
        sortedSen.add(TestData.sen4);
        sortedSen.add(TestData.sen3);
    }

    @Test
    public void testParseText() {
        Text t = new Text(TestData.text);
        assertEquals(expSen.toString(), t.getSentences().toString());
    }


    @Test
    public void testSortSentencesByWordsCount() {
        Text t = new Text(TestData.text);
        t.sortSentencesByWordsCount();
        assertEquals(sortedSen.toString(), t.getSentences().toString());
    }
}
