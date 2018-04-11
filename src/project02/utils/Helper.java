package project02.utils;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Helper {

    private static Logger logger = Logger.getRootLogger();

    public static String getFileName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file location.");
        String path = sc.nextLine();

        while(!Files.exists(Paths.get(path))) {
            System.out.println("No such file exists. Enter valid file name or enter 'EXIT' to close application.");
            path = sc.nextLine();

            if(path.equals("EXIT")) {
                logger.info("User typed 'exit' command. Application closed.");
                System.exit(0);
            }
        }
        logger.info("File to read: " + path);
        return path;
    }

    public static String readText() {

        BufferedReader br;
        StringBuilder sb = new StringBuilder();
        String fileName = getFileName();
        try {
            br = new BufferedReader(new FileReader(fileName));

            String line;
            while((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (FileNotFoundException e) {
            logger.error("Requested file not found");
        } catch (IOException e) {
            logger.error("File reading error");
        }
        return sb.toString();
    }

}
