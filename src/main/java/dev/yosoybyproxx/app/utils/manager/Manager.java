package dev.yosoybyproxx.app.utils.manager;

import dev.yosoybyproxx.app.commands.*;
import dev.yosoybyproxx.app.utils.Config;
import dev.yosoybyproxx.app.utils.Console;

public class Manager {

    public static void loadCommands() throws Exception {
        Console.logList(Config.HELP_COMMANDS);
        switch (Console.getNumber()) {
            case "1":
                PcSpecifications.command();
                return;
            case "2":
                PcTester.command();
                return;
            case "3":
                Optimizer.command();
                return;
            case "4":
                SocialNetworks.command();
                return;
            case "0":
                Exit.command();
                return;
            default:
                Console.log(Config.NUMBER_LENGTH_NULL);
                loadCommands();
                break;
        }
    }
}



