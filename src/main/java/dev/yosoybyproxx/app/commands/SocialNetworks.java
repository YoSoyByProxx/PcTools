package dev.yosoybyproxx.app.commands;

import dev.yosoybyproxx.app.utils.Config;
import dev.yosoybyproxx.app.utils.Console;
import dev.yosoybyproxx.app.utils.manager.Manager;

public class SocialNetworks {
    public static void command() throws Exception {
        Console.logList(Config.SOCIAL_NETWORKS);
        Manager.loadCommands();
    }
}
