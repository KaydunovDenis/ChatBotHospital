package by.jrr.chatbothospital.service;

public enum BotCommands {
    START("/start"),
    HELP("/help"),
    SETTINGS("/settings"),
    NONE("/none");

    String command;

    public String getCommand() {
        return command;
    }

    BotCommands(String command) {
        this.command = command;
    }
}
