package by.home.behavioral.command;

public class InsertCommand implements by.home.behavioral.command.Command {

    private Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
