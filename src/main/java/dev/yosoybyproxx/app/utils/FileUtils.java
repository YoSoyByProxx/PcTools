package dev.yosoybyproxx.app.utils;

import java.io.File;

public class FileUtils {

    public static File getFile(String s) {
        return new File(s);
    }

    public static File deleteFile(String s) {
        File delete = new File(s);
        delete.deleteOnExit();
        delete.delete();
        return delete;
    }
    public static System getSize(String s) {
        long size = new File(s).length();
        long mb = Math.toIntExact(size * (1024 / 1024));
        return Console.log("Have been delete " + mb + "Mb\n");
    }
}