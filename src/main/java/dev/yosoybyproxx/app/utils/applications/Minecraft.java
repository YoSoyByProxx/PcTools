package dev.yosoybyproxx.app.utils.applications;

import dev.yosoybyproxx.app.utils.Config;
import dev.yosoybyproxx.app.utils.Console;
import dev.yosoybyproxx.app.utils.FileUtils;

import java.io.File;

public class Minecraft {

    public static void deleteFile() {
        if (FileUtils.getFile("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\.minecraft").exists()) {

            String s = "C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\.minecraft\\";

            for (File f : FileUtils.getFile(s + "logs").listFiles()) {
                f.delete();
                f.deleteOnExit();
            }

            for (File f : FileUtils.getFile(s + "webcache2").listFiles()) {
                f.delete();
                f.deleteOnExit();
            }

            FileUtils.deleteFile(s + "launcher_log.txt");
            FileUtils.deleteFile(s + "launcher_cef_log.txt");
            FileUtils.deleteFile(s + "usercache.json");
            FileUtils.deleteFile(s + "usernamecache.json");
        } else {
            Console.log(Config.MINECRAFT_NOT_EXIST);
        }
    }
}
