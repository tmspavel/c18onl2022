package behavioral.command;

public class Developer {

    private final behavioral.command.Command insert;
    private final behavioral.command.Command select;
    private final behavioral.command.Command delete;
    private final behavioral.command.Command update;

    public Developer(behavioral.command.Command insert, behavioral.command.Command select, behavioral.command.Command delete, behavioral.command.Command update) {
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
