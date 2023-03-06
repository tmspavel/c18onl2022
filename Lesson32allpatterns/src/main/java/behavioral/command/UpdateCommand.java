package behavioral.command;

public class UpdateCommand implements behavioral.command.Command {

    private Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
