package by.home.behavioral.command;

public class SelectCommand implements by.home.behavioral.command.Command {

    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
