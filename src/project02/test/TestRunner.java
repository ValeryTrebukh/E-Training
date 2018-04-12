package project02.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TextTest.class, SentenceTest.class);

        System.out.println("Success: " + result.wasSuccessful());

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }

}
