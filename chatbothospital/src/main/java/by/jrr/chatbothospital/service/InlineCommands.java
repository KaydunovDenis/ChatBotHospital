package by.jrr.chatbothospital.service;

public enum InlineCommands {
    ONE("1)"),
    TWO("2)"),
    THREE("3)"),
    FOUR("4)"),
    FIVE("5)"),
    NONE("NONE");


    String command;

    public String getCommand() {
        return command;
    }

    InlineCommands(String command) {
        this.command = command;
    }
}

