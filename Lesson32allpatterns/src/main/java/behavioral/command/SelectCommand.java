package behavioral.command;

public class SelectCommand implements behavioral.command.Command {

    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
