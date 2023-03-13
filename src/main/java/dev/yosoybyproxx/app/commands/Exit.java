package dev.yosoybyproxx.app.commands;

import dev.yosoybyproxx.app.utils.Console;

public class Exit  {

    public static void command() throws Exception {
        Console.progressBar("disabling pc tools", 15);
        System.out.close();
    }
}
