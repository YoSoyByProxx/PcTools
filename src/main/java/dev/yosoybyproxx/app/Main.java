package dev.yosoybyproxx.app;

import dev.yosoybyproxx.app.utils.Config;
import dev.yosoybyproxx.app.utils.Console;
import dev.yosoybyproxx.app.utils.manager.Manager;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {
        Console.progressBar("Loading", 50);
        Console.logList(Config.WELCOME_MESSAGE);

        Manager.loadCommands();
    }
}
