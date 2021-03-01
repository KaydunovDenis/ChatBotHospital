package by.jrr.chatbothospital.service;

public enum BotCommands {
    START("/start"),
    HELP("/help"),
    SETTINGS("/settings"),
    NONE("/none"),
    DOCTOR("/doctor");

    String command;

    public String getCommand() {
        return command;
    }

    BotCommands(String command) {
        this.command = command;
    }
}
