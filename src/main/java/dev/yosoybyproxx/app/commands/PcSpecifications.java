package dev.yosoybyproxx.app.commands;

import dev.yosoybyproxx.app.utils.Console;
import dev.yosoybyproxx.app.utils.manager.Manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;

public class PcSpecifications {

    public static String Hwid() throws IOException, NoSuchAlgorithmException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(new String[]{ "wmic", "csproduct", "get", "UUID" });
        String result = null;
        InputStream is = process.getInputStream();
        Scanner sc = new Scanner(process.getInputStream());
        try {
            while (sc.hasNext()) {
                String next = sc.next();
                if (next.contains("UUID")) {
                    result = sc.next().trim();
                    break;
                }
            }
        } finally {
            is.close();
        }
        return (result == null) ? "unknown" : hexStringify(sha256Hash(result.getBytes()));
    }

    public static byte[] sha256Hash(byte[] data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        return messageDigest.digest(data);
    }

    public static String hexStringify(byte[] data) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte singleByte : data)
            stringBuilder.append(Integer.toString((singleByte & 0xFF) + 256, 16).substring(1));
        return stringBuilder.toString();
    }

    public static void command() throws Exception {
        URL url = new URL("http://checkip.amazonaws.com");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String ip = bufferedReader.readLine();

        int mb = 1024 * 1024;
        Console.logList(Arrays.asList(
                "==================================================",
                "               PC Specifications",
                " ▎ Ram: " + Runtime.getRuntime().maxMemory() / mb + "MB",
                " ▎ Cpu: " + Runtime.getRuntime().availableProcessors(),
                " ▎ Cpu Name: " + System.getenv("PROCESSOR_IDENTIFIER"),
                " ▎ Os: " + System.getProperty("os.name"),
                " ▎ Os Version: " + System.getProperty("os.version"),
                " ▎ Os Arch: " + System.getProperty("os.arch"),
                " ▎ Java Version: " + System.getProperty("java.version"),
                " ▎ IP: " + ip,
                " ▎ HWID: " + Hwid(),
                "",
                "==================================================\n"
        ));
        Manager.loadCommands();
    }
}
