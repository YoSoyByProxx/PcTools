package dev.yosoybyproxx.app.utils.applications;

import dev.yosoybyproxx.app.utils.Config;
import dev.yosoybyproxx.app.utils.Console;
import dev.yosoybyproxx.app.utils.FileUtils;

import java.io.File;

public class TeamSpeak {

    public static void deleteFile() {
        if (FileUtils.getFile("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Local\\TeamSpeak 3 Client\\ts3client_win64.exe").exists()) {
            for (File delete : FileUtils.getFile("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\TS3Client\\cache").listFiles()) {
                delete.delete();
                delete.deleteOnExit();
            }
        } else {
            Console.log(Config.TEAMSPEAK_NOT_EXIST);
        }
    }
}
