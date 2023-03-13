package by.teachmeskills.javaEEPatterns.model;

public enum Commands {

    HOME_PAGE_COMMAND("start_page"),
    SIGN_IN_COMMAND("sign-in");


    private final String command;

    Commands(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}

