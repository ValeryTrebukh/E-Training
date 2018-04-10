package project02.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Helper {

    public static String getFileName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file location.");
        String path = sc.nextLine();

        while(!Files.exists(Paths.get(path))) {
            System.out.println("No such file exists. Enter valid file name or enter 'EXIT' to close application.");
            path = sc.nextLine();

            if(path.equals("EXIT")) {
                System.exit(0);
            }
        }
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
            //log fnf
        } catch (IOException e) {
            //log io
        }
        return sb.toString();
    }

}
