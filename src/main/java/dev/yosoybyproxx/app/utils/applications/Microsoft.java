package dev.yosoybyproxx.app.utils.applications;

import dev.yosoybyproxx.app.utils.Config;
import dev.yosoybyproxx.app.utils.Console;
import dev.yosoybyproxx.app.utils.FileUtils;

import java.io.File;

public class Microsoft {

    public static void deleteFile() {
        if (FileUtils.getFile("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe").exists()) {
            String s = "C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Local\\Microsoft\\Edge\\User Data\\Default\\";
            for (File delete : FileUtils.getFile(s + "Extension State").listFiles()) {
                delete.delete();
                delete.deleteOnExit();
            }
            for (File delete : FileUtils.getFile(s +"Session Storage").listFiles()) {
                delete.delete();
                delete.deleteOnExit();
            }
            for (File delete : FileUtils.getFile(s + "Sessions").listFiles()) {
                delete.delete();
                delete.deleteOnExit();
            }
            for (File delete : FileUtils.getFile(s + "Cache\\Cache_Data").listFiles()) {
                delete.delete();
                delete.deleteOnExit();
            }
        } else {
            Console.log(Config.MICROSOFT_NOT_EXIST);
        }
    }
}
