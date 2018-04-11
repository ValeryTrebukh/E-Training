package project02;

import org.apache.log4j.Logger;
import project02.controller.Controller;

import java.io.IOException;

public class Main {

    private static Logger logger = Logger.getRootLogger();

    public static void main(String[] args) throws IOException {
        Controller controller = new Controller();

        logger.info("Application started");
        controller.run();
        logger.info("Application closed");
    }
}
