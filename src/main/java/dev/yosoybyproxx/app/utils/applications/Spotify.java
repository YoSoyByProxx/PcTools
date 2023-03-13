package dev.yosoybyproxx.app.utils.applications;

import dev.yosoybyproxx.app.utils.Config;
import dev.yosoybyproxx.app.utils.Console;
import dev.yosoybyproxx.app.utils.FileUtils;

import java.io.File;

public class Spotify {

    public static void deleteFile() {
        if (FileUtils.getFile("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Spotify\\Spotify.exe").exists()) {
            String s = "C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Local\\Spotify\\Storage";
            for (File f : FileUtils.getFile(s).listFiles()) {
                f.delete();
                f.deleteOnExit();
            }
        } else {
            Console.log(Config.SPOTIFY_NOT_EXIST);
        }
    }
}
