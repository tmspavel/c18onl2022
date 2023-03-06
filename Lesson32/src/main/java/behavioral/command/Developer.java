package by.home.behavioral.command;

public class Developer {

    private final by.home.behavioral.command.Command insert;
    private final by.home.behavioral.command.Command select;
    private final by.home.behavioral.command.Command delete;
    private final by.home.behavioral.command.Command update;

    public Developer(by.home.behavioral.command.Command insert, by.home.behavioral.command.Command select, by.home.behavioral.command.Command delete, by.home.behavioral.command.Command update) {
        this.insert = insert;
        this.select = select;
        this.delete = delete;
        this.update = update;
    }

    public void insertRecord() {
        insert.execute();
    }

    public void deleteRecord() {
        delete.execute();
    }

    public void updateRecord() {
        update.execute();
    }

    public void selectRecord() {
        select.execute();
    }
}
