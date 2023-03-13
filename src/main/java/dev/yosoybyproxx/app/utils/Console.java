package dev.yosoybyproxx.app.utils;


import java.util.List;
import java.util.Scanner;

public class Console {

    public static String getNumber() {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        return number;
    }

    public static System logList(List<String> s) {
        s.forEach(s1 -> {
            s1
                    .replace(",", "")
                    .replace("[", "")
                    .replace("]", "");
            System.out.printf("\n" + s1);
        });
        return null;
    }

    public static System log(String s) {
        System.out.print(s);
        return null;
    }

    public static char[] progressBar(String name, int time) throws java.lang.Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 100; i++) {
            sb.setLength(0);
            for (int j = 0; j < i; j++) {
                sb.append("▓");
            }
            Thread.sleep(time);
            Console.log(name + ": [" + String.format("%-100s", sb) + "] " + i + "%");
            Console.log("\r");
        }
        Console.log("\n");
        return new char[0];
    }
}
