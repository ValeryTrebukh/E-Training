package project01.utils;

import project01.entity.Credit;

import java.util.Arrays;
import java.util.Scanner;

public class Helper {

    private static Credit[] credits = {
            new Credit("JPMorgan Chase Bank ", 12, 24, 10000, 25000, 5, 9, false),
            new Credit("Wells Fargo Bank    ", 36, 72, 20000, 50000, 3, 6, false),
            new Credit("Citibank            ", 24, 72, 5000, 35000, 4, 9, false),
            new Credit("Bank Of America     ", 18, 48, 10000, 30000, 5, 8, false),
            new Credit("Bank of New York    ", 12, 48, 15000, 30000, 6, 9, false),
            new Credit("Merrill Lynch       ", 18, 48, 25000, 55000, 4, 7, false),
            new Credit("Privat Bank         ", 24, 72, 1000, 5000, 30, 42, true),
            new Credit("Alfa Bank           ", 6, 24, 1000, 15000, 36, 44, true),
            new Credit("Raiffeisen Bank Aval", 12, 36, 2000, 20000, 35, 45, true)
    };


    public static Credit[] getFromPredefinedList(int size) {

        return Arrays.copyOf(credits, size> credits.length? credits.length:size);
    }


    public static int requestInt() {
        Scanner sc = new Scanner(System.in);

        int result = -1;

        try {
            result = sc.nextInt();
        } catch (Exception ignore) {
        }

        return result;
    }
}
