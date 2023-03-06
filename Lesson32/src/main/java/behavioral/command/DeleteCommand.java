package by.home.behavioral.command;

public class DeleteCommand implements by.home.behavioral.command.Command {

    private Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
