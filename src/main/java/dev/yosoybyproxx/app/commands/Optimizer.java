package dev.yosoybyproxx.app.commands;

import dev.yosoybyproxx.app.utils.Config;
import dev.yosoybyproxx.app.utils.Console;
import dev.yosoybyproxx.app.utils.FileUtils;
import dev.yosoybyproxx.app.utils.applications.Microsoft;
import dev.yosoybyproxx.app.utils.applications.Minecraft;
import dev.yosoybyproxx.app.utils.applications.Spotify;
import dev.yosoybyproxx.app.utils.applications.TeamSpeak;
import dev.yosoybyproxx.app.utils.manager.Manager;

import java.io.File;

public class Optimizer {


    public static void clearCacheSv(String s) {
        // LOGS
        for (File f : FileUtils.getFile(s + "\\logs").listFiles()) {
            f.delete();
            f.deleteOnExit();
        }
        // WORLD PLAYER DATA
        for (File f : FileUtils.getFile(s + "\\world\\playerdata").listFiles()) {
            f.delete();
            f.deleteOnExit();
        }
        // WORLD STATS
        for (File f : FileUtils.getFile(s + "\\world\\stats").listFiles()) {
            f.delete();
            f.deleteOnExit();
        }

        for (File f : FileUtils.getFile(s + "\\plugins\\bStats").listFiles()) {
            f.delete();
            f.deleteOnExit();
        }

        FileUtils.deleteFile(s + "\\usercache.json");
        FileUtils.deleteFile(s + "\\banned-ips.json");
        FileUtils.deleteFile(s + "\\banned-players.json");
    }

    public static void clearCachePc() {
        String s = "C:\\Users\\" + System.getProperty("user.name");

        // LOCAL TEMP
        for (File f : FileUtils.getFile(s + "\\AppData\\Local\\Temp").listFiles()) {
            f.delete();
            f.deleteOnExit();
        }
        // EXPLORER
        for (File f : FileUtils.getFile(s + "\\AppData\\Local\\Microsoft\\Windows\\Explorer").listFiles()) {
            f.delete();
            f.deleteOnExit();
        }
        // WINDOWNS TEMP
        for (File f : FileUtils.getFile("C:\\Windows\\Temp").listFiles()) {
            f.delete();
            f.deleteOnExit();
        }
        // REPORTARCHIVE
        for (File f : FileUtils.getFile("C:\\ProgramData\\Microsoft\\Windows\\WER\\ReportArchive").listFiles()) {
            f.delete();
            f.deleteOnExit();
        }
        // RECLYCLE BIN
        for (File f : FileUtils.getFile("C:\\$RECYCLE.BIN").listFiles()) {
            f.delete();
            f.deleteOnExit();
        }
        // DATA STORE
        for (File f : FileUtils.getFile("C:\\Windows\\SoftwareDistribution\\DataStore\\Logs").listFiles()) {
            f.delete();
            f.deleteOnExit();
        }
        // NETWORK DOWNLOADER
        for (File f : FileUtils.getFile("C:\\ProgramData\\Microsoft\\Network\\Downloader").listFiles()) {
            f.delete();
            f.deleteOnExit();
        }
    }

    public static void clearCacheApps() {
        // SPOTIFY
        Spotify.deleteFile();
        // TEAMSPEAK
        TeamSpeak.deleteFile();
        // MICROSOFT EDGE
        Microsoft.deleteFile();
        // MINECRAFT
        Minecraft.deleteFile();
    }

    public static void command() throws Exception {
        Console.logList(Config.HELP_COMMANDS_OPTIMIZER);

        switch (Console.getNumber()) {
            case "1":
                Console.logList(Config.LIST_APPLICATION);
                clearCacheApps();
                Console.progressBar("Clearing the cache Apps", 50);
                command();
                return;
            case "2":
                clearCachePc();
                Console.progressBar("Clearing the cache", 50);
                command();
                return;
            case "3": {
                Console.log(Config.ENTER_LOCAL_HOST_SV_MC);
                String s = Console.getNumber();
                clearCacheSv(s);
                Console.progressBar("Clearing the Server(Minecraft) cache", 15);
                command();
                return;
            }
            case "4": {
                Console.logList(Config.LOCAL_HOST_CLEAR);
                switch (Console.getNumber()) {
                    case "1":
                        Console.log(Config.ENTER_LOCAL_HOST_SV_MC);
                        String s = Console.getNumber();
                        clearCacheSv(s);
                        clearCachePc();
                        clearCacheApps();
                        Console.progressBar("Applying optimizations", 80);
                        command();
                        return;
                    case "2":
                        clearCachePc();
                        clearCacheApps();
                        Console.progressBar("Applying optimizations", 80);
                        command();
                        return;
                    default:
                        Console.log(Config.NUMBER_LENGTH_NULL);
                        command();
                        break;
                }
                return;
            }
            case "0":
                Manager.loadCommands();
                return;
            default:
                Console.log(Config.NUMBER_LENGTH_NULL);
                command();
                break;
        }
    }
}
