package by.home.behavioral.command;

public class MainCommand {

    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new by.home.behavioral.command.InsertCommand(database),
                new by.home.behavioral.command.UpdateCommand(database),
                new by.home.behavioral.command.DeleteCommand(database),
                new by.home.behavioral.command.SelectCommand(database));
        developer.deleteRecord();
        developer.insertRecord();
        developer.selectRecord();
        developer.updateRecord();
    }

}
