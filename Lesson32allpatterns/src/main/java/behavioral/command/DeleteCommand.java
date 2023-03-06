package behavioral.command;

public class DeleteCommand implements behavioral.command.Command {

    private Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
