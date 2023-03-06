package behavioral.command;

public class MainCommand {

    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new behavioral.command.InsertCommand(database),
                new behavioral.command.UpdateCommand(database),
                new behavioral.command.DeleteCommand(database),
                new behavioral.command.SelectCommand(database));
        developer.deleteRecord();
        developer.insertRecord();
        developer.selectRecord();
        developer.updateRecord();
    }

}
