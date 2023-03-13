package dev.yosoybyproxx.app.utils;

import java.util.Arrays;
import java.util.List;

public class Config {

    public static String BAR_HORIZONTAL = "==================================================";
    public static String BAR_VERTICAL = " | ";

    public static String PREFIX = "PcTester -> ";

    public static String VERSION = "1.0.0-SNAPSHOT";

    public static String DISCORD = "discord.gg/nqdebBvcnm";
    public static String DISCORD_USER = "YoSoyByProxx#1026";
    public static String TWITTER = "twitter.com/YoSoyByProxx";
    public static String YOUTUBE = " www.youtube.com/@YoSoyByProxx";
    public static String TWITCH = "www.twitch.tv/yosoybyproxx";
    public static String TIK_TOK = "www.tiktok.com/@yosoybyproxx";
    public static String INSTAGRAM = "www.instagram.com/yosoybyproxx/";

    public static String NUMBER_LENGTH_NULL = PREFIX + "Enter a number\n";
    public static String ENTER_LOCAL_HOST_SV_MC = PREFIX + "Place the address of the folder where your Server is located\n";
    public static String MINECRAFT_NOT_EXIST = PREFIX + "Minecraft was not found skipped the process\n";

    public static String MICROSOFT_NOT_EXIST = PREFIX + "Microsoft was not found skipped the process\n";
    public static String SPOTIFY_NOT_EXIST = PREFIX + "Spotify was not found skipped the process\n";
    public static String TEAMSPEAK_NOT_EXIST = PREFIX + "TeamSpeak was not found skipped the process\n";


    public static List<String> WELCOME_MESSAGE = Arrays.asList(
            BAR_HORIZONTAL,
            "██████╗░░█████╗░████████╗░█████╗░░█████╗░██╗░░░░░░██████╗",
            "██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗██║░░░░░██╔════╝",
            "██████╔╝██║░░╚═╝░░░██║░░░██║░░██║██║░░██║██║░░░░░╚█████╗░",
            "██╔═══╝░██║░░██╗░░░██║░░░██║░░██║██║░░██║██║░░░░░░╚═══██╗",
            "██║░░░░░╚█████╔╝░░░██║░░░╚█████╔╝╚█████╔╝███████╗██████╔╝",
            "╚═╝░░░░░░╚════╝░░░░╚═╝░░░░╚════╝░░╚════╝░╚══════╝╚═════╝░\n",
            BAR_VERTICAL + "Welcome: " + System.getProperty("user.name"),
            BAR_VERTICAL + "Author: YoSoyByProxx",
            BAR_VERTICAL + "Version: " + Config.VERSION,
            BAR_VERTICAL + "Discord: " + Config.DISCORD + "\n",
            BAR_HORIZONTAL + "\n"
    );

    public static List<String> HELP_COMMANDS = Arrays.asList(
            BAR_HORIZONTAL,
            "                  Help Commands\n",
            " 1" + BAR_VERTICAL + "Pc Specifications",
            " 2" + BAR_VERTICAL + "Running the pc tester",
            " 3" + BAR_VERTICAL + "Optimizer",
            " 4" + BAR_VERTICAL + "Social Networks",
            " 0" + BAR_VERTICAL + "Close Program\n",
            BAR_HORIZONTAL + "\n"
    );

    public static List<String> SOCIAL_NETWORKS = Arrays.asList(
            BAR_HORIZONTAL,
            "                  SOCIAL NEWORKS\n",
            " Discord      " + BAR_VERTICAL + DISCORD,
            " Discord User " + BAR_VERTICAL + DISCORD_USER,
            " Twitter      " + BAR_VERTICAL + TWITTER,
            " Twitch       " + BAR_VERTICAL + TWITCH,
            " Tik Tok      " + BAR_VERTICAL + TIK_TOK,
            " Instagram    " + BAR_VERTICAL + INSTAGRAM,
            " Youtube      " + BAR_VERTICAL + YOUTUBE + "\n",
            BAR_HORIZONTAL + "\n"
    );

    public static List<String> HELP_COMMANDS_OPTIMIZER = Arrays.asList(
            BAR_HORIZONTAL,
            "                 Optimizer Commands",
            "            Remember that this may take some",
            "             time depending on your computer\n",
            " 1" + BAR_VERTICAL + "Clear applications cache",
            " 2" + BAR_VERTICAL + "Clear the PC cache",
            " 3" + BAR_VERTICAL + "Clearing the minecraft local host cache",
            " 4" + BAR_VERTICAL + "All Previous",
            " 0" + BAR_VERTICAL + "Back to Menu\n",
            BAR_HORIZONTAL + "\n"
    );

    public static List<String> LOCAL_HOST_CLEAR = Arrays.asList(
            BAR_HORIZONTAL,
            "               Do you want to clear the",
            "                cache of your minecraft",
            "                   server localhost\n",
            " 1 ▎ Yes",
            " 2 ▎ No\n",
            BAR_HORIZONTAL + "\n"
    );

    public static List<String> PC_TESTER_COMMAND = Arrays.asList(
            BAR_HORIZONTAL,
            "               The Pc will be tested,",
            "          please do not close the program\n",
            "        The results will be displayed after",
            "           the test has been completed.",
            "",
            BAR_HORIZONTAL + "\n"
    );

    public static List<String> LIST_APPLICATION = Arrays.asList(
            BAR_HORIZONTAL,
            "               Lists of supported applications ",
            "            that are available for clearing cache\n",
            BAR_VERTICAL + "Spotify",
            BAR_VERTICAL + "TeamSpeak",
            BAR_VERTICAL + "Internet Explorer",
            BAR_VERTICAL + "Microsoft Edge",
            BAR_VERTICAL + "Minecraft\n",
            BAR_HORIZONTAL + "\n"
    );

}
